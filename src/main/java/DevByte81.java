/*
https://leetcode.com/problems/robot-return-to-origin/
Example 1:

Input: moves = "UD"
Output: true
Explanation: The robot moves up once, and then down once.
All moves have the same magnitude, so it ended up at the origin where it
started. Therefore, we return true.
Example 2:

Input: moves = "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left
of
 the origin. We return false because it is not at the origin at the end of its
  moves.
 */

import java.util.HashSet;
import java.util.Set;

public class DevByte81 {


    public static  boolean judgeCircle(String moves) {

        int x=0;
        int y=0;

      for ( char move : moves.toCharArray()) {
          if (move == 'U')
              y++;
          else if (move == 'D')
              y--;
          else if (move == 'L')
              x--;
          else if (move == 'R')
              x++;
      }

      return x==0 && y==0;



        }



    public static void main(String[] args){

       System.out.println(judgeCircle("UD"));


    }
}
