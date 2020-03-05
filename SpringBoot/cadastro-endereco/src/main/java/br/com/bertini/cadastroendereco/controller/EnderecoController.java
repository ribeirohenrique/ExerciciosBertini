package br.com.bertini.cadastroendereco.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bertini.cadastroendereco.domain.AddressEntity;
import br.com.bertini.cadastroendereco.service.AddressService;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/cep/{cep}")
	public AddressEntity createAddress(@PathVariable(value = "cep")String cep) {
		return addressService.createAddress(cep);

	}
}
