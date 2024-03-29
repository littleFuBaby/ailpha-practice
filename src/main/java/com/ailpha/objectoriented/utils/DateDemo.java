package com.ailpha.objectoriented.utils;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.getTime());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(date.before(date));
		System.out.println(date.before(Calendar.getInstance().getTime()));
		
	}

}
