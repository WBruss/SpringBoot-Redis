package com.example.messagingredissender.controller;

import com.example.messagingredissender.publisher.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessagePublisher messagePublisher;

    @GetMapping("/")
    public void publishMessage(){
        messagePublisher.publish("Did it work");
    }
}
