package com.bootcamp.microcredito.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.microcredito.entity.CreditPersonal;

public interface ICreditPersonalRepository extends ReactiveMongoRepository<CreditPersonal, String> {

}
