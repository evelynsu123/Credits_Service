package com.bootcamp.microcredito.dto;

public class CreditCardDto {
	private String id;
	private String numCard;
	private Double saldo;
	private Double limitCredit;
	private String dniCustomer;

	public CreditCardDto() {
		super();
	}

	public CreditCardDto(String id, String numCard, Double saldo, Double limitCredit, String dniCustomer) {
		super();
		this.id = id;
		this.numCard = numCard;
		this.saldo = saldo;
		this.limitCredit = limitCredit;
		this.dniCustomer = dniCustomer;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDniCustomer() {
		return dniCustomer;
	}

	public void setDniCustomer(String dniCustomer) {
		this.dniCustomer = dniCustomer;
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
