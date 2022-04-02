package com.bootcamp.microcredito.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bootcamp.microcredito.entity.Customer;

import reactor.core.publisher.Mono;

@FeignClient(value="servicio-cliente", url="http://localhost:8001/api/v1/customer/")
public interface CustomerFClient {
	
	@GetMapping("/{dni}")
	public Mono<ResponseEntity<Customer>> findByDni(@PathVariable("dni") String dni);
}
