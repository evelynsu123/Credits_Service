package com.bootcamp.microcredito.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.microcredito.entity.CreditCard;

public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard, String>{
	
}
