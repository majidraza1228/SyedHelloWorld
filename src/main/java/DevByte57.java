/*
https://leetcode.com/problems/roman-to-integer/solution/
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Example 1:
Input: s = "III"
Output: 3
Example 2:

Input: s = "IV"
Output: 4
 */


import java.util.ArrayList;
import java.util.List;

public class DevByte57 {

    private static int minimumMove( int[] arr){

        int min_index=0;
        int min =arr[0];
        int resultMove=0;


        for ( int i = 1; i < arr.length;i++){
            if (arr[i] < min) {
                min_index = i;
                min = arr[i];
            }
        }

        if (min_index != 0 ) {
            int temp = arr[0];
            arr[0] = arr[min_index];
            arr[min_index] = temp;
            resultMove ++;
        }

        for (int cur =1; cur < arr.length-1;cur++){
            int pos = arr[cur]- arr[0];
            while(arr[pos] != arr[cur]){

                int temp = arr[pos];
                arr[pos] = arr[cur];
                arr[cur] = temp;
                resultMove++;
                pos = arr[cur]-arr[0];
            }
            cur = pos;
        }
        return resultMove;

    }

    public static int moves(List<Integer> arr) {
        // Write your code here

        int minMove=0;
        if ( arr.size() ==0){
            return minMove;
        }


        int[] primitive = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        minMove =   minimumMove(primitive);

        return minMove;

    }
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        int a = moves(intList);

        System.out.println(a);

    }

}
