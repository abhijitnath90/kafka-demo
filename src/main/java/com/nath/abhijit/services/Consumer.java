package com.nath.abhijit.services;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class Consumer {

    @KafkaListener(topics = "newKafka_topic", groupId = "newKafka_group")
    public void listenToTopic(String receivedMessage) {
        System.out.println("The message received is "+ receivedMessage);
    }
}
