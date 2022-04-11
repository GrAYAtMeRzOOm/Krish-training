package com.krishantha.training.BFSandDFS;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 4);

        graph.bfsStartfrom(0);
        graph.dfsStartfrom(3);

    }
}
