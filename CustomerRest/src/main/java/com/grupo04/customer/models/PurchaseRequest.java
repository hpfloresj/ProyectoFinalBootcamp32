package com.grupo04.customer.models;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PurchaseRequest {
	@Id
	private Long id;
	private float paymentAmount;
	private String paymentSource;
	private String numaccount;
	private String cell;
}
