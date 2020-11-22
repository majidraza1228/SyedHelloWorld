/*
      1
     / \
    5   2
   /   / \
  1  12   29
and a target of 15, return true as the path 1->2->12 sums to 15.


 */

public class DevByte27 {

    public static boolean hasPathSum(TreeNode root, int target) {

        if ( root==null)
            return false;
        else
            return hasPathSum(root,target, 0);
    }

    public static boolean hasPathSum(TreeNode root, int target, int sum){

        if ( root==null) {
            return false;
        } else if ( root.left==null && root.right==null & sum+root.val==target) {
            return true;
        }else {
           return hasPathSum(root.left,target,sum+root.val) || hasPathSum(root.right,target, sum +root.val);
        }

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node12 = new TreeNode(12);
        TreeNode node29 = new TreeNode(29);


        root.left = node5;
        root.right=node2;
        node5.left=node1;
        node2.left=node12;
        node2.right=node2;

        System.out.println(hasPathSum(root,15));
    }
}
