import java.util.HashSet;
import java.util.Set;

public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
/*
        Set<Integer> setNumber = new HashSet<Integer>();

        for (int i: nums) {
            setNumber.add(i);
        }
        for (int i=0;i<= nums.length;i++){
            if (!setNumber.contains(i))
                return i;
        }

        return -1;
*/
        return -1;
    }

    public static void main(String[] args){
        int[] testInput = {9,6,4,2,3,5,7,0,1};
        System.out.print(missingNumber(testInput));
    }


}
