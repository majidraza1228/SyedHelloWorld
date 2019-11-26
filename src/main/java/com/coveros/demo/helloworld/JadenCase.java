package com.coveros.demo.helloworld;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        String resultString="";


        if (phrase == null)
            return null;
        if (phrase.isEmpty())
                return "";



        String[] JadenArray = phrase.split(" ");

        int i=0;
        for (String UpperCase:JadenArray
             ) {
             UpperCase=   JadenArray[i];
            UpperCase = UpperCase.substring(0,1).toUpperCase()+UpperCase.substring(1,UpperCase.length());
            resultString=resultString+UpperCase+" ";
            i++;
        }

      /*  for (int i =0; i<JadenArray.length; i++)
        {
            String UpperCase=   JadenArray[i];
            UpperCase = UpperCase.substring(0,1).toUpperCase()+UpperCase.substring(1,UpperCase.length());
            resultString=resultString+UpperCase+" ";
        }*/

        return resultString.trim();

    }

    public static void main(String[] args){

       String  inputString ="this is my desk" ;

       System.out.print(toJadenCase(inputString));
    }
}
