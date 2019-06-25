package com.zqs.mqproducer.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface StreamClient {

    String CHANNEL_NAME="streamTest";

    @Output(CHANNEL_NAME)
    MessageChannel output();

}
