package com.santeamo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title
 * ClassName com.santeamo.config.FeignConfig.java
 * Description
 *
 * @author santeamo
 * @date  2019-10-23 下午 1:35
 * @version V1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
