package com.ailpha.leetcode.p11;

public class ContainerWithMostWater_DoublePointer {

    public int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            maxArea = Math.max((j - i) * (height[i] < height[j] ? height[i++] : height[j--]), maxArea);
        }
        return maxArea;
    }

}
