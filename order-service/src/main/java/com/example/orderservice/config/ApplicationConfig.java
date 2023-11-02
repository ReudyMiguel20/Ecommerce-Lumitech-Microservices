package com.example.orderservice.config;

import com.example.orderservice.event.OrderPlacedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class ApplicationConfig {

    @Bean
    public KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate(ProducerFactory<String, OrderPlacedEvent> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}
