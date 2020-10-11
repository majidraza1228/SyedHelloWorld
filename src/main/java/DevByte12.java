/*/
"(){}[]", return true
"(({[]}))", return true
"{(})", return false

 */

import java.util.Stack;

public class DevByte12 {


    public static boolean validateCharacters(String s) {

        Stack<Character> stack = new Stack<Character>();

        for ( char c: s.toCharArray()){

            if (c=='(' || c=='{' || c=='[' ){
                    stack.push(c);
            } else if(c == ')' && (stack.isEmpty() || stack.peek() != '(')) {
                return false;
            } else if(c == ']' && (stack.isEmpty() || stack.peek() != '[')) {
                return false;
            } else if(c == '}' && (stack.isEmpty() || stack.peek() != '{')) {
                return false;
            }   else
                    stack.pop();
            }

        return true;

    }


    public static void main(String[] args){

        String input ="{(})";

        System.out.println(validateCharacters(input));
    }
}


