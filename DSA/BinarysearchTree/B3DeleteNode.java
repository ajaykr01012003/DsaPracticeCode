package BinarysearchTree;

public class B3DeleteNode {
    static class Node {
        
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
        
    }


    public static Node insetNode(Node root, int val){
        if (root==null) {
            return new Node(val);
        }
        if (root.data>val) {
            root.left= insetNode(root.left, val);
        }else{
            root.right= insetNode(root.right, val);
        }
        return root;
    }
    
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
    
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // Node to be deleted is found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
    
            // Node to be deleted has two children
            Node successor = findNextSuccessor(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
    
        return root;
    }
    


  
    public static Node findNextSuccessor(Node root){
        while (root.left!=null) {
             root=root.left;            
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
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0; i<values.length; i++){
            root=insetNode(root, values[i]);
        }

        inOerder(root);
        System.out.println();

          root=delete(root, 1);
          System.out.println();
          inOerder(root);
          

    }
}
