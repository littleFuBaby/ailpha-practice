package com.ailpha.leetcode.p11;

public class ContainerWithMostWater_DoubleLoop {

    public int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 0; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }


}
