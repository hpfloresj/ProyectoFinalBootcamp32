package com.joseliza.bank.bootcoin.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String kafkaTopic = "tAccountProductos";

	public void sendMessage(String message) {
		log.info("Producing message {}", message);
		this.kafkaTemplate.send(kafkaTopic, message);
	}
}
