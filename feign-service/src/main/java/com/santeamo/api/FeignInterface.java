package com.santeamo.api;

import com.santeamo.config.FeignConfig;
import com.santeamo.fallback.FeignFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title
 * ClassName com.santeamo.api.FeignInterface.java
 * Description
 *
 * @author santeamo
 * @date  2019-10-23 上午 9:23
 * @version V1.0
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class, fallback = FeignFallbackService.class)
public interface FeignInterface {

    @GetMapping("/")
    String indexInfo();

    @RequestMapping(value = "/user/{name}")
    String user(@PathVariable( value = "name") String name);
}
