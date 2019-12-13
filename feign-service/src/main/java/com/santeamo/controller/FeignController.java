package com.santeamo.controller;

import com.santeamo.api.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Title
 * ClassName com.santeamo.controller.FeignController.java
 * Description
 *
 * @author santeamo
 * @date  2019-10-23 上午 9:23
 * @version V1.0
 */
@RestController
public class FeignController {

    @Autowired
    FeignInterface feignInterface;

    @GetMapping("/")
    public String indexInfo(){
        return feignInterface.indexInfo();
    }

    @RequestMapping(value = "/user/{name}")
    public String user(@PathVariable String name){
        return feignInterface.user(name);
    }

}
