/*

Swap Words
Given a string s, reverse the words.
Note: You may assume that there are no leading or trailing whitespaces and each word within s is only separated by a single whitespace.

Ex: Given the following string s…

s = "The Daily Byte", return "Byte Daily The".
 */


public class DevByte48 {


    public static String swapWords(String s) {

        StringBuilder reversedWord = new StringBuilder();
        String[] totalWords = s.split(" ");

        for ( int i = totalWords.length-1;i>=0;i--){
            reversedWord.append(totalWords[i]+ " ");
        }
        return reversedWord.toString();
    }

    public static void main(String[] args){

String s="The Daily Byte";

System.out.println(swapWords(s));
    }

}
