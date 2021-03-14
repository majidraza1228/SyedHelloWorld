/*

Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and
return the new string.

Example 1:

Input: s = "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"
 */

import java.util.HashSet;
import java.util.Set;

public class DevByte66 {
    public static String removeVowels(String s) {

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for (int i =0; i <s.length();i++){
            if (!set.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){

        String testInput ="leetcodeisacommunityforcoders" ;

        System.out.println(removeVowels(testInput));

    }
}
