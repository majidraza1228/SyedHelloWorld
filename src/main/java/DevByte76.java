/*
917. Reverse Only Letters
https://leetcode.com/problems/reverse-only-letters/

Given a string S, return the "reversed" string where all characters that are not a
letter stay in the same place, and all letters reverse their positions.

Example 1:
Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */

public class DevByte76 {

    public static String reverseOnlyLetters(String S) {

        int j = S.length()-1;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<S.length();++i){

            if (Character.isLetter(S.charAt(i))){
                    while(!Character.isLetter(S.charAt(j))){
                        j--;
                    }
                    sb.append(S.charAt(j--));
            } else {
                sb.append(S.charAt(i));
            }
        }

       return sb.toString();
    }

    public static void main(String[] args){

        String test ="a-bC";

        System.out.println(reverseOnlyLetters(test));

    }



}
