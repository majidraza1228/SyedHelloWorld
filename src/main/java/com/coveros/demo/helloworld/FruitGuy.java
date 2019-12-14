package com.coveros.demo.helloworld;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitGuy {


    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket.length==0)
            return null;

   //     String[] removeRotten = new String[0];
        List<String> fruitBaskedArrayList = new ArrayList<String>(Arrays.asList(fruitBasket));

         if (fruitBaskedArrayList.isEmpty())
             return null;
        int counter =0;

        for (String s:fruitBasket
             ) {
            if (s.contains("rotten")){
                String NoRotten= s.substring(6,s.length());
                fruitBaskedArrayList.set(counter,NoRotten);
                counter++;

              }

        }

        return ConvertStringArray(fruitBaskedArrayList);
    }

    private static String[] ConvertStringArray(List<String> fruitBaskedArrayList) {
        String[] BasketArray = new String[fruitBaskedArrayList.size()];
        for( int j=0; j<fruitBaskedArrayList.size();j++){
            BasketArray[j] = (String) fruitBaskedArrayList.get(j).toLowerCase();
       }
    return BasketArray;

    }
public static void main(String[] args){
    String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};

    String[] abc = new String[rotten.length];

    abc = removeRotten(rotten);

  //  System.out.print(removeRotten(rotten));
}

}
