package com.ailpha.leetcode.p1759;

public class SolutionDemo2 {

    public static void main(String[] args) {

        String[] str1 = "234233".split("(()+)|");
        System.out.println(str1.length);
        for (String s : str1) {
            System.out.print(s + " =");
        }

        String[] str = "abcdfifjabcabcdfkabcabckgflh".split("(abc)+");

        System.out.println(str.length);

        String[] strings1 = "123".split("\\d+");
        System.out.println(strings1.length);

        //String[] strings = "abbcccaa".split("[a-z]*");
        String[] strings = "abbcccaa".split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        System.out.println(strings.length);
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
