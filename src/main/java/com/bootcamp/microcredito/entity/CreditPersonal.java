package com.bootcamp.microcredito.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Document
public class CreditPersonal {
	@Id
	private String id;
	private String codigo;
	private Double credit;
	private String dniCustomer;
	
	public CreditPersonal() {
		super();
	}
	public CreditPersonal(String id, String codigo, Double credit, String idCliente) {
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
	public String getIdCliente() {
		return dniCustomer;
	}
	public void setIdCliente(String idCliente) {
		this.dniCustomer = idCliente;
	}
	
}
