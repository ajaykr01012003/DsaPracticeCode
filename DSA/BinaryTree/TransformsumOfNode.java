package BinaryTree;

public class TransformsumOfNode {

    static class Node {
    
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
  public static int transform(Node root){
    if (root==null) {
        return 0;
    }
    int leftchild=transform(root.left);
    int rightChild=transform(root.right);

    int data=root.data;

    int newleft=root.left==null ? 0 : root.left.data;
    int newright=root.left==null ? 0 : root.right.data;

    root.data=newleft + leftchild + newright + rightChild;
    return data; 
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

        /*
         * 
         *            1
         *          /   \
         *         2      3
         *       /  \   /  \
         *      4    7  5   6
         * 
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.left.right=new Node(7);
       
        
    System.out.print(transform(root));
    preOrder(root);
    }
}


