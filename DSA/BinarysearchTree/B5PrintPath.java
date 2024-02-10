package BinarysearchTree;

import java.util.ArrayList;

public class B5PrintPath {
 
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if (root==null) {
            return new Node(val);
        }
        if (root.data<val) {
            root.right=insert(root.right, val);

        }
        else{
            root.left=insert(root.left, val);
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
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("null");
    }


    public static void printRootLeaf(Node root, ArrayList<Integer> path){
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            printPath(path);
        }
        printRootLeaf(root.left, path);
        printRootLeaf(root.right, path);
       path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;
/*
 * 
 *                     8
 *                   /    \
 *                  5       10
 *                /  \       \
 *               3    6       11
 *              / \            \
 *             1   4            14     
 */

        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        inOerder(root);
        System.out.println("\n");
       printRootLeaf(root,new ArrayList<>() );
    }
}


