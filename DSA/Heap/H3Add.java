package Heap;

import java.util.ArrayList;

public class H3Add {
  
    static class  Heap {
        static ArrayList <Integer> arr=new ArrayList<>();
        

        public void add(int data){
            arr.add(data);
            int child=arr.size()-1;
            int parent=(child-1)/2;

            while (arr.get(child) < arr.get(parent)) {
                int temp=arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child=parent;
                parent=(child-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }


        private static void heapify( int i){
               int left=2 * i + 1;
               int right=2 * i + 2;
               int minidx=i;

               if (left< arr.size() && arr.get(minidx)> arr.get(left)) {
                  minidx =left;
               }
               if (right<arr.size() && arr.get(minidx)>arr.get(right)) {
                minidx=right;
               }
               if (minidx !=i) {

                    int temp=arr.get(i);
                    arr.set(i, arr.get(minidx));
                    arr.set(minidx, temp);

                    heapify(minidx);
               }

            


        }

        public static int remove(){
              int data =arr.get(0);

              int temp=arr.get(0);
              arr.set(0,arr.get(arr.size()-1));
              arr.set(arr.size()-1, temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
      public boolean isEmpty(){
        return arr.size()==0;
      }
    }
    
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(2);
        pq.add(6);
        pq.add(3);
        pq.add(1);
        while (!pq.isEmpty()) {
             System.out.println(pq.peek());
             pq.remove();
        }
    }
}
