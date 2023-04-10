package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topic1", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }
}
