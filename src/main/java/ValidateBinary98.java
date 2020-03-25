/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



public class ValidateBinary98 {


    public static  boolean isValidBST(TreeNode root) {
               return validate(root,null,null);
    }

    public static boolean  validate(TreeNode root, Integer max, Integer min){
        if (root==null){
            return true;
        } else if ( max != null && root.val >=max || min != null && root.val <= min ){
            return false;
        } else {
           return  validate(root.left,root.val,min) && validate(root.right,max,root.val);
        }
    }

    public static void main(String[] args){
        TreeNode tree = new TreeNode(2);

        tree.left= new TreeNode(1);
        tree.right= new TreeNode(3);
        System.out.println(isValidBST(tree));

    }

}
