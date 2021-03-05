
/*


 */

import java.util.HashMap;
import java.util.Map;

public class DevByte51 {

    public static int uniqueCharacter(String s){

        int unique = 0;

        Map<Character,Integer> count = new HashMap<>();

        for( char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for (Integer c : count.values()){
             if (c == 1)
                 unique++;
        }
        return unique;

    }


    public static void main(String[] args){

        String input = "abca";
        System.out.println(uniqueCharacter(input));
    }



}
