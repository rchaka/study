package com.rchaka.services.impl;

import javax.jws.WebService;

import com.rchaka.services.HelloWebService;

@WebService(endpointInterface = "com.rchaka.services.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
 @Override
 public String getHelloString(String name) {
     return "Hello, " + name + "! This is webservices fromm WAR";
 }
}