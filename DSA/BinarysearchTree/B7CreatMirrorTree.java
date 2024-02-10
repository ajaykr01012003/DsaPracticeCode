package BinarysearchTree;

public class B7CreatMirrorTree {

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node creatMirror(Node root){
        if (root==null) {
            return null;
        }
        Node leftMirror=creatMirror(root.left);
        Node rightMirror=creatMirror(root.right);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }


    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
         

        preOrder(root);
        System.out.println();
        root=creatMirror(root); 
        
        preOrder(root);
        System.out.println();

    }
}
