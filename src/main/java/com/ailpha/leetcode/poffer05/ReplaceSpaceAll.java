package com.ailpha.leetcode.poffer05;

public class ReplaceSpaceAll {

    public String replaceSpace(String s) {
        if (s == null) return null;
        return s.replaceAll(" ", "%20");
    }
}
