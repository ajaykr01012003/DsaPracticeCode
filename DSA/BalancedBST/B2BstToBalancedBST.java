package BalancedBST;

import java.util.ArrayList;

public class B2BstToBalancedBST {
    static class  Node {
    
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if (root==null) {
            return;
            }
            getInorder(root.left, inorder);
            inorder.add(root.data);
            getInorder(root.right, inorder);

        }
        public static Node creatBST(ArrayList<Integer> Inorder, int st, int end){
            if (st>end) {
                return null;
            }
            int mid=(st+end)/2;

            Node root=new Node(Inorder.get(mid));
            root.left=creatBST(Inorder, st, mid-1);
            root.right=creatBST(Inorder, mid+1, end);

            return root;
        }

    public static Node balancedBST(Node root){
      
        //Inorder seq
        ArrayList<Integer>Inorder=new ArrayList<>();
        getInorder(root, Inorder);
        //sorted Inorder in Balanced Bst
        root=creatBST(Inorder, 0, Inorder.size()-1);
        return root;

    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(11);
        root.right.right=new Node(12);
        root.right.right.right=new Node(14);

       root=balancedBST(root);
       preOrder(root);
    }

}
