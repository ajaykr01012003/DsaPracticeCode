package BinaryTree;

public class KthLevelTree {
    static class Node {
      
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }

    public static void kthleveldata(Node root, int level, int k){
        if (root==null) {
            return;
        }
        if (level==k) {
            System.out.print(root.data+" ");
            return;
        }
        kthleveldata(root.left, level+1, k);
        kthleveldata(root.right, level+1, k);
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        int k=3;
        kthleveldata(root, 1, k);
    }
}
