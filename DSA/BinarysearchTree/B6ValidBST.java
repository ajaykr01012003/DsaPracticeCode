package BinarysearchTree;

public class B6ValidBST {
  
    static class Node {

        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;

        }  
    }
    public static Node insert(Node root, int val){

        if (root==null) {
            root=new Node(val);
            return root;
        }

        if (root.data>val) {
            root.left=insert(root.left, val); 
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inOerder(Node root){
        if (root==null) {
            return;
        }
        inOerder(root.left);
        System.out.print(root.data+" ");
        inOerder(root.right);
    }
    public static boolean isValidBST(Node root, Node min, Node max){
        if (root==null) {
            return true;

        }
        if (min !=null && root.data<=min.data) {
            return false;

        }
        if (max!=null && root.data>=max.data) {
            return false;
        }
        return isValidBST(root.left, min, root ) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
       int nodes[]={1,1,1};
       Node root=null; 
       for(int i=0; i<nodes.length; i++){
        root = insert(root, nodes[i]);
       }
       inOerder(root);
       System.err.println();
    if (isValidBST(root, null, null)) {
        System.out.println("valid bst");
    }else{
        System.out.println("not valid bst");
    }
    }


}
