/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/

Given a string s, reverse the order of characters in each word within a sentence
while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 */

public class DevByte96 {
    public static String reverseWords(String s) {

         StringBuilder word = new StringBuilder();
         StringBuilder result = new StringBuilder();

        for (int i=0 ;i <s.length();i++){

            if( !(s.charAt(i)==' ')){
                word.append(s.charAt(i));
            } else
            {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
          return result.toString();
    }

    public static void main(String[] args){

        String s ="Let's take LeetCode contest";
        System.out.println( reverseWords(s));

    }
}
