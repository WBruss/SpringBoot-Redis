package com.example.messagingredissender.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Service
public class MessagePublisher {

    @Autowired
    StringRedisTemplate template;

    @Autowired
    ChannelTopic topic;

    public void publish(String message){
        template.convertAndSend(topic.getTopic(), "Publisher: " + message);
    }
}
