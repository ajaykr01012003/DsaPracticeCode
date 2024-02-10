import java.util.LinkedList;

public class L {

    Node head;
  

    public class Node {
    
          int data;
           Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           return;
        }
        newNode.next=head;
         
        head=newNode;
    }


        
         public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node cuNode=head;
            while(cuNode.next !=null){
                cuNode=cuNode.next;
            } 
            cuNode.next=newNode;

        }
       
       public void deleteFirst(){
          if (head==null) {
            System.out.println("LinkedList is Empty");
            return;
          }
          head=head.next;
       }
       public void deleteLast(){
         if (head==null) {
            System.out.println("LinkedList is Empty");
            return;
          }
          if (head.next==null) {
            head=null;
            return;
          }


          Node slNode=head;
          Node lNode=head.next;
          while (lNode.next!=null) {

            slNode=slNode.next;
            lNode=lNode.next;
            
          }
          slNode.next=null;
       }
    public void print(){
        if (head==null) {
            System.out.println("LInkedList is Empty");
            return;
        }
        Node cuNode=head;
        while(cuNode !=null){
            System.out.print(cuNode.data+"->");
            cuNode=cuNode.next;
        }
        System.out.println("null");
        
    }


    public static void main(String[] args) {
        //LinkedList<Integer>list=new LinkedList<>();
        L l=new L();
        // list.addFirst(2);
        // list.addFirst(4);
        l.addFirst(2);
        l.addLast(4);
        l.deleteFirst();
        l.addLast(6);
        l.addLast(7);
        l.deleteLast();
        l.print();
        

    }

   
    
}
