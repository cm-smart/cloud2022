package com.chen.service.impl;

import com.chen.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements IMessageProviderService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);

        System.out.println("*****serial: " + serial);
        return serial;
    }
}
