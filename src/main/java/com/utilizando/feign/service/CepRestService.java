package com.utilizando.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utilizando.feign.client.CepClient;
import com.utilizando.feign.response.CepResponse;

@RestController
@RequestMapping("v1/ceps")
public class CepRestService {
	
	@Autowired
	private CepClient cepClient;
	
	@GetMapping(value = "/{cep}")
	public CepResponse getCep(@PathVariable String cep) {
		return cepClient.getCep(cep);
	}

}
