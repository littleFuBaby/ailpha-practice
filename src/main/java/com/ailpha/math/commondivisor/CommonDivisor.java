package com.ailpha.math.commondivisor;

public class CommonDivisor {

    public static void main(String[] args) {
        CommonDivisor commonDivisor = new CommonDivisor();
        System.out.println(commonDivisor.gcd1(12, 16));
        System.out.println(commonDivisor.gcd2(12, 16));
        System.out.println(commonDivisor.gcd3(12, 16));
        System.out.println(commonDivisor.gcd1(16, 12));
        System.out.println(commonDivisor.gcd2(16, 12));
        System.out.println(commonDivisor.gcd3(16, 12));
        System.out.println(commonDivisor.gcd4(16, 12));
        System.out.println(commonDivisor.gcd1(6, 16));
        System.out.println(commonDivisor.gcd2(6, 16));
        System.out.println(commonDivisor.gcd3(6, 16));
        System.out.println(commonDivisor.gcd1(16, 6));
        System.out.println(commonDivisor.gcd2(16, 6));
        System.out.println(commonDivisor.gcd3(16, 6));
        System.out.println(commonDivisor.gcd4(6, 16));
        System.out.println(commonDivisor.gcd3(2, 2));
    }

    public int gcd4(int num1, int num2) {
        if (num1 < num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        return num2 == 0 ? num1 : gcd4(num2, num1 % num2);
    }

    public int gcd3(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            return -1;
        }
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }

    public int gcd2(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            return -1;
        }
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


    public int gcd1(int num1, int num2) {

        if (num1 <= 0 || num2 <= 0) {
            return -1;
        }

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num2; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }




}
