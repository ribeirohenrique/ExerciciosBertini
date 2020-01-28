package br.com.bertini.exercicio.dominio;

public class Gerente extends Funcionario implements CalculoBonus{
	
	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}
	@Override
	public Double calculoBonus() {
		return super.salario*3.0;
	}
	
	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", calculoBonus()="
				+ calculoBonus() + "]";
	}

	
	

}
