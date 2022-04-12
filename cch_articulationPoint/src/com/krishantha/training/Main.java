package com.krishantha.training;

public class Main {

    public static void main(String[] args) {
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
