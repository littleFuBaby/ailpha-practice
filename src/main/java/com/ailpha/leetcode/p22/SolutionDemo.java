package com.ailpha.leetcode.p22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionDemo {

    public List<String> generateParenthesis(int n) {
        return new ArrayList<String>(generateParenthesis(n, null));
    }

    public Set<String> generateParenthesis(int n, Set<String> set) {

        if (set == null) {
            set = new HashSet<String>();
        }

        // base case
        if (n == 1) {
            set.add("()");
            return set;
        }

        // recursive case
        generateParenthesis(n - 1, set);
        // add
        Object[] strArray = set.toArray();
        for (Object str : strArray) {
            // head and tail position add ()
            String s = str.toString();
            set.add("()".concat(s));
            set.add(s.concat("()"));
            // inner position add ()
            int head = 1;
            while (head < s.length()) {
                set.add(s.substring(0, head) + "()" + s.substring(head));
                head++;
            }
            // remove
            set.remove(s);
        }
        return set;

    }
}
