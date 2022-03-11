package com.gray.krish.dp.singleton;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12-Mar-22
 * Time: 1:51 AM
 * DesignPatterns
 */
public class SingletonDesignPattern {
    private static volatile SingletonDesignPattern designPatterns;

    private SingletonDesignPattern() {
        if(designPatterns!=null){
            throw new RuntimeException("please use getDesignPattern method");
        }
    }

    public static SingletonDesignPattern getInstance() {
        if(designPatterns==null){
            synchronized (SingletonDesignPattern.class){
                if(designPatterns==null){
                    designPatterns = new SingletonDesignPattern();
                }
            }
        }
        return designPatterns;
    }
}
