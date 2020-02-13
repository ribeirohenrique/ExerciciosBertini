package br.com.bertini.exercicio.dominio;

public class CartaoCredito extends FormaPagamento{

	private String numero;
	private String validade;
	private String NomeTitular;
		
	public CartaoCredito(Double valor, String numero, String validade, String nomeTitular) {
		super(valor);
		this.numero = numero;
		this.validade = validade;
		NomeTitular = nomeTitular;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNomeTitular() {
		return NomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}

	@Override
	public String toString() {
		return "CartaoCredito [numero=" + numero + ", validade=" + validade + ", NomeTitular=" + NomeTitular
				+ ", valor=" + valor + "]";
	}

}
