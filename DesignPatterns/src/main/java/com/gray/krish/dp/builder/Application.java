package com.gray.krish.dp.builder;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 10:47 PM
 * DesignPatterns
 */
public class Application {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        User user = builder.setName("Gray").setCity("Horana").setEmail("gray@mail.com").setId(1).setPassword("123").build();
        System.out.println(user);

    }
}
