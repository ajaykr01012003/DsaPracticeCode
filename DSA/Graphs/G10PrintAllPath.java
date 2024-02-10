package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G10PrintAllPath {
  



    
        static class Edge {
    int src; 
    int dest;
    public Edge(int src, int dest){
        this.src=src;
        this.dest=dest;
    }
    }
    public static void creatDirectedGraph(ArrayList<Edge> []graph){
        for(int i=0; i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

    }
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if (src==dest) {
            System.out.println(path+dest);
            return;
        }
        for(int i=0; i<graph[src].size(); i++){
            Edge e=graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }
    }
   
    
    public static void main(String[] args) {
        int v=6;
        int src=5, dest=1;
        ArrayList<Edge>[]graph=new ArrayList[v];
        creatDirectedGraph(graph);   
        printAllPath(graph, src, dest, "");
      
    }
}



 
