public class Li {
    Node head;
   private static int size;
   public Li(int size){
    this.size=0;
   }
static class Node{
        
          String data;
          Node next;
          
          Node(String data){
            this.data=data;
            this.next=null;
            size++;
          }
          
    }
    

    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next !=null){
                currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode=head;
         while(currNode !=null){
            System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
        }
        System.out.println("null");


        
    }
     // Delete First
        public void deleteFirst(){
             
            if (head==null) {
                System.out.println("The LinklList is Empty");
                return;
            }
            size--;
             head=head.next;

        }
        public void deleteLast(){
             if (head==null) {
                System.out.println("The LinklList is Empty");
                return;
            }
            size--;
            if (head.next==null) {
                head=null;
                return;

            }
            Node seclNode=head;
            Node laNode=head.next;

            while (laNode.next !=null) {
                
              seclNode=seclNode.next;
              laNode=laNode.next;

            }
            seclNode.next=null;


        }
        public int getSize(){
            return size;
        }
    
    public static void main(String[] args) {
        
        Li list=new Li();
        list.addFirst("hello");
        list.addFirst("namsate");
        list.print();
        list.addLast("ajay");
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
         System.out.println(list.getSize());


          
    }
    
}