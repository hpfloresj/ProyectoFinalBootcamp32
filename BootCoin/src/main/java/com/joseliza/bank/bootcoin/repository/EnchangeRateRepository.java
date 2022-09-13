package com.joseliza.bank.bootcoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseliza.bank.bootcoin.models.EnchangeRate;

public interface EnchangeRateRepository extends JpaRepository<EnchangeRate, Long>{
	public List<EnchangeRate> findByNumdocument(String numdocument);
}
