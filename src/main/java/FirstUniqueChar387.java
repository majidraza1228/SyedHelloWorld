import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar387 {

    public static int firstUniqChar(String s) {

        Map<Character, Integer> unique =  new HashMap<Character,Integer>();

        for (int i =0;i <s.length();i++) {
          Character current = s.charAt(i);
        if (!unique.containsKey(current))  {
            unique.put(current,i);}
            else {
                unique.put(current,-1); }
        }
            int min = Integer.MAX_VALUE;

        for (char c: unique.keySet() ) {
            if (unique.get(c)>-1 && unique.get(c) <min)
                min = unique.get(c);

        }

        return min;

      }


    public static void main(String[] args){

        String s="loveleetcode";

        System.out.print(firstUniqChar(s));

    }

}
