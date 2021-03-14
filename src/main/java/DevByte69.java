/*
                    Add One
Given an array digits that represents a non-negative integer, add one to the number
 and return the result as an array.

Ex: Given the following digits...

digits = [1, 2], return [1, 3].
Ex: Given the following digits...

digits = [9, 9], return [1, 0, 0].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevByte69 {
    public static  int[] addOne(int[] digits) {

        for ( int i = digits.length-1;i>0;i--){
            if (digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] results = new int[digits.length+1];
        results[0]=1;

        return results;

    }

    public static void main(String[] args){

        int[] test ={9,9};

       int[] result = new int[3];
                result= addOne(test);

      for(int i : result)
          System.out.println(i);
    }


}
