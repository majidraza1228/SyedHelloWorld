/*
This question is asked by Microsoft. Given an array of strings, return the
longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical
characters.

Ex: Given the following arrays...

["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"

 */

public class DevByte47 {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder longestCommonPrefix = new StringBuilder();
        int index=0;

        for (char c : strs[0].toCharArray()){
            for (int i =1;i <strs.length;i++){
                if (index >= strs[i].length() || c != strs[i].charAt(index)){
                    return  longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(c);
            index++;
        }

        return longestCommonPrefix.toString();

    }

    public static void main(String[] args){

        String[] input ={"colorado", "color", "cold"};

        System.out.println(longestCommonPrefix(input));

    }

}
