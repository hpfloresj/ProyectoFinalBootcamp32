package com.joseliza.bank.bootcoin.kafka;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BootcoinConsumer {
	
    //@KafkaListener(topics = "${events.topic.input.pattern}", groupId = "group_id")
    @KafkaListener(topics = "tbootcoin", groupId = "group01")
    public void consume(String solicitud) throws IOException {
        log.info(String.format("#### CONSUMER ##### -> Consumed message -> %s", solicitud));
    }
}
