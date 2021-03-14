/*

Validate Characters
This question is asked by Google. Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false
 */

import java.util.Stack;

public class DevByte89 {

    public static boolean validateCharacters(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if ( c=='('  || c=='{' || c=='['){
                stack.push(c);}
                else if (c==')' && (stack.isEmpty() || stack.peek()!='(' ))
                     { return false;}
            else if (c==']' && (stack.isEmpty() || stack.peek()!='[' ))
                     { return false;}
            else if (c=='}' && (stack.isEmpty() || stack.peek()!='{' ))
                    { return false;}
            else {
                stack.pop();
            }

            }
            return stack.isEmpty();
        }


    public static void main(String[] args){

        String input = "(){}[]";

        System.out.println(validateCharacters(input));

    }
}
