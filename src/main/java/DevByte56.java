import java.util.Stack;

/*
https://leetcode.com/problems/reverse-only-letters/

Input: "ab-cd"
Output: "dc-ba"

 */
public class DevByte56 {


    public static String reverseOnlyLetters(String S) {

        Stack<Character>  letters = new Stack<>();
        StringBuilder result = new StringBuilder();


        for ( char c : S.toCharArray()){
            if (Character.isLetter(c))
                letters.push(c);
        }

        for ( char c : S.toCharArray()){
            if (Character.isLetter(c))
                result.append(letters.pop());
            else
                result.append(c);

        }
            return result.toString();
    }

    public static void main (String[] args){

        System.out.println(reverseOnlyLetters("ab-cd"));

    }
}
