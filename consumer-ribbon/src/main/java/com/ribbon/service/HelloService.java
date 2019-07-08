package com.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.javafx.fxml.builder.URLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/7/5
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fail")
    public String sayHello(String name){
        String forObject = restTemplate.getForObject("http://PROVIDER/hello?name={name}", String.class, name);
        return forObject;
    }

    public String fail(String name){
        return "hello "+name+", Access failure.";
    }

}
