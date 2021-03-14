/*

1662. Check If Two String Arrays are Equivalent
Easy

298

74

Add to List

Share
Given two string arrays word1 and word2, return true if the two arrays represent
the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms
 the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevByte73 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        List<Character> list1 = new ArrayList<>();

        for (String s : word1) {
            for (char c : s.toCharArray())
                list1.add(c);
        }

        List<Character> list2 = new ArrayList<>();

        for (String s : word2) {
            for (char c : s.toCharArray())
                list2.add(c);
        }

        if (list1.size() != list2.size())
            return false;

        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
            else
                return true;

        }

        return true;

    }

    public static void main(String[] args){


    }


}
