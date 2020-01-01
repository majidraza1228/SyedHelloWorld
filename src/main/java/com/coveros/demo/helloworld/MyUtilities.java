package com.coveros.demo.helloworld;

public class MyUtilities {

    public static boolean isDigit(String s)
    {
        //return true or false

        if (s.length()==0)
            return false;

        try {
            double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
         return true;
        /*
        for (char c: s.toCharArray())
        {
            if (!Character.isDigit(c))
                    return false;
             }

            return true;

         */
            }




    public static void main(String[] args){

        System.out.print(isDigit("-234.4"));
    }
}
