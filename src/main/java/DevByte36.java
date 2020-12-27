/*

Reverse Vowels
This question is asked by Facebook. Given a string, reverse the vowels of it.
Note: In this problem y is not considered a vowel.

Ex: Given the following strings s…

s = "computer", return "cemputor"
Ex: Given the following strings s…

s = "The Daily Byte", return "The Dialy Byte"
 */


import java.util.HashSet;

public class DevByte36 {


    public static String reverseVowels(String s) {

        String vowelCharacters = "aeiouAEIOU";
        HashSet<Character> vowels = new HashSet<>();

        for (char c : vowelCharacters.toCharArray()) {
            vowels.add(c);
        }

        int i = 0;
        int j = s.length()-1;
        char[] characters = s.toCharArray();

        while (i < j) {

            while (i < j && (!vowels.contains(s.charAt(i)))) {
                i++;
            }

            while (i < j && (!vowels.contains(s.charAt(j)))) {
                j--;
            }

            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j++] = temp;

        }
        return new String(characters);
    }

    public static void main(String[] args){

        String s="computer";

        System.out.println(reverseVowels(s));
    }

}

