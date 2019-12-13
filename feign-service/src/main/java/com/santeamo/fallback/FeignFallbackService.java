package com.santeamo.fallback;

import com.santeamo.api.FeignInterface;
import org.springframework.stereotype.Component;

/**
 * Title
 * ClassName com.santeamo.fallback.FeignFallbackService.java
 * Description
 *
 * @author santeamo
 * @date  2019-10-23 上午 10:20
 * @version V1.0
 */
@Component
public class FeignFallbackService implements FeignInterface {

    private String serviceName = "eureka-client";

    @Override
    public String indexInfo() {
        return "远程调用 [" + serviceName + "] 失败！";
    }

    @Override
    public String user(String name) {
        return "远程调用 [" + serviceName + "] 失败！参数 ===> "+name;
    }
}
