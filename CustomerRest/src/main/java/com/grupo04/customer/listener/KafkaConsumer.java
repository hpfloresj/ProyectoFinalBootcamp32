package com.grupo04.customer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.grupo04.customer.models.PurchaseRequest;
import com.grupo04.customer.repository.PurchaseRepository;

@Service
public class KafkaConsumer {

	@Autowired
	PurchaseRepository repository;
	
	@KafkaListener(topics = "tSolicitud", groupId = "group01")
	public void consume(PurchaseRequest message) {
		System.out.println("Consumiendo string: " + message);
		// Guardar en Base de Datos
		//repository.save(message);
	}
}