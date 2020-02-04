package br.com.bertini.cadastrocliente.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "cliente")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updateAt"}, allowGetters = true)
public class Cliente implements Serializable{ //Não digitável, selecionar para gerar automaticamente.
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1076727406377972741L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank //Não pode ser em branco
	private Integer nome;
	
	@NotNull //Não pode ser vazio
	private Integer idade;
	
	@NotBlank //Não pode ser em branco
	private String profissao;
	
	@NotBlank //Não pode ser vazio
	@Column(name = "estado_civil") //Escreve na coluna
	private String estadoCivil; 
	
	@Column(name = "data_nascimento", nullable = false) //Escreve na coluna
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	
	@Column(name = "data_criacao", nullable = false, updatable = false) //Escreve na coluna
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date dataCriacao;
	
	@Column(name = "data_atualizacao", nullable = false) //Escreve na coluna
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date dataAtualizacao;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", profissao=" + profissao
				+ ", estadoCivil=" + estadoCivil + ", dataNascimento=" + dataNascimento + ", dataCriacao=" + dataCriacao
				+ ", dataAtualizacao=" + dataAtualizacao + "]";
	}
	
	
}

/*
show schemas; show tables; use cadastro_cliente; show tables; select * from cliente; describe cliente;
*/