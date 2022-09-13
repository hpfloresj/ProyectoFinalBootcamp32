package com.joseliza.bank.bootcoin.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*solicitud de compra
 * */
public class PurchaseRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "montopago")
	private float paymentAmount; // monto de pago
	@Column(name = "mediopago")
	private String paymentSource; // medio de pago (yanki, transferencia)
	@Column(name = "numerocuenta")
	private String numaccount; // numero de cuenta de ahorros
	@Column(name = "celular")
	private String cell; // numero de cuenta de ahorros
}
