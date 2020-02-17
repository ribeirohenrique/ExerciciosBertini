package br.com.bertini.cadastroendereco.service.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.bertini.cadastroendereco.converter.ConverterAddressDto;
import br.com.bertini.cadastroendereco.domain.AddressDto;
import br.com.bertini.cadastroendereco.domain.AddressEntity;
import br.com.bertini.cadastroendereco.repository.AddressRepositoryApi;
import br.com.bertini.cadastroendereco.repository.AddressRepositoryData;

@Service
public class AddressServiceImpl {
	
	@Autowired
	AddressRepositoryApi addressRepositoryApi;
	
	@Autowired
	AddressRepositoryData addressRepositoryData;

	public AddressEntity createAddress(String cep) {
		
		AddressDto addressDto = addressRepositoryApi.getAddress(cep);
		ConverterAddressDto converter = new ConverterAddressDto();
		
		AddressEntity addressEntity = converter.apply(addressDto);
		
		return addressRepositoryData.save(addressEntity);
	}

	 public ResponseEntity<?> deleteAddress(String cep){
		
		 AddressEntity addressEntity = Optional.ofNullable(addressRepositoryData.findByCep(cep)).
				orElseThrow(() -> new IllegalArgumentException("Deletado"));
		
		return ResponseEntity.ok().body("Deletado");
	}

}