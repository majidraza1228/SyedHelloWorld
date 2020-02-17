import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays2 {

    public static int[] mergeArrays(int[] first, int[] second) {
        Integer[] firstInteger = new Integer[first.length];
        for (int i=0;i<firstInteger.length;i++){
            firstInteger[i] =first[i];
        }
        Integer[] secondInteger = new Integer[second.length];
        for (int i=0;i<secondInteger.length;i++){
            secondInteger[i] =second[i];
        }
        List<Integer> firstList = Arrays.asList(firstInteger);
        List<Integer> secondList = Arrays.asList(secondInteger);
        List<Integer> result = new ArrayList();
        List<Integer> all = new ArrayList();
        all.addAll(firstList);
        all.addAll(secondList);
        for (int i=0;i<all.size();i++){
            if(!result.contains(all.get(i))){
                result.add(all.get(i));
            }
        }
        int[] res = new int[result.size()];
        for (int i=0;i<result.size();i++){
            res[i] =result.get(i).intValue();
        }
        Arrays.sort(res);
        return  res;
    }


    public static void main (String[] args) {

        int a[] = {1,2,3,5};
        int b[] ={1,4,6,0};

        int[] abc = new int[10];

        abc =  mergeArrays(a,b);

        for (int i=0; i< abc.length-1; i++) {
            System.out.print(","+abc[i]);
        }
}}
