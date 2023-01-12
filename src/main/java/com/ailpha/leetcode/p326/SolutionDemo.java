package com.ailpha.leetcode.p326;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        System.out.println(solutionDemo.isPowerOfThree(243));
    }


    public boolean isPowerOfThree(int n) {
        Double d = Math.log(n) / Math.log(3);
        return d % 1 == 0;
    }
}
