package com.santeamo.eureka.client;

import com.santeamo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String serviceName;

    @GetMapping("/")
    public String index(){
        return "serviceName ===> " + serviceName + " || port ===> " + port;
    }

    @RequestMapping(value = "/user/{name}")
    public String user(@PathVariable String name){
        return "hello, " + name + " , there is "+ serviceName + ", my port is " + port;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody User user){
        return serviceName + ":" + port + ", GET User ===> " + user;
    }

}
