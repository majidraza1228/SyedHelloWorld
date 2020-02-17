import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSort<sortedString> {

    public static String twoSort(String[] s) {

        if (s.length == 0)
            return null;

        List<String> list = Arrays.asList(s);
        Collections.sort(list);
        String firstString = list.get(0);
        String WithAsterik = "";
        
        for (int i=0; i <firstString.length();i++){
            
            if (i!=firstString.length()-1)
                WithAsterik=   WithAsterik+firstString.charAt(i)+"***";
            else
                WithAsterik=   WithAsterik+firstString.charAt(i);
        }
        return WithAsterik.trim();

    }


    public static void main(String[] args){

        String[] test= {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};

      String newString =  twoSort(test);

      System.out.print(newString);

    }

}
