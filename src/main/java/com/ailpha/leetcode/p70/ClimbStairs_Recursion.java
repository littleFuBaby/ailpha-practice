package com.ailpha.leetcode.p70;

public class ClimbStairs_Recursion {

    /**
     * climb stairs with recursion
     * Note:<br><br/>
     * Because it is high time complexity, this method shouldn't be used
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


}
