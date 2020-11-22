/*

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
 */


public class DevByte29 {

    public static String reverseString(String s){
        char[] characters  = new char[s.length()];

        int j=0;

        for ( int i = s.length()-1;i>=0;i--){

            characters[j++]=s.charAt(i);
        }

        return new String(characters);


    }

    public static void main(String[] args){

        System.out.println(reverseString("cat"));
    }

}
