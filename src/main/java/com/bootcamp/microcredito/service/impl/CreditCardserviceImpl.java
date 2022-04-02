package com.bootcamp.microcredito.service.impl;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bootcamp.microcredito.dto.CreditCardDto;
import com.bootcamp.microcredito.entity.CreditCard;
import com.bootcamp.microcredito.feignClient.CustomerFClient;
import com.bootcamp.microcredito.repository.ICreditCardRepository;
import com.bootcamp.microcredito.service.ICreditCardService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditCardserviceImpl implements ICreditCardService {

	private final static Logger logger = Logger.getLogger(CreditCardserviceImpl.class);

	@Autowired
	ICreditCardRepository _creditCardRepo;

	@Autowired
	ModelMapper _mapper;

	@Autowired
	private CustomerFClient _clienteFClient;

	@Value("${com.bootcamp.microcliente.cliente}")
	private String url;

	@Override
	public Mono<CreditCardDto> getById(String id) {
		return _creditCardRepo.findById(id).map(cre -> _mapper.map(cre, CreditCardDto.class));
	}

	@Override
	public Flux<CreditCardDto> getAll() {
		return _creditCardRepo.findAll().map(cre -> _mapper.map(cre, CreditCardDto.class));
	}

	@Override
	public Mono<CreditCardDto> save(CreditCardDto creditCard) {
		CreditCard cre = _mapper.map(creditCard, CreditCard.class);
		return _creditCardRepo.save(cre).map(cred -> _mapper.map(cred, CreditCardDto.class));
	}

	@Override
	public Mono<CreditCardDto> update(CreditCardDto creditCard) {
		CreditCard cre = _mapper.map(creditCard, CreditCard.class);
		return _creditCardRepo.save(cre).map(cred -> _mapper.map(cred, CreditCardDto.class));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _creditCardRepo.deleteById(id);
	}



}
