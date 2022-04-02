package com.bootcamp.microcredito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.microcredito.dto.CreditCardDto;
import com.bootcamp.microcredito.entity.CreditCard;
import com.bootcamp.microcredito.service.impl.CreditCardserviceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/credit-card")
public class CreditCardController {
	
	@Autowired
	private CreditCardserviceImpl _creditCardService;
	
	
	@PostMapping
	public Mono<CreditCardDto> create(@RequestBody CreditCardDto credit){
		return _creditCardService.save(credit);
	}
	
	@PutMapping
	public Mono<CreditCardDto> update(@RequestBody CreditCardDto credit){
		return _creditCardService.update(credit);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return _creditCardService.deleteById(id);
	}
	
	@GetMapping
	public Flux<CreditCardDto> getAll(){
		return _creditCardService.getAll();
	}
	

}
