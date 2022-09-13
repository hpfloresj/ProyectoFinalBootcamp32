package com.joseliza.bank.bootcoin.models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TransactionBootCoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerBuyer; //comprador de bootcoin
	private String customerSeller; //cliente vendedor de bootcoin
	private float paymentAmount; //monto de pago
	private String paymentSource; //medio de pago (yanki, transferencia)
	private Long accountPaymentId; //id de la cuenta o monedero yanki
	private String paymentTargetId; //medio de pago (yanki, cuentaAhorro, cuentaCorriente)
	private Long accountTargetId; //id de la cuenta del vendedor donde se abona 
	private Boolean validationBuyer; //validar los datos de la compra
	private Boolean validationSeller; //resultado de validar si el vendedor tiene monedero yanki o cuenta corriente en el banco
}
