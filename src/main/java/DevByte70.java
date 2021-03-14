/*
Spreadsheet Column
Given a positive integer n, return its corresponding column title in an excel spreadsheet.

Ex: Given the following values for n...

n = 1, return “A”.
n = 2, return “B”.
n = 3, return “C”.
n = 26, return “Z”.
n = 27, return “AA”.
n = 28, return “AB”.
 */


public class DevByte70 {
    public static String columnTitle(int n) {

        StringBuilder title = new StringBuilder();

        while (n > 0){
                title.insert(0,(char)((((n-1))%26)+'A'));
                n=(n-1)/26;

        }

        return title.toString();

    }

    public static void main(String[] args){

        System.out.println(columnTitle(28));

    }


}
