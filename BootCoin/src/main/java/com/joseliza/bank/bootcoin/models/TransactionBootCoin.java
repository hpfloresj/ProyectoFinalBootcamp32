package com.joseliza.bank.bootcoin.models;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class TransactionBootCoin {
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
