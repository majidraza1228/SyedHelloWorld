/*

String Validity
Given a string s that contains only the following characters: (, ), and *, where
asterisks can represent either an opening or closing parenthesis, return whether
or not the string can form a valid set of parentheses.

Ex: Given the following string s…

s = "*)", return true.
Ex: Given the following string s…

s = "(**)", return true.

Every time we see an opening parenthesis, we can increment our low and every time we see a
character that is not an opening parenthesis (i.e an asterisks or a closing parenthesis),
we can decrement our low. Similarly, every time we see a character that is not a closing
parenthesis, we can increment our high and otherwise, we can decrement our high. If our high
ever goes lower than zero, we can break from our loop immediately and otherwise, we can update
our low to be the maximum of low and zero. Once our loop ends, we can simply return whether
or not our low is zero (this will ensure we don’t only have a string with opening
parentheses).
 */

public class DevByte99 {

    public static boolean checkValidity(String s) {

        int low =0;
        int high=0;

        for ( char c : s.toCharArray()){
            low += c == '(' ?1:-1;
            high += c !=')' ?1:-1;

            if (high <0) {
                break;
            }

            low = Math.max(low,0);
        }

        return low==0;
    }


    public static void main(String[] args){


        System.out.println(checkValidity("*)"));

    }



}
