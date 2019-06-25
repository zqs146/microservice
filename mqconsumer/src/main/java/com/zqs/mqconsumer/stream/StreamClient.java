package com.zqs.mqconsumer.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {

    String CHANNEL_NAME = "streamTest";

    @Input(CHANNEL_NAME)
    SubscribableChannel input();

}
