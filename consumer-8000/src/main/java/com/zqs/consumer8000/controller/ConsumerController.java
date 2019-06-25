package com.zqs.consumer8000.controller;

import com.zqs.consumer8000.feign.ProviderControllerApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private ProviderControllerApi providerControllerApi;

    @GetMapping("feign")
    public String feign(){
        String providerMessage = providerControllerApi.getProviderMessage();
        log.info("调用远程服务获得的数据为：{}",providerMessage);
        return providerMessage;
    }
}
