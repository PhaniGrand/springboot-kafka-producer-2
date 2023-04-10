package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // create Topic bean
     @Bean
     public NewTopic topic1() {
         //return new NewTopic("topic1", 1, (short) 1);
         return TopicBuilder.name("topic1").partitions(1).replicas(1).build();
     }
}
