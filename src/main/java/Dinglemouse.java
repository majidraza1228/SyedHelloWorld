import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Dinglemouse {

    public static int[] sort(final int array[]) {
        // Your code here
        if (array.length==0)
            return array;
        ArrayList  list = new ArrayList();

        for ( int i=0;i< array.length; i++){
            list.add(array[i]);
        }
         Collections.sort(list);

                return toIntArray(list);
    }

     public static int[] toIntArray(List<Integer> sortArray){
        int[] retArray = new int[sortArray.size()];

        for (int j=0; j<sortArray.size();j++){
            retArray[j]=sortArray.get(j);
        }

        return retArray;
     }

     public static void main (String[] args){
         int[] a ={1, 2, 3, 4};

         int[] b = sort(a);
          for (int k=0;k<b.length;k++)
              System.out.print(b[k]);
     }

}
