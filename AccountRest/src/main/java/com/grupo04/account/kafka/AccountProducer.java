package com.grupo04.account.kafka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountProducer {
	private static final String TOPIC = "tbootcoin";
	private final KafkaTemplate<String, String> kafkaTemplate;

	public AccountProducer(@Qualifier("kafkaStringTemplate") KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		log.info("Producing message {}", message);
		this.kafkaTemplate.send(TOPIC, message);
	}

	/*
	public void sendMessage(String key, String transaction) {
		System.out.println(
				String.format("#### PRODUCER #### -> Mensaje enviado -> key %s value %s", key, transaction.toString()));
		log.info(
				String.format("#### PRODUCER #### -> Mensaje enviado -> key %s value %s", key, transaction.toString()));
		this.kafkaTemplate.send(TOPIC, key, transaction.toString());
	}
	*/
}