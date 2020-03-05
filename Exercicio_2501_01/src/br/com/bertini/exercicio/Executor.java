package br.com.bertini.exercicio;

import java.time.LocalDate;
import java.time.Month;

import br.com.bertini.exercicio.dominio.Boleto;
import br.com.bertini.exercicio.dominio.CartaoCredito;
import br.com.bertini.exercicio.dominio.DebitoConta;

public class Executor {

	public static void main (String[] args) {
		
		LocalDate data = LocalDate.of(2020, Month.FEBRUARY, 12);
		
		Boleto boleto = new Boleto (100.5, "00341.11111.22222.33333.7777.4444.1", data);
		System.out.println(boleto);
	
		CartaoCredito cartao = new CartaoCredito (200.00, "1234567890", "01/2025", "Fulano");
		System.out.println(cartao);
		
		DebitoConta debito = new DebitoConta (300.00, "341", "010107877-5", "0784");
		System.out.println(debito);
	}
}
