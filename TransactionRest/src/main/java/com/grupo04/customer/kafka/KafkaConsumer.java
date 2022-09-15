package com.grupo04.customer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.grupo04.customer.models.PurchaseRequest;

@Component
public class KafkaConsumer {
	
private PurchaseRequest purchase;
	
	@KafkaListener(topics = "tOrdenPago", groupId = "group01", containerFactory = "purchaseRequestListener")
	public void consume(String message) {
		System.out.println("Consumiendo string: " + message);
		
		// Registrar transaccion completada
		
	}
}