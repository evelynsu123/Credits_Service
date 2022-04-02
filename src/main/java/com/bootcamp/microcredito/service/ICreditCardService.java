package com.bootcamp.microcredito.service;

import com.bootcamp.microcredito.dto.CreditCardDto;
import com.bootcamp.microcredito.entity.CreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditCardService {
	Mono<CreditCardDto> getById(String id);
	Flux<CreditCardDto> getAll();
	Mono<CreditCardDto> save(CreditCardDto creditCard);
	Mono<CreditCardDto> update(CreditCardDto creditCard);
	Mono<Void> deleteById(String id);
}
