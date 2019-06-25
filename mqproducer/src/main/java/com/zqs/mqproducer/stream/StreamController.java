package com.zqs.mqproducer.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("stream/send")
    public String send(){
        streamClient.output().send(MessageBuilder.withPayload("来自mqproducer:8801发送的消息").build());
        return "message send success";
    }

}
