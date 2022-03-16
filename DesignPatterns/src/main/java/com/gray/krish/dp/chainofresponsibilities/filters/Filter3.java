package com.gray.krish.dp.chainofresponsibilities.filters;

import com.gray.krish.dp.chainofresponsibilities.Request;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:12 PM
 * DesignPatterns
 */
public class Filter3 extends Webfilter {

    @Override
    public void process(Request r) {
        if (r.getParaMap().get("username") == "abc" && r.getParaMap().get("password") == "123") {
            System.out.println("Sign In Sucessful");
        } else {
            System.out.println("Sign In Failed Enter Valid Credentails");
        }
    }

}