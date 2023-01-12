package com.ailpha.leetcode.p326;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(243));
    }

    public boolean isPowerOfThree(int n) {
        Double d = Math.log10(n) / Math.log10(3);
        return d % 1 == 0;
    }

}
