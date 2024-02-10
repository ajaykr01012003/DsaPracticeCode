package BinaryTree;

public class InorderTraversals {
    static class  Node {
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
    static int idx=-1;
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
     public static void inOrder(Node root){
    if (root==null) {
        return;
    }
    
    inOrder(root.left);
    System.out.print(root.data+"  ");
    inOrder(root.right);
}

}


public static void main(String[] args) {
      int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};

      BinaryTreess tree=new BinaryTreess();
    Node root=tree.buildTree(nodes);
    tree.inOrder(root);
    
}
}
