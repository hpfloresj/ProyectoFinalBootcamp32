package com.joseliza.bank.bootcoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseliza.bank.bootcoin.models.TransactionBootCoin;

public interface TransactionBootCoinRepository extends JpaRepository<TransactionBootCoin, Long>{
	public List<TransactionBootCoin> findByNumdocument(String numdocument);
}
