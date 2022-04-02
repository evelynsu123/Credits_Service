package com.bootcamp.microcredito.dto;

import java.util.List;

public class CreditEnterpriseDto {
	private String id;
	private String codigo;
	private Double credit;
	private List<String> dniCustomer;
	
	public CreditEnterpriseDto() {
		super();
	}
	public CreditEnterpriseDto(String id, String codigo, Double credit, List<String> idCliente) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.credit = credit;
		this.dniCustomer = idCliente;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getCredit() {
		return credit;
	}
	public void setCredit(Double credit) {
		this.credit = credit;
	}
	public List<String> getIdCliente() {
		return dniCustomer;
	}
	public void setIdCliente(List<String> idCliente) {
		this.dniCustomer = idCliente;
	}
	
	
}
