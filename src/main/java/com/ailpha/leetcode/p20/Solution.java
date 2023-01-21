package com.ailpha.leetcode.p20;

public class Solution {

    public boolean isValid(String s) {
        String newS = s;
        while (newS.indexOf("()") > -1 || newS.indexOf("{}") > -1 || newS.indexOf("[]") > -1) {
            newS = newS.replace("()", "").replace("{}", "").
                    replace("[]", "");
        }
        return newS.length() == 0;
    }

}
