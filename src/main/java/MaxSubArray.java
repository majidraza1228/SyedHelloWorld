/*
Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
 */

public class MaxSubArray {

public static   int findMaxSubArrary(int k, int[] arr){
        int maxSum = 0, windowSum;

        for (int i =0;i <arr.length-k;i++){
            windowSum=0;
            for(int j=i;j<i+k;j++){
                windowSum +=arr[j];
            }

            maxSum=Math.max(maxSum,windowSum);
        }

return maxSum;

}

public static void main(String[] args) {
    System.out.println("Maximum sum of a subarray of size K: "
            + findMaxSubArrary(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    System.out.println("Maximum sum of a subarray of size K: "
            + findMaxSubArrary(2, new int[] { 2, 3, 4, 1, 5 }));
}

}



