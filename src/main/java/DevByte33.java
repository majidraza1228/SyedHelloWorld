import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
       2
      / \
     1   7
    / \
   4   8
return [4, 1, 8, 2, 7]
 */

public class DevByte33 {



    public static List<Integer> getInorderTraversal(TreeNode root) {

         List<Integer> result = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
         TreeNode current = root;

         while ( current !=null || !stack.isEmpty()){

             while (current!=null)  {
                stack.push(current);
                current = current.left;
             }

             current= stack.pop();
             result.add(current.val);
             current = current.right;
         }

         return result;

    }

public static void main(String[] args){

        TreeNode root = new TreeNode(2);

        TreeNode node1= new TreeNode(1);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new  TreeNode(4);
        TreeNode node8 = new TreeNode(8);

        root.left= node1;
        root.right =node7;
        node1.left=node4;
        node1.right=node8;

List<Integer> result = new ArrayList<>();

result= getInorderTraversal(root);

System.out.println(result);

}

}
