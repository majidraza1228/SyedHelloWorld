/*
Reverse String
This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”


 */

public class DevByte1 {

    public static String reverse(String s) {

        String reversed= "";

        for (int i=s.length()-1; i>=0;i--){

            reversed += s.charAt(i);
        }

    return reversed;

    }


    public static void main(String[] args){

        System.out.println(reverse("Cat"));
    }
}
