/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1

*/


import java.util.Stack;

public class LCA236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.equals(q)) return p;

        Stack pathTop = pathTo(root,p);
        Stack pathToq = pathTo(root,q);

        if (pathTop == null || pathToq == null ) return null;

        TreeNode prev =null;

        while ( !pathTop.isEmpty() && !pathToq.isEmpty()){

            TreeNode s = (TreeNode) pathTop.pop();
            TreeNode t = (TreeNode) pathToq.pop();

            if (s.equals(t)) prev =s;
            else break;

        }
            return prev;

    }


    public Stack<TreeNode> pathTo(TreeNode tree, TreeNode n){

       if (tree == null)  return  null;
       if (tree.equals(n)){
          Stack<TreeNode> s = new Stack<TreeNode>();
          s.push(tree);
          return s;
       }

        Stack<TreeNode> left  =  pathTo(tree.left,n);
        Stack<TreeNode> right =  pathTo(tree.right,n );

        if (left != null){
            left.push(tree);
            return left;
        }

        if (right != null){
            left.push(tree);
            return right;
        }

        return null;

    }




    public static void main(String[] args){


    }

}


