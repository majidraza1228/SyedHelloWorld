package com.coveros.demo.helloworld;

public class DRoot {
    public static int digital_root(int n) {
        // ...
/*
        if (n / 10 < 1)
            return n % 10;
        else
            return digital_root(n % 10 + digital_root(n / 10));
*/
        int sumDigit=0;
        char a;

        if (n>9) {
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                a = s.charAt(i);
                sumDigit = sumDigit + Integer.parseInt(String.valueOf(a));
            }

            return digital_root(sumDigit);
        }
           else {
                    return n;
        }



    }


   public static void main(String[] args) {

        int a=634;
        System.out.print(digital_root(a));
    }

}
