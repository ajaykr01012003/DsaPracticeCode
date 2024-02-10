package BalancedBST;

import java.util.ArrayList;

public class B4MergeBST {

    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
        
    }
     public static void getInorder(Node root, ArrayList<Integer> arr){
       if (root==null) {
        return;
       }
       getInorder(root.left, arr);
       arr.add(root.data);
       getInorder(root.right, arr);
     }
     public static Node creatBST(ArrayList<Integer> finalarr, int st, int end){
            if (st>end) {
                return null;
            }
           int mid=(st+end)/2;
           Node root=new Node(finalarr.get(mid));
           root.left=creatBST(finalarr, st, mid-1);
           root.right=creatBST(finalarr, mid+1, end);
           return root;
     }
    public static Node mergeBST(Node root1, Node root2){

        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);

        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);
          ArrayList<Integer> finalarr=new ArrayList<>();
        int i=0, j=0;
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                  finalarr.add(arr1.get(i));
                  i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }
           
        }
        while (i<arr1.size()) {
            finalarr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalarr.add(arr2.get(j));
            j++;
        }

        return creatBST(finalarr, 0, finalarr.size()-1);
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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);


       Node root=mergeBST(root1, root2);
       preOrder(root);
    }
}
