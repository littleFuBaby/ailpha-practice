package com.ailpha.leetcode.p1817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        int[][] logs = new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int k = 5;
        solutionDemo.print(logs, k);
        logs = new int[][]{{1, 1}, {2, 2}, {2, 3}};
        k = 4;
        solutionDemo.print(logs, k);
    }

    public void print(int[][] logs, int k) {
        int[] answer = findingUsersActiveMinutes(logs, k);
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < logs.length; i++) {
            set.add(logs[i][0] + "-" + logs[i][1]);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String str : set) {
            String id = str.substring(0, str.indexOf("-"));
            map.put(id, map.getOrDefault(id, 0) + 1);
        }

        Map<Integer, Integer> answerMap = new HashMap<>();
        for (String key : map.keySet()) {
            Integer num = map.get(key);
            answerMap.put(num, answerMap.getOrDefault(num, 0) + 1);
        }

        int[] answer = new int[k];
        for (Integer key : answerMap.keySet()) {
            Integer value = answerMap.get(key);
            answer[key - 1] = value;
        }

        return answer;

    }
}
