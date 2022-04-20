package com.krishantha.training.BFSandDFS;

public class Main {

    public static void main(String[] args) {
        /*Graph graph = new Graph(5);

        graph.addEdge('A', 'C');
        graph.addEdge('A', 'B');
        graph.addEdge('B', 'D');
        graph.addEdge('C', 'E');
        graph.addEdge('E', 'F');
        graph.addEdge('F', 'G');
        graph.addEdge('G', 'C');

        graph.bfsStartfrom('A');
        graph.dfsStartfrom('A');*/

        ATMGraph<Character> atmGraph = new ATMGraph<>();
        atmGraph.connectATM('A', 'C');
        atmGraph.connectATM('A', 'B');
        atmGraph.connectATM('B', 'D');
        atmGraph.connectATM('C', 'D');
        atmGraph.connectATM('E', 'F');
        atmGraph.connectATM('F', 'G');
        atmGraph.connectATM('G', 'A');

        atmGraph.dfsStartFrom('A');

    }
}
