/*
       7
      / \
    6    2
   / \
  3   3
return [[3, 3], [6, 2], [7]]
 */





import java.util.*;
import java.util.LinkedList;

public class DevByte25 {

    public static List<List<Integer>> bottomUpTraversal(TreeNode root) {

        List<List<Integer>> levels = new ArrayList<List<Integer>>(); {
            if (root==null)
                return levels;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.add(root);

        while(!queue.isEmpty()){

                List<Integer> level = new ArrayList<>();
                int size = queue.size();

                for ( int i=0;i<size;i++){

                    TreeNode currentNode = queue.remove();
                    level.add(currentNode.val);

                    if (currentNode.left!=null){
                        queue.add(currentNode.left);
                    }
                    if (currentNode.right!=null){
                        queue.add(currentNode.right);
                    }
                }
                stack.add(level);
        }

            while (!stack.isEmpty())
                levels.add(stack.pop());

            return levels;

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(2);

        TreeNode node10 = new TreeNode(10);
        TreeNode node15 = new TreeNode(15);
        TreeNode node20 = new TreeNode(20);

        root.left = node10;
        root.right=node15;
        node15.right=node20;

        List<List<Integer>> result = new ArrayList<>();

        result= bottomUpTraversal(root);

        System.out.println(result.toString());
    }

}
