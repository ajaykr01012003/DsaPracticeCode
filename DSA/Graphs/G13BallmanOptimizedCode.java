package Graphs;

import java.util.ArrayList;

public class G13BallmanOptimizedCode {

    static class Edge {

        int src, dest, wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph) {

        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    public static void ballManFordAlgo(ArrayList<Edge> graph, int src, int v) {
        int dist[] = new int[v];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < v - 1; i++) {
            for (int j = 0; j < graph.size(); j++) {
                {
                    Edge e = graph.get(j);
                    int u = e.src;
                    int V = e.dest;
                    int w = e.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[V]) {
                        dist[V] = dist[u] + w;
                    }

                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        creatGraph(graph);

        ballManFordAlgo(graph, 0, v);
    }
}
