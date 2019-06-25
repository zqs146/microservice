package com.zqs.mqproducer.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableBinding(value = {StreamClient.class})
public class StreamReceiver {

}
