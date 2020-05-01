import java.util.ArrayList;

public class oddCount {

    public static int oddCount(int n){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int count=0;

         for ( int i=0; i<=n; i++) {

             if ( i % 2 != 0) {
                   arrayList.add(i);
             }

         }
        return arrayList.size();
    }

    public static void main(String[] args){

        oddCount(26);

    }

}
