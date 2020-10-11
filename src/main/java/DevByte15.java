/*
s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"
 */

import java.util.Stack;

public class DevByte15 {

  public static String removeDuplicate(String s){

      Stack<Character> stack = new Stack<Character>();
      StringBuilder result = new StringBuilder();

      for (char c: s.toCharArray()){

      if (!stack.isEmpty() && stack.peek()==c )
          stack.pop();
      else
          stack.push(c);
      }

      while (!stack.isEmpty()){

          result.append(stack.pop());
      }

      return result.reverse().toString();
  }

  public static void main(String[] args){

        System.out.println(removeDuplicate("foobar"));
  }

}
