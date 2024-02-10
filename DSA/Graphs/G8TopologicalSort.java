package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class G8TopologicalSort {
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
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

    }

    public static void topologicalSort(ArrayList<Edge> []graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<graph.length; i++){
            if (!vis[i]) {
                topologicalSortUtil(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
    private static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr]=true;
        for(int i=0; i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
                topologicalSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[]graph=new ArrayList[v];
        creatDirectedGraph(graph);
        topologicalSort(graph);
    }
}
