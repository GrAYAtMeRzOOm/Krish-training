package com.krishantha.training;

import java.util.*;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11-Apr-22
 * Time: 9:03 PM
 * BFSandDFS
 */
public class ATMGraph<T> {

    private final Map<T, List<T>> contents;

    public ATMGraph() {
        contents = new HashMap<>();
    }

    void connectATM(T vertex, T connectingVertex) {
        if (contents.containsKey(vertex)) {
            contents.get(vertex).add(connectingVertex);
        } else {
            contents.put(vertex, new LinkedList<T>());
            contents.get(vertex).add(connectingVertex);
        }
    }

    void dfsStartFrom(T startingPoint) {
        Stack<T> veiwed = new Stack<>();
        Map<T, Boolean> visitedPoints = new HashMap<>();
        veiwed.add(startingPoint);
        visitedPoints.put(startingPoint, true);
        while (!veiwed.isEmpty()) {
            startingPoint = veiwed.pop();
            if (contents.containsKey(startingPoint)) {
                Iterator<T> valueIterator = contents.get(startingPoint).iterator();
                while (valueIterator.hasNext()) {
                    T next = valueIterator.next();
                    if (!veiwed.contains(next) && visitedPoints.get(next) == null || visitedPoints.get(next)) {
                        veiwed.add(next);
                        visitedPoints.put(next, true);
                    }
                }
                if(contents.get(startingPoint).size()>1){
                    System.out.println(startingPoint);
                }
            }
        }
    }
}
