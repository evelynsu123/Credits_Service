package com.bootcamp.microcredito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.microcredito.dto.CreditEnterpriseDto;
import com.bootcamp.microcredito.entity.CreditCard;
import com.bootcamp.microcredito.entity.CreditEnterprise;
import com.bootcamp.microcredito.service.impl.CreditCardserviceImpl;
import com.bootcamp.microcredito.service.impl.CreditEnterpriseServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/credit-enterprise")
public class CreditEnterpriseController {
	
	@Autowired
	private CreditEnterpriseServiceImpl _creditEnterpriseService;
	
	@PostMapping
	public Mono<CreditEnterpriseDto> create(@RequestBody CreditEnterpriseDto credit){
		return _creditEnterpriseService.save(credit);
	}
	
	@PutMapping
	public Mono<CreditEnterpriseDto> update(@RequestBody CreditEnterpriseDto credit){
		return _creditEnterpriseService.update(credit);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return _creditEnterpriseService.deleteById(id);
	}
	
	@GetMapping
	public Flux<CreditEnterpriseDto> getAll(){
		return _creditEnterpriseService.getAll();
	}
	
}
