/*
Word Length
Given a string, s, return the length of the last word.
Note: You may not use any sort of split() method.

Ex: Given the following string…

s = "The Daily Byte", return 4 (because "Byte" is four characters long).
 */


public class DevByte111 {
    public static int lengthOfLastWord(String s) {

        int count =0;

        String tirmedString = s.trim();

        for ( int i = tirmedString.length()-1;i>=0;i--){

            if (tirmedString.charAt(i)==' '){
                 break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args){

        for ( int i= 1;i< 15 ;i ++){

            if ( i%3==0 && i%5==0){

                System.out.println("FzzBuzz");
            } else if ( i%3==0) {
                System.out.println("Fzz");
            } else if ( i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
