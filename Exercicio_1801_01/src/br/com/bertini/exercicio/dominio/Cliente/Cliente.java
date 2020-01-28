package br.com.bertini.exercicio.dominio.Cliente;

public class Cliente { //É criado uma classe denominada Cliente onde esta irá conter Nome, Idade e Profissão.
	
	private String nome; //Variavel String, aceita somente dados em ""
	private Integer idade; //Variavel idade como Integer aceita somente valores inteiros
	private String profissao; //Variavel String aceita somente daddos em "" 
	
	//Depois de definido os valores a serem obtidos, utilizar a ferramenta Source > Generate Getters and Setters
	public String getNome() { //"Puxa" a variavel nome com o valor obtido no executor
		return nome; //retorna o dado armazenado para a tela
	}
	public void setNome(String nome) { //"Define" a variavel nome com o valor obtido no executor
		this.nome = nome; 
	}
	
	public Integer getIdade() { //"Puxa" a variavel idade com o valor obtido no executor
		return idade; //retorna o dado armazenado para a tela
	}
	public void setIdade(Integer idade) { //"Define" a variavel nome com o valor obtido no executor
		this.idade = idade;
	}
	
	public String getProfissao() { //"Puxa" a variavel profissao com o valor obtido no executor
		return profissao; //retorna o dado armazenado para a tela
	}
	public void setProfissao(String profissao) { //"Define" a variavel profissao com o valor obtido no executor
		this.profissao = profissao;
	}
	
	//Feito isso, utilizar a ferramenta Source > Generate toString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + "]";
	}
		
}