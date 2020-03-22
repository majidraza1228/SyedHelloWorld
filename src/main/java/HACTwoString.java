import java.util.HashSet;
import java.util.Set;

public class HACTwoString {

    // Complete the twoStrings function below.


    static String twoStrings(String s1, String s2) {

        Set<Character>  s1_set = new HashSet<>();
        Set<Character>  s2_set = new HashSet<>();

        for ( int i =0 ;i <s1.length();i++){
            s1_set.add(s1.charAt(i));
        }

        for ( int j=0;j<s2.length();j++){
            s2_set.add(s2.charAt(j));
        }

        s1_set.retainAll(s2_set);


        if (!s1_set.isEmpty())
            return "Yes";
        else
            return "No";

    }

    public static void main (String[] args)  {

System.out.println(twoStrings("Cat","bat"));
    }
}
