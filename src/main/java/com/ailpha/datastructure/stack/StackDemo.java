package com.ailpha.datastructure.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // Stack
        // push()
        Stack<String> stack = new Stack<>();
        stack.push("0-andy");
        stack.push("1-andy");
        stack.push("2-andy");
        stack.push("3-andy");
        stack.push("4-andy");

        // search
        System.out.println("search 3-andy pos:" + stack.search("3-andy"));
        System.out.println("Stack Peek pos:" + stack.search(stack.peek()) + ",peek:" + stack.peek());

        // Enumeration
        Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // peek
        String topElement = stack.peek();
        System.out.println(topElement);
        System.out.println(" 3的位置 " + stack.search(3));

        // pop()
        int size = stack.size();
        System.out.println("original size:" + stack.size() + " --- stack:" + stack);
        for (int x = 0; x < size; x++) {
            System.out.println("pop:" + stack.pop());
            System.out.println("size:" + stack.size());
        }
    }
}
