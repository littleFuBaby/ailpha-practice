package com.ailpha.leetcode.p2027;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        System.out.println(solutionDemo.minimumMoves("XXOX"));
    }

    public int minimumMoves(String s) {
        int head = 0, tail = 2, index = -1, num = 0;
        while (tail < s.length()) {
            String str = s.substring(head, tail + 1);
            if (tail == s.length() - 1 && str.indexOf("X") > -1) {
                index = tail;
                num++;
            } else if (head > index && str.indexOf("X") == 0) {
                index = tail;
                num++;
            }
            head++;
            tail++;
        }
        return num;
    }


}
