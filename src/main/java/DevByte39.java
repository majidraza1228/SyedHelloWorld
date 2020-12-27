/*
Averages  ( Breadth first Serach )
This question is asked by Facebook. Given a reference to the root of a binary tree,
 return a list containing the average value in each level of the tree.

Ex: Given the following binary tree…

       1
      / \
    6    8
   / \
  1   5
return [1.0, 7.0, 3.0]

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevByte39 {


    public static  List<Double> averageOfLevels(TreeNode root) {

        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            double sum=0;

            for (int i =0;i<size;i++){

                TreeNode current = queue.remove();
                sum+= current.val;

                if ( current.left !=null){
                    queue.add(current.left);
                }

                if ( current.right !=null){
                    queue.add(current.right);
                }
            }
            averages.add(sum/size);
        }

            return averages;
    }


    public static void main(String[] args){

        TreeNode    root = new TreeNode(1);

        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);
        TreeNode node1 = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);

        root.left=  node6;
        root.right= node8;
        node6.left=node1;
        node6.right=node5;

        System.out.println(averageOfLevels(root));


    }
}
