package com.joseliza.bank.bootcoin.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.joseliza.bank.bootcoin.models.ExchangeRate;
import com.joseliza.bank.bootcoin.models.WalletBootCoin;


public interface IExchangeRateService {

	    public List<ExchangeRate> findAll();
	    public Optional<ExchangeRate> findById(Long id);
	    public ExchangeRate update(ExchangeRate exchangeRate);
	    public ExchangeRate save(ExchangeRate exchangeRate);
	    public void delete(ExchangeRate exchangeRate);
	    public ExchangeRate findExchangeRateById(Long id);
		public List<ExchangeRate> findByDate(String date);
}