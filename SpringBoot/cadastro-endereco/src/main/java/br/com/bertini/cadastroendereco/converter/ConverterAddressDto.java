package br.com.bertini.cadastroendereco.converter;

import java.util.function.Function;

import br.com.bertini.cadastroendereco.domain.AddressDto;
import br.com.bertini.cadastroendereco.domain.AddressEntity;

public class ConverterAddressDto implements Function<AddressDto, AddressEntity>{
	
	@Override
	public AddressEntity apply(AddressDto addressDto) {
		
		AddressEntity addressEntity = new AddressEntity();
		
		addressEntity.setCep(addressDto.getCep());
		addressEntity.setLogradouro(addressDto.getLogradouro());
		addressEntity.setComplemento(addressDto.getComplemento());
		addressEntity.setBairro(addressDto.getBairro());
		addressEntity.setLocalidade(addressDto.getLocalidade());
		addressEntity.setUf(addressDto.getUf());

		return addressEntity;
	}

}
