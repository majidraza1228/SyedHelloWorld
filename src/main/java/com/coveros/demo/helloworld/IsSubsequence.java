package com.coveros.demo.helloworld;
/*Example 1:
        s = "abc", t = "ahbgdc"
        */

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        if (s.equals(""))
            return true;

        int index=0;

       for ( int i = 0; i<t.length();i++){

           if (t.charAt(i)==s.charAt(index))
               index++;
           }
           if (index>= s.length())
                return true;
           else
               return false;
  }

   public static void main(String[] args){

        System.out.print(isSubsequence("axc","ahbgdc"));

   }
}
