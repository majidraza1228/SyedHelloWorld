/*
Input:
   1
 /   \
2     3
 \
  5
Output: ["1->2->5", "1->3"]
Explanation: All root-to-leaf paths are: 1->2->5, 1->3
/**
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath257 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        if ( root == null)
            return paths;

   dfs(root,"",paths);
   return paths;

    }
    public static void dfs(TreeNode root,String path,List<String> paths){

        path += root.val;

        if (root.left ==null && root.right ==null){
            paths.add(path);
            return;
        }

        if (root.left != null){
            dfs(root.left, path +"-->",paths);
        }

        if (root.right != null){
            dfs(root.right, path +"-->",paths);
        }
    }


    public static void main(String[] args){

        TreeNode tree = new TreeNode(2);

        tree.left= new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.right= new TreeNode(5);

        List<String> inputTree =  new ArrayList<>();

        inputTree   = binaryTreePaths(tree);

        for ( String name: inputTree
             ) {
            System.out.println(name);
        }

    }

}
