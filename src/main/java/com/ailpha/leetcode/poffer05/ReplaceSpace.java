package com.ailpha.leetcode.poffer05;

public class ReplaceSpace {

    public String replaceSpace(String s) {
        if (s == null) return null;
        return s.replace(" ", "%20");
    }
}
