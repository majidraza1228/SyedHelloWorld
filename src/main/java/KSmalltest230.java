


import java.lang.reflect.Array;
import java.util.ArrayList;

public class KSmalltest230 {
    BinaryTree root;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root,new ArrayList<Integer>() );
        return nums.get(k-1);
    }

    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr) {
          if (root ==null) return arr;

          inorder(root.left, arr);
          arr.add(root.val);

          inorder(root.right,arr);
          return arr;


    }

  public static void main(String[] args){

  }
}


