/*

Ex: Given the following tree...
       7
      / \
    2    9
   / \
  1   5
and a = 1, b = 9, return a reference to the node containing 7.

Ex: Given the following tree...
        8
       / \
      3   9
       / \
      2   6
and a = 2, b = 6, return a reference to the node containing 3.
 */

public class DevByte21 {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {

        if (a.val < root.val && b.val <root.val) {
            return lowestCommonAncestor(root.left, a, b);
        } else if (a.val>root.val && b.val >root.val){
                return lowestCommonAncestor(root.right,a,b);
        } else {
                return root;
                }
        }



    public static void main(String[] args){

        TreeNode root = new TreeNode(8);

        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node2 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6);

        root.left=node3;
        root.right=node9;
        node3.left=node2;
        node3.right=node6;

        TreeNode result = lowestCommonAncestor(root,node2,node6);

        System.out.println( "Lowest Common Ancestor ----->>>   "+result.val);


    }



    }


