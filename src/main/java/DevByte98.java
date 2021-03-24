/*
https://leetcode.com/problems/daily-temperatures/


Given a list of daily temperatures T, return a list such that, for each day in the
input, tells you how many days you would have to wait until a warmer temperature.
If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DevByte98 {

    public static int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];
        int index =0;

        Queue<Integer> q = new LinkedList<>();

        for (int i : T){
            q.add(i);
        }

        while(! q.isEmpty()){

            int count =0;
            int k = q.peek();
            q.remove();

             for ( Integer item : q){

                 if (k< item) {
                     count++;
                     break;
                 } else if ( q.size()>2)
                             count++;
             }
             result[index++]=count;

        }
                return result;
    }
public static void main(String[] args){

        int[] input={73, 74, 75, 71, 69, 72, 76, 73};
        int[] result =dailyTemperatures(input);

        for ( int i : result)
                System.out.print(i+", ");

    }

}
