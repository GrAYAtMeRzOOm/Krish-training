package com.gray.krish.dp.chainofresponsibilities.filters;

import com.gray.krish.dp.chainofresponsibilities.Request;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:12 PM
 * DesignPatterns
 */
public class Filter2 extends Webfilter{
    @Override
    public void process(Request r) {
        if (r.getParaMap().containsKey("username") && r.getParaMap().containsKey("password")) {
            System.out.println("Valid Parameters Requseting for login");
            wf.process(r);
        } else {
            System.out.println("InValid Parameters Error On Requset");
        }
    }
}
