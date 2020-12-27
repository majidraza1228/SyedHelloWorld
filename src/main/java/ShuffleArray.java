import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ShuffleArray {

   // Integer[] array = new Integer[] {1,2,3};

   // List<Integer>  listArray = Arrays.asList(array);



    public static void main(String[] arr){
        Random rgen = new Random();
        int size =3;
        int[] array = new int[size];

        for(int i=0; i <size; i++){
            array[i]= 1+i;
        }

        for (int i =0;i<array.length;i++){
            int randomPosition = rgen.nextInt(array.length);

            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        for ( int s: array)
            System.out.println(s);

        HashSet<Integer>  uniqueShuffle = new HashSet<Integer>();

        for ( int s: array)
               uniqueShuffle.add(s);






    }
}
