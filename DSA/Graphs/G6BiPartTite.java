package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G6BiPartTite {
    static class Edge {

        int src;
        int dest;
        public Edge(int src, int dest){
            this.src=src;
            this.dest=dest;
        }     
    }
    public static void creatGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));
    }
    public static boolean isBarPartTite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i]=0;
        }
 
        Queue<Integer> q=new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            q.add(i);
            col[i]=0;

            while (!q.isEmpty()) {
                int curr=q.remove();

                 for(int j=0; i<graph[curr].size(); j++){
                    Edge e=graph[curr].get(i);
                    
                    if (col[e.dest]==-1) {
                        
                        int nextcol=col[i]==0?1:0;
                        col[e.dest]=nextcol;
                        q.add(e.dest);

                    }else if (col[e.dest]==col[curr]) {
                        return false;
                    }
                            
                        
                 }
            }
        }
        return true;

    }
    public static void main(String[] args) {

        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];

        creatGraph(graph);

        /*
         * 
         *          0
         *         /  \
         *        1    2
         *        |     |
         *        4-----3
         * 
         */

        // for(int i=0; i<graph[2].size(); i++){
        //     System.out.println(graph[2].get(i).dest+" ");
        // }
            System.out.println(isBarPartTite(graph));

        
    }
}
