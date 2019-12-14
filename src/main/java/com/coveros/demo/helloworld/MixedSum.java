package com.coveros.demo.helloworld;

import java.util.Arrays;
import java.util.List;

public  class MixedSum {
    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {

int ListCount = 0;        
String ListValue;

     for( int i =0; i< mixed.size();i++){

        ListCount = ListCount+ Integer.parseInt(String.valueOf(mixed.get(i)));

        }
        
        
        return ListCount;
    }

    public static void main (String[] args){

        Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);

        int[] arr = {1, 2, 3, 18};
        int[] arr2 = new int[8];
        int[][] arr3 = { {1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10} };
        double d=7;

        String s = "Hello World";
        System.out.print(arr[0]);
        System.out.print(arr[arr2.length - 5]);
        System.out.print(s.charAt(arr.length));
        System.out.print(s.charAt(arr[3]));
        System.out.print(s.charAt(arr[5]));
        System.out.print(s.charAt(arr[1]));
        System.out.print(arr3[arr.length]);
        System.out.print(arr3[arr.length][1]);
        System.out.print(arr3.length);
     /*   System.out.print(arr3[0].length;
        System.out.print(arr3[1].length();
        System.out.print(s.length;
        System.out.print(s.charAt(s.indexOf(’H’));
        System.out.print(s.charAt(s.indexOf(’Q’));
        System.out.print(s.indexOf(’Q’);
        System.out.print(arr2[0];
        arr2 = arr;
        arr[0] = arr3[2][0] + arr3[3][0];
        arr[0] = (int) s.charAt(6);
        arr[0] = s.charAt(6);
        int j = 6.0;
        double d = 7;
        s += 'q';
        System.out.print( (s + ”Goodbye!”).length());
        s == ("Hello" + "World");
        s.equals("Hello" + "World");

*/
         System.out.print(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));

    }

}
