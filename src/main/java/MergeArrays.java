import java.util.*;

public class MergeArrays {


    public static int[] mergeArrays(int[] first, int[] second) {

        List<Integer> list = new  ArrayList<Integer>();


        for( int i=0; i<=first.length-1;i++) {
             list.add(first[i]);
         }

        for (int j=0;j<=second.length-1;j++) {
            if (!list.contains(second[j]))
                list.add(second[j]);
        }

        Collections.sort(list);

        return toIntArray(list);
}
   public static int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }
public static void main (String[] args) {

        int a[] = {1,2,3,5,7,9};
        int b[] ={1,4,6,7,8,10};

        int[] abc = new int[10];

        abc =  mergeArrays(a,b);

       for (int i=0; i< abc.length; i++) {
           System.out.print(","+abc[i]);
    }

}

}

