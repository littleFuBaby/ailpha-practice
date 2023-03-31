package com.ailpha.owndb.sqlSessionFactory;

import com.ailpha.owndb.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * 1,get SqlSessionFactory and SqlSession object<br>
 * 2,close SqlSession connection<br>
 * 3,rebuild SqlSessionFactory
 * @author ys
 *
 */
public class MyBatisSqlSessionFactory {
	
	/**
	 * Define logger
	 */
	private static Logger logger = LoggerFactory.getLogger(MyBatisSqlSessionFactory.class);
	
	/**
	 * Define MyBatis-config.xml path
	 * JVM read from classPath
	 */
	private static String MYBATIS_CONFIG = "mybatis-config.xml";
	
	/**
	 * Define inputStream to read mybatis-config.xml file
	 */
	private static InputStream is = null;
	
	/**
	 * Define sqlSessionFactory object
	 */
	private static SqlSessionFactory sqlSessionFactory = null;
	
	/**
	 * Ensure sqlSessionFacoty object is not null
	 */
	static{
		rebuildSqlSessionFactory();
	}
	
	/**
	 * Define local thread to save SqlSession object
	 */
	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
	
	/**
	 * Rebuild sqlSessionFactory object
	 */
	public static void rebuildSqlSessionFactory(){
		try {
			if(sqlSessionFactory==null){
				is = Resources.getResourceAsStream(MYBATIS_CONFIG);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			}
		} catch (Exception e) {
			logger.error("rebuild SqlSessionFactory Exception", e);
		}finally{
			try {
				is.close();
			} catch (Exception e2) {
				logger.error("close inputStream", e2);
			}
		}
	}
	
	/**
	 * Get sqlSessionFactory object
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
	
	/**
	 * Get sqlSession object
	 * @return
	 */
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = threadLocal.get();
		if(sqlSession==null){
			if(sqlSessionFactory==null){
				rebuildSqlSessionFactory();
			}
			sqlSession = sqlSessionFactory.openSession();
			threadLocal.set(sqlSession);
		}
		return sqlSession;
	}
	
	/**
	 * Close SqlSession object
	 */
	public static void closeSqlSession(){
		SqlSession sqlSession = threadLocal.get();
		if(sqlSession!=null){
			sqlSession.close();
			threadLocal.remove();
		}
	}
	
	public static void main(String[] args) {
		// 1��
		// read mybatis-config.xml
		// sqlsessionFactory
		SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
		// 2��
		// sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3��set object
		User user = new User();
		user.setName("jackson");	
		int len = sqlSession.insert("org.fuys.owndb.vo.mapping.User.insert",user);
		logger.info("Result:{}",len);
		// 4��commit
		sqlSession.commit();
		// 5��close
		MyBatisSqlSessionFactory.closeSqlSession();
		
	}
	
}