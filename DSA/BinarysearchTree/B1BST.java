package BinarysearchTree;

public class B1BST {
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
    public static void main(String[] args) {
       int nodes[]={5,1,3,4,2,7};
       Node root=null; 
       for(int i=0; i<nodes.length; i++){
        root = insert(root, nodes[i]);
       }
       inOerder(root);
       System.err.println();
    
    }
}
