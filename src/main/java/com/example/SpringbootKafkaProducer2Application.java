package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringbootKafkaProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaProducer2Application.class, args);
    }

    @Bean
    CommandLineRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("topic1", "Hello Kafka Producer");
        };
    }
}
