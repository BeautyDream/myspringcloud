package com.provider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/7/5
 */
@Service
public class HelloService {

    @Value("${server.port}")
    private String port;

    public String sayHello(String name){
        return "hello "+name+",my port is "+port;
    }

}
