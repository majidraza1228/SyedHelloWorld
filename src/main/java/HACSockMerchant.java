/*
John works at a clothing store. He has a large pile of socks that he must pair by color
 for sale. Given an array of integers representing the color of each sock, determine
 how many pairs of socks with matching colors there are.
For example, there are  socks with colors .
There is one pair of color  and one of color .
9
10 20 20 10 10 30 50 10 20
Sample Output

3

 */

import java.util.HashSet;
import java.util.Set;

public class HACSockMerchant {

    public static int sockMerchant(int n, int[] arr) {

        int pair_num = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i]))
                set.add(arr[i]);
            else {
                pair_num++;
                set.remove((arr[i]));
            }
        }
        return pair_num;
    }
public static void main(String[] args){

        int[] input ={10 ,20, 20 ,10 ,10 ,30 ,50 ,10 ,20};

        System.out.println(sockMerchant(9,input));


}

}



