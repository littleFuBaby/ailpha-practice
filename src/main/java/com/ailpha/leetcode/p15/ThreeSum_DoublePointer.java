package com.ailpha.leetcode.p15;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum_DoublePointer {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int right = nums.length - 1;
            for (int left = i + 1; left < nums.length; left++) {
                if (left > i + 1 && nums[left] == nums[left - 1]) continue;
                while (left < right && nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
                if (left == right) break;
                if (nums[i] + nums[left] + nums[right] == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                }
            }
        }
        return list;
    }
}
