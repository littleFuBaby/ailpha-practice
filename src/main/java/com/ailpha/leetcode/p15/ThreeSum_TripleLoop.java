package com.ailpha.leetcode.p15;

import java.util.*;

public class ThreeSum_TripleLoop {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        set.add(list);
                    }
                }
            }
        }
        return new LinkedList<>(set);
    }
}
