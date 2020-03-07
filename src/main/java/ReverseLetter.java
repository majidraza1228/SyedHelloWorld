/*
Given a string S, return the "reversed" string where all characters that
 are not a letter stay in the same place, and all letters reverse their
  positions.
Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
 */

public class ReverseLetter {
    public static String reverseOnlyLetters(String S) {

        char[] reversedString = S.toCharArray();

        int i = 0;
        int j = S.length() - 1;

        while (i < j) {
            while (i < j  && !Character.isLetter(S.charAt(i))) {
                i++;
            }
            while (j > i && !Character.isLetter(S.charAt(j))) {
                j--;
            }
                char temp = reversedString[i];
                reversedString[i++] = reversedString[j];
                reversedString[j--] = temp;
            }


        return new String(reversedString);
  }

   public static void main(String[] args) {

   String inputstring = "a-bC-dEf-ghIj";

   System.out.println(reverseOnlyLetters(inputstring));

   }

}
