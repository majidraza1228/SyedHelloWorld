/*
nums = [6, 3, 1, 2, 0, 5], return 4.
4 is the only number missing in the array between 0 and 6.
we can use a simple math formula: Gauss’ formula. Gauss’ formula is a formula that computes
 the sum of the first N integers and is as follows N * (N + 1) / 2. Using this formula
 we can now deduce our missing number. Because Gauss’ formula gives us what our sum
 should be, we can simply sum all the number we’re given and subtract that sum from
 what Gauss’ formula expects our sum to be.
 */


public class DevByte32 {

    public static int missingNumber(int[] nums){

        int sum=0;

        for(int i: nums)
            sum+=i;
        int n = nums.length;

        return (n*( n+1)/ 2)-sum;


    }
public static void main(String[] args){

        int test[] = {6, 3, 1, 2, 0, 5};

        System.out.println(missingNumber(test));



}
    
}
