package br.com.bertini.exercicio.dominio;

public class Programador extends Funcionario implements CalculoBonus{

	public Programador(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}
 	@Override
	public Double calculoBonus() {
		return super.salario*1.5;	
 	}
 	
	@Override
	public String toString() {
		return "Programador [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
}
