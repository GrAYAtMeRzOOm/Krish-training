package com.gray.krish.dp.chainofresponsibilities.filters;

import com.gray.krish.dp.chainofresponsibilities.Request;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:09 PM
 * DesignPatterns
 */
public abstract class Webfilter {
    protected Webfilter wf;

    public void setNext(Webfilter wf) {
        this.wf = wf;
    }

    public abstract void process(Request r);
}
