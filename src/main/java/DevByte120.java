/*
Upside Down Number
Given an string, num that represents the string form of an integer, return whether
 or not the number looks the same when turned upside-down.

Ex: Given the following num...

num = “0”, return true.
Ex: Given the following num...

num = “96”, return true.
Ex: Given the following num...

num = “003821”, return false.

 */


import java.util.HashSet;
import java.util.Set;

public class DevByte120 {

    public static boolean upsideDownNumber(String num) {

        Set<String> valid = new HashSet<>();
        valid.add("00");
        valid.add("11");
        valid.add("88");
        valid.add("00");
        valid.add("69");
        valid.add("96");

        int i = 0;
        int j = num.length() - 1;

        while (i <= j) {
            if (!valid.contains(num.charAt(i++) + "" + num.charAt(j--))) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static void main (String[] args) {


        System.out.println(upsideDownNumber("69"));
    }
}