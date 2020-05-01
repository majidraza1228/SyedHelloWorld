import java.util.ArrayList;
import java.util.List;

/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.
Example:
Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:
[
   [5,4,11,2],
   [5,8,4,5]
   ]
 */
public class PathSumII113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
          List<List<Integer>>  paths = new  ArrayList<>();
          pathsfind(root, sum,new ArrayList<>(),paths);
          return paths;
    }
   public void  pathsfind(TreeNode root, int sum, List<Integer> current, List<List<Integer>> paths ) {
       if (root == null) {
           return;
       }

       current.add( root.val);
       if ( root.val==sum && root.left==null && root.right==null){
           paths.add(current);
           return;
       }
     pathsfind(root.left, sum-root.val,new ArrayList<Integer>( current), paths);
       pathsfind(root.right, sum-root.val,new ArrayList<Integer>( current), paths);
   }
public static void main(String[] args){


}

}
