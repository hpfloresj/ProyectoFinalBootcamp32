package com.grupo04.customer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.grupo04.customer.models.PurchaseRequest;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "tSolicitud", groupId = "group01")
	public void consume(String message) {
		System.out.println("Consumiendo string: " + message);
		// Guardar en Base de Datos

	}

	/*
	 * @KafkaListener(topics = "tSolicitud", groupId = "group01", containerFactory =
	 * "userKafkaListenerFactory") public void consumeJson(PurchaseRequest purchase)
	 * { System.out.println("Consumiendo json: " + purchase); }
	 */
}