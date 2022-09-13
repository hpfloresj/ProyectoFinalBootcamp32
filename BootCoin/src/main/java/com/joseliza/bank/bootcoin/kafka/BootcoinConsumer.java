package com.joseliza.bank.bootcoin.kafka;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BootcoinConsumer {
	
    //@KafkaListener(topics = "${events.topic.input.pattern}", groupId = "group_id")
    @KafkaListener(topics = "tUsuarioVendedor", groupId = "group01")
    public void consume(String producto) throws IOException {
        log.info(String.format("#### CONSUMER ##### -> Consumed message -> %s", producto));
    }
}
