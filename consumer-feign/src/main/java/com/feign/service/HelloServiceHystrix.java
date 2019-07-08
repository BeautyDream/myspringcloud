package com.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/7/8
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name+", Access failure.";
    }
}
