/*
https://leetcode.com/problems/detect-capital/

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:

Input: "USA"
Output: True
 */

public class DevByte79 {


    public static boolean detectCapitalUse(String word) {

        for ( int i =0; i < word.length();i++){

            if (!Character.isUpperCase(word.charAt(i))){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){

        String input ="USA";
        System.out.println(detectCapitalUse(input));
    }
}
