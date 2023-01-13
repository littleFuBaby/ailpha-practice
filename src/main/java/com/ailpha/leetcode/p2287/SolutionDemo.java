package com.ailpha.leetcode.p2287;

import java.util.HashMap;
import java.util.Map;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        System.out.println(solutionDemo.rearrangeCharacters("ilovecodingonleetcode", "code"));
        System.out.println(solutionDemo.rearrangeCharacters("abcba", "abc"));
        System.out.println(solutionDemo.rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    public int rearrangeCharacters(String s, String target) {

        Map<Integer, Object> map = new HashMap<>();

        boolean flag = true;

        while (flag) {
            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                int index = 0;
                while (index < s.length()) {
                    index = s.indexOf(c, index);
                    if (index == -1) {
                        break;
                    }
                    if (!map.containsKey(index)) {
                        map.put(index, null);
                        break;
                    }
                    index++;
                }
                if (index == -1 || index >= s.length()) {
                    flag = false;
                    break;
                }
            }
        }
        return map.size() / target.length() ;
    }
}
