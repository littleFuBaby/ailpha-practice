package com.ailpha.leetcode.p1806;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reinitializePermutation(4));
    }

    public int reinitializePermutation(int n) {
        int[] perm = initialize(n);

        int j = 0;
        while (j++ < n) {
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) {
                    arr[k] = perm[k / 2];
                } else {
                    arr[k] = perm[n / 2 + (k - 1) / 2];
                }
            }
            perm = arr;
            if (compareArray(perm)) {
                return j;
            }
        }
        return 0;
    }

    public int[] initialize(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean compareArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i) {
                return false;
            }
        }
        return true;
    }
}
