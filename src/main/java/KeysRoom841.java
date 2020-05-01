/*
Initially, all the rooms start locked (except for room 0).
You can walk back and forth between rooms freely.
Return true if and only if you can enter every room.

Example 1:
Input: [[1],[2],[3],[]]
Output: true
Explanation:
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.
 */

import java.util.*;

public class KeysRoom841 {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);

        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);

        while (!stack.isEmpty()){
                List<Integer> keys = rooms.get(stack.pop());
            for (int key : keys
                 ) {
                    if (!visited.contains(key))
                        visited.add(key);
                        stack.add(key);
            }
        }
        return visited.size()==stack.size();
    }

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<List<Integer>> inputlist = new ArrayList<List<Integer>>();

        inputlist.add(list);
        System.out.println(canVisitAllRooms(inputlist));
    }
}
