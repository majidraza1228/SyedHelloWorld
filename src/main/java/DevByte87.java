/*
https://leetcode.com/problems/buddy-strings/

Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at a[i] and b[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
Example 1:

Input: a = "ab", b = "ba"
Output: true
Explanation: You can swap a[0] = 'a' and a[1] = 'b' to get "ba", which is equal to b.

 */

public class DevByte87 {

    public static boolean buddyStrings(String a, String b) {
     if (a.length() != b.length() )
         return false;

     int j = b.length();
     for ( int  i =0 ; i <a.length()-1;i++){

         char tempa = a.charAt(i);
         char tempb = b.charAt(--j);

         if (tempa != tempb)
             return false;

     }
        return true;

    }

    public static void main(String[] args){

        System.out.println(buddyStrings("ab","ab"));
    }

}
