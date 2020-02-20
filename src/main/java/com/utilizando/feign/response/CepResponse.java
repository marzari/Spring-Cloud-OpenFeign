package com.utilizando.feign.response;

import lombok.Data;

@Data
public class CepResponse {

	private String complemento;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;

}
