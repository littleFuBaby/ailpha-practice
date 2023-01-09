package com.ailpha.leetcode.p6285;

import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {672579538,806947365,854095676,815137524};
        int k = 3;

        Solution solution = new Solution();
        System.out.println(solution.maxKelements(nums, 3));

    }


    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        for (int num : nums) {
            pq.offer(num);
        }

        long sum = 0;
        while (k-- > 0) {
            int max = pq.poll();
            sum += max;
            pq.offer((max + 2) / 3);
        }
        return sum;
    }

}
