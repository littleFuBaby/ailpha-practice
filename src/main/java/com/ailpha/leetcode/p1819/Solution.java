package com.ailpha.leetcode.p1819;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDifferentSubsequenceGCDs(new int[]{1,3,4,6,8}));
    }


    public int countDifferentSubsequenceGCDs(int[] nums) {
        // 最大公约数不可能超出数组中的最大值
        int maxVal = Arrays.stream(nums).max().getAsInt();
        // 设定0到最大值的布尔数组
        boolean[] occured = new boolean[maxVal + 1];
        for (int num : nums) {
            occured[num] = true;
        }

        int ans = 0;
        for (int i = 1; i <= maxVal; i++) {
            // 设定该值，就是为了避免冗余把第一次计算加进去了
            int subGcd = 0;
            // 枚举0到最大值的所有可能
            for (int j = i; j <= maxVal; j += i) {
                if (occured[j]) {
                    if (subGcd == 0) {
                        subGcd = j;
                    } else {
                        // 求出最大公约数，j 也是数组中的数
                        subGcd = gcd(subGcd, j);
                    }
                    if (subGcd == i) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public int gcd(int num1, int num2) {
        while (num1 != 0) {
            int temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        return num2;
    }
}
