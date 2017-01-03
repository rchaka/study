package com.rchaka.endpoint;

//класс, для запуска веб-сервера с веб-сервисами
import javax.xml.ws.Endpoint;

import com.rchaka.services.impl.HelloWebServiceImpl;
//класс нашего веб-сервиса

public class HelloWebServicePublisher {
 public static void main(String... args) {
     // запускаем веб-сервер на порту 1986
     // и по адресу, указанному в первом аргументе,
     // запускаем веб-сервис, передаваемый во втором аргументе
	 System.out.println("Service is running.");
     Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
 }
}