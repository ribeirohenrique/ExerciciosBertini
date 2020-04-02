package br.com.bertini.cadastroendereco.service;
import org.springframework.http.ResponseEntity;

import br.com.bertini.cadastroendereco.domain.AddressEntity;

public interface AddressService {
	
	public AddressEntity createAddress(String cep);
	public ResponseEntity<?> deleteAddress(String cep);
	

}