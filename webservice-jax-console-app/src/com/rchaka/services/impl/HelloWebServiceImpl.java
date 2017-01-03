package com.rchaka.services.impl;

//таже аннотация, что и при описании интерфейса,
import javax.jws.WebService;

import com.rchaka.services.HelloWebService;

//но здесь используется с параметром endpointInterface,
//указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "com.rchaka.services.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
 @Override
 public String getHelloString(String name) {
     // просто возвращаем приветствие
     return "Hello, " + name + "! This is webservices";
 }
}