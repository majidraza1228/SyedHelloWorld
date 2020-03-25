public class HACBinarySearch {

    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.

       if ( v1 > root.data &&  v2 >root.data)
           return lca( root.right,v1, v2);

       if ( v2 < root.data && v2 < root.data)
           return lca(root.left,v1,v2);

        return root;
    }



public static void main(String[] args){

    Node tree = new Node(2);

    tree.left= new Node(1);
    tree.right= new Node(3);
    tree.right.left= new Node(4);
    tree.right.right= new Node(5);
    tree.right.right.right= new Node(6);

    tree =lca(tree,4,5);


}

}

