/*
https://leetcode.com/problems/diet-plan-performance/
Example 1:

Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
Output: 0
Explanation: Since k = 1, we consider each element of the array separately and compare it to lower and upper.
calories[0] and calories[1] are less than lower so 2 points are lost.
calories[3] and calories[4] are greater than upper so 2 points are gained.
 */

public class DevByte113 {


    public static  int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

        int start=0; int caloriesSum=0; int point =0;

        for ( int end=0;end < calories.length; end++){
            caloriesSum += calories[end];
                 if (end -start+1==k){
                     if ( caloriesSum>upper){
                         point++;
                     }
                     if ( caloriesSum<upper){
                         point--;
                     }

                 }
                 caloriesSum -= calories[start++];
        }
        return point;
    }

    public static void main(String[] args){

       int[] calories = {1,2,3,4,5}; int k = 1; int  lower = 3; int  upper = 3;
       System.out.print(dietPlanPerformance(calories,k,lower,upper));

    }
}
