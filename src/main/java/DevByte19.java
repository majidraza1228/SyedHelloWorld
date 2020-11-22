/*
==========================================================================
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
============================================================================
        7
       / \
      5   9
         / \
        8   10
and the search value 9 return a reference to the node containing 9.

 */


public class DevByte19 {


    public  static TreeNode findValue(TreeNode root, int val) {

        if(root ==null )
            return null;
        else if (root.val==val) {
            return root;
        }
        else if ( val < root.left.val) {
            return findValue(root.left,val);
        }
        else {
            return findValue(root.right,val);
        }
    }

public static void main(String[] args){

        TreeNode root = new TreeNode(7);

        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8);
        TreeNode node10= new TreeNode(10);

        root.left=node5;
        root.right=node9;
        node9.left=node8;
        node9.right =node10;

        TreeNode result =findValue(root,9);
        System.out.println(result.val);

}

}
