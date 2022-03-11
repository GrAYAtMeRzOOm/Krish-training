package com.gray.krish.dp.singleton;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12-Mar-22
 * Time: 1:50 AM
 * DesignPatterns
 */
public class Application {
    public static void main(String[] args) {
        long start=0;
        long end=0;

        start = System.nanoTime();
        SingletonDesignPattern patterns1 = SingletonDesignPattern.getInstance();
        end = System.nanoTime();
        System.out.println("pat1 -- "+(end-start));
        start = System.nanoTime();
        SingletonDesignPattern patterns2 = SingletonDesignPattern.getInstance();
        end = System.nanoTime();
        System.out.println("pat2 -- "+(end-start));
    }
}
