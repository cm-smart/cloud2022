package com.chen.controller;

import com.chen.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProviderService.send();
    }
}
