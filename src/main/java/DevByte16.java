/*
Valid Palindrome with Removal
 "abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
 */


public class DevByte16 {

    public static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;

    }


    public static void main(String[] args) {

        System.out.println(validPalindrome("abcba"));

    }


    public boolean isValidPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}