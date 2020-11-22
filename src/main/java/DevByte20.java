/*
Ex: Given the following tree...
        5
       / \
      1   6
return...
1
 \
  5
   \
    6

public class TreeNode{

      int val;
      TreeNode left;
      TreeNode right;

      public TreeNode( int x) {
             return val=x;
      }

}

 */


import java.util.ArrayList;
import java.util.List;

public class DevByte20 {

    public static TreeNode convertToBSTToLinkedList(TreeNode root){

        List<Integer> values = new ArrayList<>();

        sortTree(root,values);

        TreeNode result = new TreeNode();
        TreeNode current = result;

        for ( int val: values){
            current.right=new TreeNode(val);
            current = current.right;

        }

        return result.right;


    }
    public static void sortTree(TreeNode root, List<Integer> values){

        if ( root==null){
            return;
        }

        sortTree(root.left,values);
        values.add(root.val);
        sortTree(root.right,values);

    }


    public static void main(String[] args){

        TreeNode root = new TreeNode(5);
        TreeNode node1 =  new TreeNode(1);
        TreeNode node6 = new TreeNode(6);

        root.left=node1;
        root.right=node6;

       TreeNode result = convertToBSTToLinkedList(root);



    }

}
