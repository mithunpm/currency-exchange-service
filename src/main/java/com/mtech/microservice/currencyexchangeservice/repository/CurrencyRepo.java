package com.mtech.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtech.microservice.currencyexchangeservice.entity.CurrencyEntity;

public interface CurrencyRepo extends JpaRepository<CurrencyEntity, Long>{
	
	CurrencyEntity findByFromAndTo(String from ,String to);

}
