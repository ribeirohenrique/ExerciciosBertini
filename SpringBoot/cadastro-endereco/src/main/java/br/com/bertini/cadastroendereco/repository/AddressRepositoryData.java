package br.com.bertini.cadastroendereco.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bertini.cadastroendereco.domain.AddressEntity;

public interface AddressRepositoryData extends JpaRepository<AddressEntity, String>{

	public void createAddress(AddressEntity addressEntity);
	public AddressEntity findByCep(String cep);
}
