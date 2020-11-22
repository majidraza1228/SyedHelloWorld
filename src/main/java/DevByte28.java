/*

   1
 /   \
2     3
return false.
Ex: Given the following tree…

   2
 /   \
1     3
return true.
 */

public class DevByte28 {

    public static boolean isValidBST(TreeNode root) {

     return validateBST(root,null,null);

    }

    public static boolean validateBST(TreeNode root, Integer max, Integer min){

        if ( root==null) {
            return true;
        } else if (max !=null && root.val>=max || min !=null && root.val <=min){
                return false;
        } else {
            return  validateBST(root.left,root.val,min) && validateBST(root.right,max,root.val);
        }

    }

public static void main (String[] main) {

    TreeNode root = new TreeNode(2);

    TreeNode node1 = new TreeNode(1);
    TreeNode node3 = new TreeNode(3);

    root.left = node1;
    root.right = node3;


    System.out.println(isValidBST(root));
}


}
