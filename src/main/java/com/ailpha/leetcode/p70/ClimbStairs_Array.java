package com.ailpha.leetcode.p70;

public class ClimbStairs_Array {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                array[i] = i + 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array[n - 1];
    }
}
