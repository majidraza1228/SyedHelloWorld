/*
Given a binary tree, return its level order traversal where the nodes in each level are ordered from left to right.
Ex: Given the following tree...
    4
   / \
  2   7
return [[4], [2, 7]]

Ex: Given the following tree...
    2
   / \
  10  15
        \
         20
return [[2], [10, 15], [20]]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevByte23 {

    public static List<List<Integer>> gatherLevels(TreeNode root) {

        List<List<Integer>> levels = new ArrayList<>();
                if( root==null){
                    return levels;
                }
        Queue<TreeNode> queue = new LinkedList<>();
                queue.add(root);

                while (!queue.isEmpty()){
                int size = queue.size();

                List<Integer> currentLevel = new ArrayList<>();

                for (int i =0;i<size;i++){

                    TreeNode current = queue.remove();
                    currentLevel.add(current.val);

                    if (current.left !=null){
                        queue.add(current.left);
                    }

                    if (current.right !=null){
                        queue.add(current.right);
                    }
                }

                levels.add(currentLevel);

        }
                return levels;
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode (2);
        TreeNode node7 = new TreeNode(7);

        root.left= node2;
        root.right=node7;

        List<List<Integer>> result = new ArrayList<>();

        result =  gatherLevels(root);


    }


    
}
