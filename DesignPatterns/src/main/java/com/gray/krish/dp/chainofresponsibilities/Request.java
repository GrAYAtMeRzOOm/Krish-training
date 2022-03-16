package com.gray.krish.dp.chainofresponsibilities;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:08 PM
 * DesignPatterns
 */
public class Request {
    private String url;
    private HashMap<String, Object> parameters;

    public Request(String url, HashMap<String, Object> parameters) {
        this.url = url;
        this.parameters = parameters;
    }

    public String getUrl() {
        return url;
    }

    public HashMap<String, Object> getParaMap() {
        return parameters;
    }
}
