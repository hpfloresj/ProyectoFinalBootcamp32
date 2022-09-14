package com.joseliza.bank.bootcoin.kafka;

import java.io.PushbackInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

import com.joseliza.bank.bootcoin.models.PurchaseRequest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {

	@Autowired
	//private KafkaTemplate<String, JsonSerializer<PurchaseRequest>> kafkaTemplate;
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String kafkaTopic = "tSolicitud";
	
	
	public void sendMessage(String message) {
		log.info("Enviando una solicitud desde bootcoin {}", message);
		System.out.println("Enviando una solicitud desde bootcoin " + message);
		this.kafkaTemplate.send(kafkaTopic, message);
	}
	
	
	/*
	public void sendMessage(PurchaseRequest message) {
		log.info("Enviando una solicitud desde bootcoin {}", message.toString());
		System.out.println("Enviando una solicitud desde bootcoin " + message.toString());
		this.kafkaTemplate.send(kafkaTopic, message);
	}
	*/
}