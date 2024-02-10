package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class H1PriorityQueue {
   public static void main(String[] args) {
          PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
          pq.add(4); 
          pq.add(2);
          pq.add(3);
          pq.add(6);
          pq.add(1);
          while (!pq.isEmpty()) {
            System.err.println(pq.peek());
            pq.remove();
          }
   }
}
