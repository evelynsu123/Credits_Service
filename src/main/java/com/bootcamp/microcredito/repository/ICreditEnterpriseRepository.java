package com.bootcamp.microcredito.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.microcredito.entity.CreditEnterprise;

public interface ICreditEnterpriseRepository extends ReactiveMongoRepository<CreditEnterprise, String>{

}
