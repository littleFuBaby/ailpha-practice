package com.ailpha.leetcode.p1574;

import java.util.Arrays;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        //int[] arr1 = {1,2,3,10,4,2,3,5};
        //System.out.println(solutionDemo.findLengthOfShortestSubarray(arr1));
        int[] arr2 = {1,2,3};
        System.out.println(solutionDemo.findLengthOfShortestSubarray(arr2));
    }


    /**
     * @Remark 虽然以下方法，最终超时了，时间复杂度为O(N^3)，但是，就是需要训练这个思维挣扎的过程，这样才有深刻记忆
     * @param arr
     * @return
     */
    public int findLengthOfShortestSubarray(int[] arr) {

        int[] newArr = new int[arr.length];
        System.arraycopy(arr,0,newArr,0,arr.length);
        Arrays.sort(newArr);
        boolean judge = true;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != newArr[i]) {
                judge = false;
                break;
            }
        }
        if (judge) {
            return 0;
        }

        int min = arr.length;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int lastIndex = -1;
                boolean flag = true;
                for (int k=0; k<arr.length; k++) {
                    if (k >= i && k <= j) {
                        continue;
                    } else if (lastIndex == -1) {
                        lastIndex = k;
                        continue;
                    } else if (arr[lastIndex] > arr[k]) {
                        flag = false;
                        break;
                    }
                    lastIndex = k;
                }
                if (flag) {
                    min = Math.min(min, j - i + 1);
                }
            }
        }
        return min;
    }
}
