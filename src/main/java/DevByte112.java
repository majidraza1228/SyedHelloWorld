/*
https://leetcode.com/problems/remove-outermost-parentheses

A valid parentheses string S is primitive if it is nonempty, and there does not exist a
way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive
decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses
strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
Example 1:

Input: "(()())(())"
Output: "()()()"
Explanation:
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

 */


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DevByte112 {

    public static String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();


        for ( int i = 0;i < S.length();i++){

            if ( stack.isEmpty()){
                set.add(i);
            }

            if (S.charAt(i)=='('){
                stack.push(S.charAt(i));
            }

            if (S.charAt(i) ==')'){
                stack.pop();
            }

            if ( stack.isEmpty()){
                set.add(i);
            }
        }

        StringBuilder  sb  = new StringBuilder();

        for ( int i = 0 ; i < S.length();i++){

            if (!set.contains(i)){
                sb.append(S.charAt(i));
            }

        }

        return sb.toString();
    }

    public static void main(String[] args){

        String S="(()())(())";

        System.out.println(removeOuterParentheses(S));

    }
}
