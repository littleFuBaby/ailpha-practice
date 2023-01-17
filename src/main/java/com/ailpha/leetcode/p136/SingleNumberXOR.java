package com.ailpha.leetcode.p136;

public class SingleNumberXOR {

    /**
     * get single number with XOR
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }

}
