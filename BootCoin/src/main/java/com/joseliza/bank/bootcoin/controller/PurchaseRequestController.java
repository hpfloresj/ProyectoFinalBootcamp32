package com.joseliza.bank.bootcoin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseliza.bank.bootcoin.models.PurchaseRequest;
import com.joseliza.bank.bootcoin.models.TransactionBootCoin;
import com.joseliza.bank.bootcoin.models.WalletBootCoin;
import com.joseliza.bank.bootcoin.service.ITransactionBootCoinService;
import com.joseliza.bank.bootcoin.service.IWalletBootCoinService;
import com.joseliza.bank.bootcoin.service.PurchaseRequestService;


@RestController
@RequestMapping("/compra")
public class PurchaseRequestController {

	@Autowired
	PurchaseRequestService service;

	@GetMapping
	public List<PurchaseRequest> listar(Model model) {
		return service.findAll();
	}

	@GetMapping("/buscorporcuenta/{numaccount}")
	public List<PurchaseRequest> findByNumaccount(@PathVariable String numaccount) {
		return service.findByNumaccount(numaccount);
	}

	@GetMapping("/buscorporcell/{cell}")
	public List<PurchaseRequest> findByCell(@PathVariable String cell) {
		return service.findByCell(cell);
	}

	@PostMapping("/solicitar")
	public PurchaseRequest create(@RequestBody PurchaseRequest purchaseRequest) {
		
		return service.save(purchaseRequest);
	}
	
}
