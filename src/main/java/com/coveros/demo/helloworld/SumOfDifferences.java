package com.coveros.demo.helloworld;

import java.util.ArrayList;
import java.util.List;

public class SumOfDifferences {

  public static int  sumOfDifferences(int[] arr){

       int SumofArray = 0;
       int firstnumber;
       int secondnumber;

      if (arr.length==0 || arr.length==1)
          return 0;

      List<Integer> list = new ArrayList<Integer>();

      for ( int i =1 ; i <arr.length;i++) {
          firstnumber =arr[i-1];
          secondnumber= arr[i] ;

          list.add( firstnumber-secondnumber);

      }

      for ( int i = 0; i<list.size();i++){
          SumofArray= SumofArray+list.get(i);

      }
        return Math.abs(SumofArray);
  }

  public static void main(String[] args){

      int[] a ={ 4, 3, 5, 1, 2, 5, 2, 0, 5, 3, 2, 3, 2, 2};

      System.out.print(sumOfDifferences(a));
  }

}
