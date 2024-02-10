package Heap;

import java.util.PriorityQueue;

public class H2PriorityQueue {
     static class Student implements Comparable<Student> {
     
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2) {
              return this.rank-s2.rank;
        }
        
     }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("sanjay", 2));
        pq.add(new Student("jay", 3));
        pq.add(new Student("vijay", 21));
        pq.add(new Student("ajay", 12));
        pq.add(new Student("ajay", 1));
       while (!pq.isEmpty()) {
        System.out.println(pq.peek().name+"-> "+pq.peek().rank);
        pq.remove();
       }
    }
}
