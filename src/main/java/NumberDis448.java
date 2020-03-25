import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
public class NumberDis448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {


        Set<Integer>  setNumber = new HashSet<>();
        List<Integer> disappearedNumbers = new ArrayList<>();

        for (int i: nums
             ) {
            setNumber.add(i);
        }

        for ( int i =0; i < nums.length;i++){

            if (!setNumber.contains(i))
                disappearedNumbers.add(i);
        }
        return disappearedNumbers;
    }


public static void main (String[] args) {

    int[] input = {4,3,2,7,8,2,3,1,1,1,1,1,1,1,1};

    System.out.println(findDisappearedNumbers(input));
}


}
