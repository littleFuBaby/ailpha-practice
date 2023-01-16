package com.ailpha.leetcode.p2513;

import java.util.ArrayList;
import java.util.List;

public class SolutionDemo {

    public static void main(String[] args) {

        SolutionDemo solutionDemo = new SolutionDemo();

        System.out.println(solutionDemo.minimizeSet(2, 7, 1, 3));
        System.out.println(solutionDemo.minimizeSet(3, 5, 2, 1));
        System.out.println(solutionDemo.minimizeSet(2, 4, 8, 2));
    }


    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int index = 1;
        int num = 0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (num < uniqueCnt1 + uniqueCnt2) {
            if (index % divisor1 != 0 && arr1.size() < uniqueCnt1) {
                arr1.add(index);
                num++;
            } else if (index % divisor2 != 0 && arr2.size() <= uniqueCnt2) {
                arr2.add(index);
                num++;
            }
            index++;
        }
        System.out.println(arr1.size() + " " + arr2.size());
        return Math.max(arr1.get(uniqueCnt1 - 1), arr2.get(uniqueCnt2 - 1));
    }

}
