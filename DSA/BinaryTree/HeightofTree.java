package BinaryTree;

public class HeightofTree {
    static class Node {
    
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    static class BinaryTreess {
        public static int idx=-1;
        public static Node  buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
        public static int heightofTree(Node root){
            if (root==null) {
                return 0;
            }
            int leftHeight=heightofTree(root.left);
            int rightHeight=heightofTree(root.right);
            return Math.max(leftHeight, rightHeight)+1;
        }
        public static void main(String[] args) {
            int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};   
            BinaryTreess tree=new BinaryTreess();
            Node root=tree.buildTree(nodes);
            System.err.println(heightofTree(root));
        }
    
    }
}
