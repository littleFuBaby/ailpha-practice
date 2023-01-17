package com.ailpha.leetcode.p632;

import java.util.*;

public class SmallestRange {

    public int[] smallestRange(List<List<Integer>> nums) {

        /*
        [[-5,-4,-3,-2,-1,1],[1,2,3,4,5]]
        */

        Map<Integer, Integer> map = new TreeMap<>();
        Set<Integer> rowSet = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            for (Integer num : nums.get(i)) {
                if(map.containsKey(num) == false){
                    map.put(num, i);
                    rowSet.add(i);
                }
            }
        }


        // length
        int numsSize = rowSet.size();
        int mapSize = map.size();

        int head = 0, tail = 0;

        Set<Integer> keyset = map.keySet();
        Object[] objects = keyset.toArray();
        Integer a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
        for (Object obj : objects) {
            Integer number = (Integer) obj;
            Integer row = map.get(number);
            Set<Integer> tempset = new HashSet<>();
            while (tail < mapSize) {
                Integer newNumber = (Integer) objects[tail++];
                Integer newRow = map.get(newNumber);
                tempset.add(newRow);
                if (tempset.size() >= numsSize) {
                    if (newNumber - number < (long)b - (long)a
                            || (newNumber - number == b - a && a > number)) {
                        b = newNumber;
                        a = number;
                    }
                    break;
                }
            }
            head++;
            tail = head;
            if(head > mapSize - numsSize){
                break;
            }
        }

        return new int[]{a, b};
    }
}
