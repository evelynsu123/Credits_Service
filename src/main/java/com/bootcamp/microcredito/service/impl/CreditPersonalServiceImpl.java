package com.bootcamp.microcredito.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcredito.dto.CreditEnterpriseDto;
import com.bootcamp.microcredito.dto.CreditPersonalDto;
import com.bootcamp.microcredito.entity.CreditPersonal;
import com.bootcamp.microcredito.repository.ICreditPersonalRepository;
import com.bootcamp.microcredito.service.ICreditPersonalService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditPersonalServiceImpl implements ICreditPersonalService {

	@Autowired
	private ICreditPersonalRepository _creditoRepository;
	
	@Autowired
	private ModelMapper _mapper;
	
	@Override
	public Mono<CreditPersonalDto> getById(String id) {
		return _creditoRepository.findById(id).map(cr -> _mapper.map(cr, CreditPersonalDto.class));
	}

	@Override
	public Flux<CreditPersonalDto> getAll() {
		return _creditoRepository.findAll().map(cr -> _mapper.map(cr, CreditPersonalDto.class));
	}

	@Override
	public Mono<CreditPersonalDto> save(CreditPersonalDto creditPersonal) {
		CreditPersonal creditP = _mapper.map(creditPersonal, CreditPersonal.class);
		return _creditoRepository.save(creditP).map(cr -> _mapper.map(cr, CreditPersonalDto.class));
	}

	@Override
	public Mono<CreditPersonalDto> update(CreditPersonalDto creditPersonal) {
		CreditPersonal creditP = _mapper.map(creditPersonal, CreditPersonal.class);
		return _creditoRepository.save(creditP).map(cr -> _mapper.map(cr, CreditPersonalDto.class));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return _creditoRepository.deleteById(id);
	}

}
