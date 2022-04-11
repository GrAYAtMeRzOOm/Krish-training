package com.krishantha.training.BFSandDFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11-Apr-22
 * Time: 8:51 PM
 * BFSandDFS
 */
public class Graph {

    /*
    Below decalred veriables for graph content
    */
    private final int length;
    private final LinkedList[] content;

    public Graph(int length) {
        /*
        Below initialize the length by getting value from constructor parameters and Inialize the content with adding values to array
        */
        this.length = length;
        content = new LinkedList[length];
        for (int i = 0; i < length; ++i) {
            content[i] = new LinkedList<>();
        }
    }

    void addEdge(int vertex, int connectingVertex) {
        /*Here its connecting the given vertexes and throws exception if the given vertex isn't exit*/
        if (vertex < length) {
            content[vertex].add(connectingVertex);
        } else {
            throw new IndexOutOfBoundsException(" cannot find inserting vertex ");
        }
    }

    void bfsStartfrom(int vertex) {
        /*
        By this method it prints the vertexes from breadth first search
        * */
        boolean[] visitedVertex = new boolean[length];
        Queue<Integer> queue = new LinkedList<>();
        /*boolean array to store status of visited vertexes and using the first in first out ability of queue it store values of unvisted and poll when it want visit next*/
        visitedVertex[vertex] = true;
        queue.add(vertex);
        /*reasiging value to true , cause given vertex is visted when starting from it */
        System.out.println("Breadth First Search Starting From " + vertex);
        while (queue.size() != 0) {
            vertex = queue.poll();
            System.out.println(vertex);
            Iterator<Integer> listIterator = content[vertex].listIterator();
            while (listIterator.hasNext()) {
                int tempValue = listIterator.next();
                if (!visitedVertex[tempValue]) {
                    /*In this Condition it iterate among the child node to find unvisited vertexes */
                    visitedVertex[tempValue] = true;
                    queue.add(tempValue);
                }
            }
        }
        System.out.println();
    }

    void dfsStartfrom(int vertex) {
        boolean[] visitedVertex = new boolean[length];
        Iterator<Integer> listIterator = content[vertex].listIterator();
        System.out.println("Depth First Search Starting From " + vertex);
        while (listIterator.hasNext()) {
            /*In this loop it iterate among the nodes to find unvisited vertexes */
            int tempValue = listIterator.next();
            System.out.println(tempValue);
            if (!visitedVertex[tempValue]) {
                visitedVertex[tempValue] = true;
            }
        }
        System.out.println();
    }
}
