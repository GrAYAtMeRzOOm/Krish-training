package com.gray.krish.dp.chainofresponsibilities.filters;

import com.gray.krish.dp.chainofresponsibilities.Request;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:12 PM
 * DesignPatterns
 */
public class Filter1 extends Webfilter {
    @Override
    public void process(Request r) {
        if (r.getUrl().contains(".jsp")) {
            System.out.println("Valid JSP file");
            wf.process(r);
        } else {
            System.out.println("InValid JSP file");
        }
    }
}
