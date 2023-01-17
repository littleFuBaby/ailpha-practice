package com.ailpha.leetcode.p136;

import java.util.TreeSet;

public class SingleNumberSet {

    /**
     * Get single number with tree set
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (treeSet.add(nums[i]) == false) {
                treeSet.remove(nums[i]);
            }
        }
        return treeSet.first();
    }


}
