
 package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G2BFSTraversals {
    static class Edge {
    
        int src;
        int dest;
        public Edge(int src, int dest){
            this.dest=dest;
            this.src=src;
        }   
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        //vertex-0
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));

        //vertex-1
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        //vertex-2
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        //vertex-4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
       
        //vertex-3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        //vertex-5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        //vertex-6
        graph[6].add(new Edge(6, 5));
    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];

        q.add(0); // source-- 0

        while (!q.isEmpty()) {
            int curr=q.remove();
            
            if (!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr]=true;

                for(int i=0; i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);

                    q.add(e.dest);
                }
            }

        }

    }

public static void main(String[] args) {
    /*
     * 
     *                O
     *              /   \
     *             /     \
     *            2       1
     *            |       |
     *            |       |
     *            4-------3
     *             \     /
     *              \   /
     *                5
     *                |
     *                |
     *                6
     *    
     * 
     */
   int v=7;
   ArrayList<Edge> graph[]=new ArrayList[v];
   creatGraph(graph);
   bfs(graph);

}
    
}