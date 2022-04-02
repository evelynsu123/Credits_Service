package com.bootcamp.microcredito.service;

import com.bootcamp.microcredito.dto.CreditPersonalDto;
import com.bootcamp.microcredito.entity.CreditPersonal;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditPersonalService {
	Mono<CreditPersonalDto> getById(String id);
	Flux<CreditPersonalDto> getAll();
	Mono<CreditPersonalDto> save(CreditPersonalDto creditPersonal);
	Mono<CreditPersonalDto> update(CreditPersonalDto creditPersonal);
	Mono<Void> deleteById(String id);
}
