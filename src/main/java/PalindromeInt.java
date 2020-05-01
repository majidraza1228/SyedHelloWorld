public class PalindromeInt {

    public static  boolean isPalindrome(int x) {

        String inputString = String.valueOf(x);
        int lengthInputString= inputString.length();

        for ( int i =0; i<=lengthInputString ;i++){
            char k = inputString.charAt(i);
            char l = inputString.charAt(lengthInputString-1);

           if (  k!=l)
                return false;
            else
                lengthInputString=lengthInputString-1;

        }
        return true;
    }

    public   static void main (String[] args) {

        int x =4104;

        System.out.print(isPalindrome(x));

    }

}


