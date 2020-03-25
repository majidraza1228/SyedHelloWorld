/*/
pre Order   root --> left --> right
in Order    left --> root --> right
Post Order  left --> root --> right
Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4
Sample Output

1 2 5 3 4 6
 */


import java.util.Scanner;
import java.util.Stack;

public class HACTreePreOrder {

    public static void preOrder(Node root) {

        if (root==null)
            return;

        Stack<Node> treeStack = new Stack<>();

        treeStack.add(root);

       while (!treeStack.isEmpty() ){
              Node current_Node = treeStack.pop();

              System.out.println(current_Node.data + " ");

              if (current_Node.right != null )
                   treeStack.add(current_Node.right);

           if (current_Node.left != null )
               treeStack.add(current_Node.left);

       }



    }


    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();*/

        Node tree = new Node(1);

        tree.right = new Node(2);
        tree.right.right= new Node(5);
        tree.right.right.left= new Node(3);
        tree.right.right.right= new Node(6);
        tree.right.right.left.right= new Node(4);

        preOrder(tree);
    }



}


class Node {
    int data;
    Node left;
    Node right;

    Node ( int val){

        data=val;
    }


}