package com.joseliza.bank.bootcoin.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.joseliza.bank.bootcoin.models.PurchaseRequest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String kafkaTopic = "tSolicitud";

	public void sendMessage(String message) {
		log.info("Enviando una solicitud desde bootcoin {}", message.toString());
		System.out.println("Enviando una solicitud desde bootcoin " + message.toString());
		this.kafkaTemplate.send(kafkaTopic, message);
	}
}