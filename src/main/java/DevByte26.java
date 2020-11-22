/*
Root to Leaf Paths
    8
   / \
  2  29
    /  \
   3    9
return ["8->2", "8->29->3", "8->29->9"]
Depth-first search can be particularly helpful during interviews when answering questions like
the following…

“Does there exist a path between x and y?”
“Generate all combinations of…”
“Find a path that…”
“Is it possible to…”

Class TreeNode {
int val;
TreeNode left;
TreeNode right;

TreeNode (int x)  val=x;

}


 */

import java.util.ArrayList;
import java.util.List;

public class DevByte26 {

    public static List<String> rootToLeafPaths(TreeNode root) {

        List<String> paths = new ArrayList<>();

        if( root==null)
            return paths;

        generatePaths( root, paths, "");
            return paths;

    }
    public static void generatePaths(TreeNode root, List<String> paths,String current){

        if ( root.left==null & root.right==null){

            current += root.val;
            paths.add(current);
            return;
        }

        if ( root.left !=null)
            generatePaths(root.left,paths,current+root.val+"-->");

        if ( root.right !=null)
            generatePaths(root.right,paths, current+root.val+"-->");

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(8);

        TreeNode node2 = new TreeNode(2);
        TreeNode node29 = new TreeNode(29);
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);

        root.left= node2;
        root.right= node29;
        node29.right=node9;
        node29.left=node3;

        List<String>      result = rootToLeafPaths(root);

        System.out.println(result.toString() );


    }

}






