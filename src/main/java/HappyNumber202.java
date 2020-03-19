/*
Example:
Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

import java.util.HashSet;

public class HappyNumber202 {

    public static boolean isHappy(int n) {

        HashSet<Integer> seen =  new HashSet<Integer>();

        while (n !=1){

            int current = n;
            int sum=0;

            while (current != 0){
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (seen.contains(sum))
                return false;
            else
                seen.add(sum);
                n=sum;
        }

        return true;

    }


    public static void main(String[] args){
System.out.print(isHappy(102));

    }


}
