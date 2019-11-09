package com.coveros.demo.helloworld;

public class StringToArray {

    public  static String[] stringToArray(String s) {
        //your code;

        String[] tempArray;

        tempArray = s.split(" ");
        return  tempArray;

    }


    public  static void main(String[] args) {


        String s="Syed Majid Raza";
        String[] resultArray;
        resultArray= stringToArray(s);
    }
}
