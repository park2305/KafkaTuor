package com.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * User: Park
 * Date: 2018/5/28
 * Description:
 */
@Component
public class KafkaConsumerOther {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerOther.class);
    @KafkaListener(topics = {"testTopic1"}, groupId = "testGroup2")
    public void consumer(String message){
        System.out.println("consumer----------------"+message);
    }
}