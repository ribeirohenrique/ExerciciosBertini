package br.com.bertini.exercicio.dominio.Cliente;

public class Cliente {
	
	private String nome;
	private Integer idade;
	private String profissao;
	
	//Depois de definido os valores a serem obtidos, utilizar a ferramenta Source > Generate Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
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
	
	//Feito isso, utilizar a ferramenta Source > Generate toString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + "]";
	}
		
}