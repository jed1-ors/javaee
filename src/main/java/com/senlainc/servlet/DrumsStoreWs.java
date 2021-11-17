package com.senlainc.servlet;

import jakarta.ejb.Stateless;
import jakarta.jws.WebService;

@Stateless
@WebService(targetNamespace = "http://superbiz.org/wsdl")
public class DrumsStoreWs {
    public DrumsStoreWs() {

    }

    public String hi() {
        return "Hello";
    }

    public String somethingHi() {
        return "Hello";
    }
}
