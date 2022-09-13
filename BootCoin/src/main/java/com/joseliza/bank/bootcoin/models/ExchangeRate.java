package com.joseliza.bank.bootcoin.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ExchangeRate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String originalCurrency; // moneda origen
	private String destinationCurrency; // moneda destino
	private float buy; // precio de compra
	private float sell; // precio de venta
	private LocalDate date; //fecha del tipo de cambio
}
