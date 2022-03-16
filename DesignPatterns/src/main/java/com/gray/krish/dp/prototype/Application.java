package com.gray.krish.dp.prototype;

import com.gray.krish.dp.prototype.Cakes.Cake;
import com.gray.krish.dp.prototype.Cakes.CakeType;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 8:09 PM
 * DesignPatterns
 */
public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Cake cake = registry.getCake(CakeType.BUTTERRIBBONCAKE);
        System.out.println(cake);
        cake.setCustomWording("Happy Birthday Amal");
        System.out.println(cake);
        Cake cake1 = registry.getCake(CakeType.BUTTERRIBBONCAKE);
        System.out.println(cake1);
    }
}
