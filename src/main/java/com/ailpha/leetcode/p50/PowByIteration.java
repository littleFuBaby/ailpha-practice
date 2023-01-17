package com.ailpha.leetcode.p50;

public class PowByIteration {

    public double myPow(double x, int n) {
        double result = 1.0;
        double value = x;
        long times = n;
        if(times < 0){
            times = -times;
        }
        while(times > 0){
            if(times % 2 == 1){
                result *= value;
            }
            value *= value;
            times /= 2;
        }
        return n < 0 ? 1.0 / result : result;
    }

}
