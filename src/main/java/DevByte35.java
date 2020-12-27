/*
Subsequence
s = "abc", t = "aabbcc", return true.
Ex: Given the following strings s and t…

s = "cpu", t = "computer", return true.
Ex: Given the following strings s and t…

s = "xyz", t = "axbyc", return false.
 */


public class DevByte35 {


    public static boolean isSubsequence(String s, String t) {

        int index=0;

        for ( int i =0;i<t.length();i++){

            if (s.charAt(index) == t.charAt(i)){
                index++;
            }

            if (index==s.length())
                return true;

        }

        return false;


    }


    public static void main(String[] args){

        String s="abc";
        String t="aabbcc";

        System.out.println(isSubsequence(s,t));

    }

}
