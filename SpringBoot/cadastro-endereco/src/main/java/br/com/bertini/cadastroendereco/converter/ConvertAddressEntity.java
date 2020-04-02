package br.com.bertini.cadastroendereco.converter;

import java.util.function.Function;

import br.com.bertini.cadastroendereco.domain.AddressDto;
import br.com.bertini.cadastroendereco.domain.AddressEntity;

public class ConvertAddressEntity implements Function<AddressDto, AddressEntity>{
	
	@Override
	public AddressEntity apply(AddressDto addressDto) {
		
		AddressEntity addressEntity = new AddressEntity();
		
		addressDto.setCep(addressEntity.getCep());
		addressDto.setLogradouro(addressEntity.getLogradouro());
		addressDto.setComplemento(addressEntity.getComplemento());
		addressDto.setBairro(addressEntity.getBairro());
		addressDto.setLocalidade(addressEntity.getLocalidade());
		addressDto.setUf(addressEntity.getUf());

		return addressEntity;
	}

}
