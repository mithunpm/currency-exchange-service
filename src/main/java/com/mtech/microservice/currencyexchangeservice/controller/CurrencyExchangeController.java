package com.mtech.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mtech.microservice.currencyexchangeservice.beans.Currency;
import com.mtech.microservice.currencyexchangeservice.entity.CurrencyEntity;
import com.mtech.microservice.currencyexchangeservice.repository.CurrencyRepo;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment environment;
	
	@Autowired
	CurrencyRepo currencyRepo;
	
	@GetMapping("/currencyExchange/from/{from}/to/{to}")
	public CurrencyEntity getExchangeRate(@PathVariable String from,@PathVariable String to)
	{
		//Currency cur= new Currency(from, to, 1000L, new BigDecimal(65));
		CurrencyEntity cur =currencyRepo.findByFromAndTo(from, to);
		if(null!=cur)
		cur.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return cur;
		
	}

}
