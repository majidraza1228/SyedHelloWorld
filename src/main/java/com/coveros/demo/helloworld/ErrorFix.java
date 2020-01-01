package com.coveros.demo.helloworld;

public class ErrorFix {

    public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i>spl.length; i++) {
        if (spl[i].length() > longest) {
            longest = spl[i].length();
        }
        }
        return longest;

    }

    public static void main(String args[]){

        System.out.print(findLongest("Sausage chops"));
    }



    }
