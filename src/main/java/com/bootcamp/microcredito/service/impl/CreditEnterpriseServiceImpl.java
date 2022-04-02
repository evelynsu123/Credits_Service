package com.bootcamp.microcredito.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcredito.dto.CreditEnterpriseDto;
import com.bootcamp.microcredito.entity.CreditEnterprise;
import com.bootcamp.microcredito.repository.ICreditEnterpriseRepository;
import com.bootcamp.microcredito.service.ICreditEnterpriseService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditEnterpriseServiceImpl implements ICreditEnterpriseService{
	
	
	@Autowired
	private ICreditEnterpriseRepository _creditEnterpriseRepo;
	
	@Autowired
	private ModelMapper _mapper;

	@Override
	public Mono<CreditEnterpriseDto> getById(String id) {
		return _creditEnterpriseRepo.findById(id).map(cr -> _mapper.map(cr, CreditEnterpriseDto.class));
	}

	@Override
	public Flux<CreditEnterpriseDto> getAll() {
		return _creditEnterpriseRepo.findAll().map(cr -> _mapper.map(cr, CreditEnterpriseDto.class));
	}

	@Override
	public Mono<CreditEnterpriseDto> save(CreditEnterpriseDto creditEnterprise) {
		CreditEnterprise creditE = _mapper.map(creditEnterprise, CreditEnterprise.class);
		return _creditEnterpriseRepo.save(creditE).map(cr -> _mapper.map(cr, CreditEnterpriseDto.class));
	}

	@Override
	public Mono<CreditEnterpriseDto> update(CreditEnterpriseDto creditEnterprise) {
		CreditEnterprise creditE = _mapper.map(creditEnterprise, CreditEnterprise.class);
		return _creditEnterpriseRepo.save(creditE).map(cr -> _mapper.map(cr, CreditEnterpriseDto.class));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _creditEnterpriseRepo.deleteById(id);
	}

	
}
