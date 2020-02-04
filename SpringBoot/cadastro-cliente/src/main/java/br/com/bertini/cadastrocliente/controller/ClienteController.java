package br.com.bertini.cadastrocliente.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bertini.cadastrocliente.domain.Cliente;
import br.com.bertini.cadastrocliente.repository.ClienteRepository;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping()
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
