package com.rchaka.client;
import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.rchaka.services.HelloWebService;

public class HelloWebServiceClient {
 public static void main(String[] args) throws MalformedURLException {
     URL url = new URL("http://localhost:8080/HelloWorld/hello?wsdl");

     // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
     // 1-ый аргумент смотрим в атрибуте targetNamespace
     // 2-ой аргумент смотрим в атрибуте name
     QName qname = new QName("http://impl.services.rchaka.com/", "HelloWebServiceImplService");

     // Теперь мы можем дотянуться до тега service в wsdl описании,
     Service service = Service.create(url, qname);
     // а далее и до вложенного в него тега port, чтобы
     // получить ссылку на удаленный от нас объект веб-сервиса
     HelloWebService hello = service.getPort(HelloWebService.class);

     // Ура! Теперь можно вызывать удаленный метод
     System.out.println(hello.getHelloString("Romasik"));
 }
}