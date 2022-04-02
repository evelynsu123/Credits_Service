package com.bootcamp.microcredito.service;

import com.bootcamp.microcredito.dto.CreditEnterpriseDto;
import com.bootcamp.microcredito.entity.CreditEnterprise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditEnterpriseService {
	Mono<CreditEnterpriseDto> getById(String id);
	Flux<CreditEnterpriseDto> getAll();
	Mono<CreditEnterpriseDto> save(CreditEnterpriseDto creditEnterprise);
	Mono<CreditEnterpriseDto> update(CreditEnterpriseDto creditEnterprise);
	Mono<Void> deleteById(String id);

}
