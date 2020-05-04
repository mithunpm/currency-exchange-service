package com.mtech.microservice.currencyexchangeservice.beans;

import java.math.BigDecimal;

public class Currency {
	
	private String from;
	private String to;
	private long id;
	private BigDecimal exchangeRate;
	private int port;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Currency(String from, String to, long id, BigDecimal exchangeRate) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.exchangeRate = exchangeRate;
	}
	protected Currency() {
		super();
		
	}
	@Override
	public String toString() {
		return "Currency [from=" + from + ", to=" + to + ", id=" + id + ", exchangeRate=" + exchangeRate + "]";
	}
	

}
