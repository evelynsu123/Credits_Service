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

import com.bootcamp.microcredito.dto.CreditPersonalDto;
import com.bootcamp.microcredito.entity.CreditEnterprise;
import com.bootcamp.microcredito.entity.CreditPersonal;
import com.bootcamp.microcredito.service.impl.CreditEnterpriseServiceImpl;
import com.bootcamp.microcredito.service.impl.CreditPersonalServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/credit-personal")
public class CreditPersonalController {
	@Autowired
	private CreditPersonalServiceImpl _creditPersonalService;
	
	@PostMapping
	public Mono<CreditPersonalDto> create(@RequestBody CreditPersonalDto credit){
		return _creditPersonalService.save(credit);
	}
	
	@PutMapping
	public Mono<CreditPersonalDto> update(@RequestBody CreditPersonalDto credit){
		return _creditPersonalService.update(credit);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return _creditPersonalService.deleteById(id);
	}
	
	@GetMapping
	public Flux<CreditPersonalDto> getAll(){
		return _creditPersonalService.getAll();
	}
}
