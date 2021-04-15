/*

Gift Card Codes
You are given a string S (that consists of only alphanumerical characters) and asked
 to reformat it into a gift card code. S has N dashes that separates the string into
 N + 1 groups of characters. Every gift card code needs to contain all uppercase
 characters and have exactly K characters in each group, except the first
 group (but the first group must have at least one character). Given S, reformat it into a gift card code and return the result.

Ex: Given the following values of S and K...

S = “49DkeDb39LXI”, K = 3, return "49D-KED-B39-LXI".
 */

public class DevByte118 {


    public static String giftCardCodes(String S, int K) {

        StringBuilder sb = new StringBuilder();

        int count =0;
        int i = S.length()-1;

        while (i >0){
            char current = Character.toUpperCase(S.charAt(i));

            if ( count ==K){
                sb.append("-");
                count =0;

            } else if (current=='-'){
                i --;
            }
            else {
                sb.append(current);
                count ++;
                i--;
            }


        }
   return sb.reverse().toString();
    }


    public static void main(String[] args){

System.out.println(giftCardCodes("9Dklsi3nsEKE92",3));
    }
}
