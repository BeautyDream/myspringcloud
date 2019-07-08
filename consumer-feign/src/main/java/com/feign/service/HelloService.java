package com.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/7/8
 */
@FeignClient(value = "provider",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @GetMapping("/hello")
    String sayHello(@RequestParam("name") String name);

}
