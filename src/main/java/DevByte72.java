/*
https://leetcode.com/problems/defanging-an-ip-address/
1108. Defanging an IP Addres
Share : Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
 */

public class DevByte72 {

    public  static String defangIPaddr(String address) {

        StringBuilder sb =new StringBuilder();

        for ( int i =0; i <address.length();i++){

            if (address.charAt(i)=='.'){
               sb.append("["+address.charAt(i)+"]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args){

        System.out.println(defangIPaddr("255.100.50.0"));

    }
}
