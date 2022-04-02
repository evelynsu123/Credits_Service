package com.bootcamp.microcredito.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
public class CreditCard {
	
	@Id
	private String id;
	private String numCard;// 16#
	private Double saldo;
	private Double limitCredit;
	private String dniCustomer;
	
	public CreditCard(String id,String numCard, Double limitCredit, String idCliente) {
		super();
		this.id =id;
		this.numCard = numCard;
		this.saldo = limitCredit;
		this.limitCredit = limitCredit;
	}

	public CreditCard() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumCard() {
		return numCard;
	}

	public void setNumCard(String numCard) {
		this.numCard = numCard;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimitCredit() {
		return limitCredit;
	}

	public void setLimitCredit(Double limitCredit) {
		this.limitCredit = limitCredit;
	}

	public String getIdCliente() {
		return dniCustomer;
	}

	public void setIdCliente(String idCliente) {
		this.dniCustomer = idCliente;
	}
	
	
	
	

}
