package com.grupo04.customer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.grupo04.customer.models.PurchaseRequest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, PurchaseRequest> kafkaTemplate;
	
	private final String kafkaTopic = "tTransaction";
	
	public void sendMessage(PurchaseRequest purchase) {
		log.info("Enviando una solicitud desde customer {}", purchase.toString());
		System.out.println("Enviando una solicitud desde customer " + purchase.toString());
		this.kafkaTemplate.send(kafkaTopic, purchase);
	}
	
}