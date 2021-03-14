/*
https://leetcode.com/problems/consecutive-characters/
Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.

Return the power of the string.
Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 */

public class DevByte90 {


    public  static int maxPower(String s) {

        int count=0;
        int maxCount=0;
        char previous =' ';

        for ( int i =0;i <s.length();i++){
                char c = s.charAt(i);
            if (c == previous) {
                count++;
            } else {
                count =1;
                previous=c;
            }
            maxCount=Math.max(count,maxCount);
        }
            return maxCount;
    }

    public static void main(String[] args){

        String input= "abbcccddddeeeeedcba";

        System.out.println(maxPower(input));


    }
}
