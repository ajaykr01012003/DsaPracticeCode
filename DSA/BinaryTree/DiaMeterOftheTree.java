package BinaryTree;

public class DiaMeterOftheTree {
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
    public static class BinaryTreess {
        private static int idx=-1;
       public static Node buildTree(int nodes[]){

            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
           Node newNode=new Node(nodes[idx]);
           newNode.left=buildTree(nodes);
           newNode.right=buildTree(nodes);

           return newNode;
            
        }

        public static int heght(Node root){
            if (root==null) {
                return 0;

            }
            return heght(root.left) + heght(root.right)+1; 
        }

        public static int diaMeterOftheTree(Node root){
            if (root==null) {
                return 0;

            }
            int leftd=diaMeterOftheTree(root.left);
            int rightd=diaMeterOftheTree(root.right);
            int heght=heght(root.left) + heght(root.right);

            return Math.max(rightd, Math.max(leftd, heght))+1;
        }
    
        
    }
    public static void main(String[] args) {
        
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,1,-1,-1,7,-1,1,-1,-1};
        BinaryTreess tree=new BinaryTreess();
        Node root=tree.buildTree(nodes);

        //System.out.println(diaMeterOftheTree(root));
        System.out.println(tree.diaMeterOftheTree(root));
 
    }   
    
}
