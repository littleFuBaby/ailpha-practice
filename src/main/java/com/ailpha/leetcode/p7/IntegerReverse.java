package com.ailpha.leetcode.p7;

public class IntegerReverse {

    /**
     * reverse number
     * @param x
     * @return
     */
    public int reverse(int x) {

        long num = x;
        if (num < 0) num = -num;

        String str = new StringBuffer(String.valueOf(num)).reverse().toString();

        long newNum = Long.parseLong(str);
        if (num < 0) newNum = -newNum;

        if (newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) newNum;
    }

}
