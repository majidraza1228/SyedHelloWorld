/*

Word Length
Given a string, s, return the length of the last word.
Note: You may not use any sort of split() method.

Ex: Given the following string…

s = "The Daily Byte", return 4 (because "Byte" is four characters long).
 */

public class DevByte59 {

    public  static int lengthOfLastWord(String s) {

        int count=0;
        if ( s.length() ==0 || s==null) {
            return count;
        }
            for ( int i=s.length()-1;i>0;i--)  {
                if (s.charAt(i)==' ')
                    return count;
                else
                    count++;
            }
            return count;
    }

    public static void main(String[] args){

        String input ="The Daily Byte";
        System.out.println(lengthOfLastWord(input));
    }
}
