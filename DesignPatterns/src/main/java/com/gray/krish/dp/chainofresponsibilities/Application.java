package com.gray.krish.dp.chainofresponsibilities;

import com.gray.krish.dp.chainofresponsibilities.filters.Filter1;
import com.gray.krish.dp.chainofresponsibilities.filters.Filter2;
import com.gray.krish.dp.chainofresponsibilities.filters.Filter3;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 11:15 PM
 * DesignPatterns
 */
public class Application {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "abc");
        map.put("password", "123");
        Request loginRequest = new Request("www.abc.com/login.jsp", map);

        Filter1 f1 = new Filter1();
        Filter2 f2 = new Filter2();
        Filter3 f3 = new Filter3();

        f1.setNext(f2);
        f2.setNext(f3);

        f1.process(loginRequest);
    }
}
