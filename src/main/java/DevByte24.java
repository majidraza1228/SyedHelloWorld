/*

    2
   / \
  10  15
        \
         20
return [2, 15, 20]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevByte24 {



    public static List<Integer> maxValueInLevels(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        if (root==null)
            return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        int size=1;

        while (!queue.isEmpty()){

            int max =Integer.MIN_VALUE;
        for (int i=0;i<size;i++) {
                TreeNode  node = queue.remove();
                max=Math.max(max,node.val);

                if (node.left !=null)
                    queue.add(node.left);

                if (node.right !=null)
                    queue.add(node.right);
        }
                size=queue.size();
                result.add(max);

        }
            return result;
    }

public static void main(String[] args){

        TreeNode root = new TreeNode(2);

        TreeNode node10 = new TreeNode(10);
        TreeNode node15 = new TreeNode(15);
        TreeNode node20 = new TreeNode(20);

        root.left = node10;
        root.right=node15;
        node15.right=node20;

        List<Integer> result = new ArrayList<Integer>();

        result= maxValueInLevels(root);

        System.out.println(result.toString());

}



}
