/*
https://leetcode.com/problems/backspace-string-compare/

844. Backspace String Compare

Given two strings S and T, return if they are equal when both are typed in
empty text editors. # means a backspace character.

Input: S = "ab#c", T = "ad#c"
Output: true
 */

import java.util.Stack;

public class DevByte85 {

    public static  boolean backspaceCompare(String S, String T) {

       return build(S).equals(build(T));
    }

    public static String build(String S) {

        Stack<Character>  stack = new Stack<>();

        for ( Character c : S.toCharArray()){

            if ( c!='#'){
                stack.push(c);
            }else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }

    public static void main(String[] args){

       System.out.println(backspaceCompare("ab#c","ad#c"));
    }

}
