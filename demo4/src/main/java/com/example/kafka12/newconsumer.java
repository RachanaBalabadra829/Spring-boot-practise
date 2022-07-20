package com.example.kafka12;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class newconsumer {




    @KafkaListener(topics = "topicsecond", groupId = "group_id")
    public void processMessage(String content){
        System.out.println("Message: " + content);
    }
}