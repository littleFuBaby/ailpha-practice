package com.ailpha.objectoriented.gc;

/**
 * G1 Garbage Collection
 * @author andy
 */
public class GarbageFirst {

    public static void main(String[]args){
        String str = "Garbage First";
        while(true){
            str += str;
        }
    }
}
