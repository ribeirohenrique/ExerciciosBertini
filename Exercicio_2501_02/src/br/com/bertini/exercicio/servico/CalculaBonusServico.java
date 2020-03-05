package br.com.bertini.exercicio.servico;

import br.com.bertini.exercicio.dominio.CalculoBonus;

public class CalculaBonusServico {
	 
	public void imprimeBonus(CalculoBonus calculoBonus) {
		System.out.println(calculoBonus);
		System.out.println("Bonus é de: " + calculoBonus.calculoBonus());
	}
}
