/*
s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
 */

import java.awt.*;
import java.util.Stack;

public class DevByte13 {

    public static  boolean validateStrings(String s1, String s2) {

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (char c : s1.toCharArray()) {

            if (c != '#')
                stack1.push(c);
            else if (!stack1.isEmpty())
                stack1.pop();

        }

        for (char c : s2.toCharArray()) {

            if (c != '#')
                stack2.push(c);
            else if (!stack2.isEmpty())
                stack2.pop();
        }

        if (stack1.size()!=stack2.size())
                return false;

        while (!stack1.isEmpty()){

            if (stack1.peek() == stack2.peek()) {
                stack1.pop();
                stack2.pop();
            }
        }
        if (stack1.isEmpty() && stack2.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(validateStrings("cof#dim#ng","code"));
    }
}


