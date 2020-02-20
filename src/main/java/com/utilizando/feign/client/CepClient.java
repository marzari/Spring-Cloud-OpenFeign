package com.utilizando.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utilizando.feign.response.CepResponse;

@FeignClient(name = "cepClient", url = "http://api.postmon.com.br")
@Component
public interface CepClient {

	@RequestMapping("/v1/cep/{cep}")
	CepResponse getCep(@PathVariable("cep") String cep);

}
