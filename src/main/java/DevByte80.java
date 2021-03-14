/*
Sum to Target
Given a list of nums and a target, return all the unique combinations of nums
that sum to target.
To solve this problem we can use backtracking. By leveraging backtracking w
Ex: Given the following nums and target...

nums = [8, 2, 2, 4, 5, 6, 3]
target = 9
return [[2,2,5],[2,3,4],[3,6],[4,5]].
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevByte80 {


    public static List<List<Integer>> sumToTarget(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        findCombinations(nums,0,target,new ArrayList<>(),result);

        return result;

    }


    public static void findCombinations(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result) {

        if (target ==0){
            result.add( new ArrayList<>(current) );
            return ;
        }

        if (target <0){
            return;
        }

        for ( int i = index;i <nums.length;i++){
            if(i == index || nums[i] != nums[i - 1]) {
                current.add(nums[i]);
                findCombinations(nums, i + 1, target - nums[i], current, result);
                current.remove(current.size() - 1);
            }

        }


    }


    public static void main(String[] args){

        int[] input ={8, 2, 2, 4, 5, 6, 3};

        System.out.println(sumToTarget(input,9));

    }
}
