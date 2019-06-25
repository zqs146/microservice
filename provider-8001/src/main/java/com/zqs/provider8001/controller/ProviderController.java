package com.zqs.provider8001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("message")
    public String message(){
        return "服务方提供的8001接口";
    }

}
