package com.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Park
 * Date: 2018/5/28
 * Description:
 */
@RestController
public class KafkaTest {

    private static final Logger logger = LoggerFactory.getLogger(KafkaTest.class);

    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping("/start")
    public String sendMsg(){
        System.out.println("start ....");
        for (int i = 0 ; i<100 ; i++){

            System.out.println("producer "+i);
            kafkaSender.send("testTopic1", i+"");
        }
        return  "good";
    }

}