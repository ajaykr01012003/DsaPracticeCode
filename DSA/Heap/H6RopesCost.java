package Heap;

import java.util.PriorityQueue;

public class H6RopesCost {
    public static void main(String[] args) {
        int []ropes={2,8,3,4,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while (pq.size()>1) {
            int min=pq.remove();
            int min1=pq.remove();
            cost+=min+ min1;
            pq.add(min+min1);
        }
        System.out.println("cost  of ropes   =  "+cost);
    }
}
