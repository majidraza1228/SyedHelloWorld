/*
Assume you are an awesome parent and want to give your children some
 cookies. But, you should give each child at most one cookie.
 Each child i has a greed factor gi, which is the minimum size of a
 cookie that the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

Note:
You may assume the greed factor is always positive.
You cannot assign more than one cookie to one child.

Example 1:
Input: [1,2,3], [1,1]

Output: 1
 */


import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int contentChilder =0;

        int glength = g.length-1;
        int slength = s.length-1;

        while (glength >=0 && slength >=0){
                if (s[slength] >= g[glength]) {
                    contentChilder++;
                    glength--;
                    slength--;
                }
                else {
                    glength--;
                }
        }
          return contentChilder;
    }
   public static void main(String[] args){

        int greed[]={1,2,3};
        int cookie[]={1,1};

        System.out.println(findContentChildren(greed,cookie));



   }
}
