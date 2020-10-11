import java.util.HashMap;

public class DevByte4 {


    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for(char c: t.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                return c;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return ' ';
    }

    public static void main(String[] main){

        String s1   ="foobar";
        String s2   ="barfoot";

        System.out.println(findTheDifference(s1,s2));


    }
}
