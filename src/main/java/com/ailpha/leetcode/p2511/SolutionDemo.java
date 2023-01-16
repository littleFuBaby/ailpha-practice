package com.ailpha.leetcode.p2511;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        int[] forts = new int[]{1,0,0,-1,0,0,0,0,1};
        System.out.println(solutionDemo.captureForts(forts));
        forts = new int[]{0,0,1,-1};
        System.out.println(solutionDemo.captureForts(forts));
        forts = new int[]{1,-1,-1,1,1};
        System.out.println(solutionDemo.captureForts(forts));
    }

    public int captureForts(int[] forts) {
        int preIndex = -1;
        int preMax = 0;
        for (int i=0; i<forts.length; i++) {
            int num = forts[i];
            if (num == 1 && preIndex == -1) {
                preIndex = i;
            } else if (num == -1 && preIndex != -1) {
                preMax = Math.max(preMax, i - preIndex - 1);
                preIndex = -1;
            }
        }
        int postIndex = -1;
        int postMax = 0;
        for (int j=forts.length - 1; j>=0; j--) {
            int num = forts[j];
            if (num == 1 && postIndex == -1) {
                postIndex = j;
            } else if (num == -1 && postIndex != -1) {
                postMax = Math.max(postMax, postIndex - j - 1);
                postIndex = -1;
            }
        }
        return Math.max(preMax, postMax);
    }
}
