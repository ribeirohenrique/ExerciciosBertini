package br.com.bertini.cadastrocliente.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bertini.cadastrocliente.domain.Cliente;
import br.com.bertini.cadastrocliente.exception.DataNotFoundException;
import br.com.bertini.cadastrocliente.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
		
	@DeleteMapping("/{id}") //Deletar da base
	public ResponseEntity<?> deleteCliente(@PathVariable(value = "id") Long clienteId){
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow(() -> new DataNotFoundException("Cliente", "id", clienteId));
		
		clienteRepository.delete(cliente);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}") //procura a informação na API, essa só obtém os dados
	public Cliente getCliente(@PathVariable(value = "id") Long clienteId) {
		return clienteRepository.findById(clienteId)
		.orElseThrow(() -> new DataNotFoundException("Cliente", "idCliente", clienteId)); 
	}
	
	@GetMapping("/profissao/{idProfissao}") //procura a informação na API, essa só obtém os dados
	public Cliente getCliente(@PathVariable(value = "idProfissao") String idProfissao) {
		return clienteRepository.findByProfissao(idProfissao);
	}
	
	@PostMapping() //Requisição
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/{id}") //insere a informação na API, essa altera os dados na API
	public Cliente updateCliente(@PathVariable(value = "id") Long clienteId,
			@Valid @RequestBody Cliente clienteAtualiza) {
		
		Cliente clienteData = clienteRepository.findById(clienteId)
				.orElseThrow(() -> new DataNotFoundException("Cliente", "id", clienteId));
		
		clienteData.setNome(clienteAtualiza.getNome());
		clienteData.setIdade(clienteAtualiza.getIdade());
		clienteData.setProfissao(clienteAtualiza.getProfissao());
		clienteData.setEstadoCivil(clienteAtualiza.getEstadoCivil());
		clienteData.setDataNascimento(clienteAtualiza.getDataNascimento());
		
		Cliente clienteAtualizado = clienteRepository.save(clienteData);
		return clienteAtualizado;
	}
	@GetMapping
	public ResponseEntity<String>hello(){
		return ResponseEntity.ok().body("<h1> Hello World </h1>");
	}
}
