package com.ailpha.leetcode.p2488;

import java.util.Arrays;

public class SolutionDemo {

    public static void main(String[] args) {
        int[] nums = {3,2,1,4,5};
        SolutionDemo solutionDemo = new SolutionDemo();
        int num = solutionDemo.countSubarrays(nums, 4);
        System.out.println(num);
    }


    public int countSubarrays(int[] nums, int k) {

        int index = -1;
        for (int i=0; i<nums.length; i++) {
            if (k == nums[i]) {
                index = i;
                break;
            }
        }

        int num = 1;

        for (int j=index + 1; j<nums.length; j++) {
            int[] tempNums = new int[j - index + 1];
            System.arraycopy(nums, index, tempNums, 0, j - index + 1);
            if (isCorrect(tempNums, k)) {
                num++;
            } else {
                break;
            }
        }
        System.out.println(num);

        for (int k1=index - 1; k>=0; k--) {
            int[] tempNums = new int[index - k1 + 1];
            System.arraycopy(nums, k1, tempNums, 0, index - k1 + 1);
            if (isCorrect(tempNums, k)) {
                num++;
            } else {
                break;
            }
        }
        System.out.println(num);

        return num;

    }

    public boolean isCorrect(int[] nums, int k) {
        Arrays.sort(nums);
        int temp = 0;
        if (nums.length % 2 == 0) {
            temp = nums[nums.length / 2 - 1];
        } else {
            temp = nums[nums.length / 2];
        }
        return temp == k;
    }


}
