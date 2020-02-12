package com.coveros.demo.helloworld;

import java.util.ArrayList;
import java.util.List;

public class MulitpleofFiveThree {

    public static int mulitpleof(int number) {

        if (number < 3 )
            return 0;

        int mutipleofthree = (number / 3);
        int mulitpleoffive = (number / 5 );
        int countof3 =0;
        int countof5=0;
        List<Integer> multiple = new ArrayList<>();

        for (int i =0 ;i < mutipleofthree;i++){
                       countof3+=3;
            if (countof3<number)
                     multiple.add(countof3);
        }
        for (int i =0 ;i < mulitpleoffive;i++){
            countof5+=5;
            if (countof5<number)
                multiple.add(countof5);
        }
        //TODO: Code stuff here
             int sumofcount=0;

      for ( int i = 0; i < multiple.size();i++){
          sumofcount+=multiple.get(i);
      }

      return sumofcount;
    }
/*
int sum = 0;
     for(int i = 1; i < number; i++) {
       if(i % 3 == 0 || i % 5 == 0)
         sum += i;
     }
     return sum;
  }

 */
    public static void main(String[] args){

        int result = mulitpleof(19);

        System .out.println("Value of multiple is " + result);
    }

}
