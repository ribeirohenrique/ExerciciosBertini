package br.com.bertini.cadastroendereco.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "endereco")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updateAt"}, allowGetters = true)
public class AddressEntity implements Serializable{
	
	private static final long serialVersionUID = 6974500157304722126L;

	@Id
	@NotBlank //Não pode ser em branco
	private String cep;
	
	@NotBlank //Não pode ser em branco
	private String logradouro;
	
	@NotBlank //Não pode ser em branco
	private String complemento;

	@NotBlank //Não pode ser em branco
	private String bairro;

	@NotBlank //Não pode ser em branco
	private String localidade;
	
	@NotBlank //Não pode ser em branco
	private String uf;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}