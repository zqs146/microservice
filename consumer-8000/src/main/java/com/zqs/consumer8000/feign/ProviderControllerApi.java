package com.zqs.consumer8000.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")//这里需要指定应用名称
public interface ProviderControllerApi {

    //名字需要跟 provider提供方一致，这样就可以了调用了，注意要加上类上面的 requestMapping注解的路径
    //让开发人员感觉像在调用本地方法一样，请求方式与服务提供方一致
    @GetMapping("message")
    String getProviderMessage();

}
