package com.ailpha.leetcode.p15;

import java.util.*;

public class ThreeSum_DoubleLoop_Map {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                Integer num = -nums[i] - nums[j];
                if (map.containsKey(num)) {
                    List<Integer> list = Arrays.asList(nums[i], num, nums[j]);
                    set.add(list);
                } else {
                    map.put(nums[j], null);
                }
            }
        }
        return new LinkedList<>(set);
    }
}
