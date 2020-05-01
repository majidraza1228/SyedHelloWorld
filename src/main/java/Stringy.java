import java.util.Random;

public class Stringy {
    public static String stringy(int size) {
        // Your code here
          String s="1";

          if (size==1 || size==0)
             return s;

         for(int i = 2; i<=size; i++){
             if ( i % 2 == 0 )
                 s+="0";
             else
                 s+="1";

        }
         return s;
    }

    public static void main (String args[]){
        Random randGen = new Random();
        String k;

        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
             k = stringy(size);

           // System.out.print(stringy(size));
        }
        System.out.print(stringy(12));
    }


}
