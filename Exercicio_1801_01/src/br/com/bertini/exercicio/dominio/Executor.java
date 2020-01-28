package br.com.bertini.exercicio.dominio;

import java.util.ArrayList;
import java.util.List;

import br.com.bertini.exercicio.dominio.Cliente.Cliente;
import br.com.bertini.exercicio.servico.ClienteServico;

public class Executor {

	public static void main(String[] args) {
	
	List<Cliente> listaCliente = new ArrayList<>();

	Cliente cliente1 = new Cliente();
	cliente1.setNome("Vera");
	cliente1.setIdade(59);
	cliente1.setProfissao("Professora");
	listaCliente.add(cliente1);
		
	Cliente cliente2 = new Cliente();
	cliente2.setNome("Marcos");
	cliente2.setIdade(36);
	cliente2.setProfissao("Advogado");
	listaCliente.add(cliente2);
	
	Cliente cliente3 = new Cliente();
	cliente3.setNome("Joao");
	cliente3.setIdade(18);
	cliente3.setProfissao("Estagiario");
	listaCliente.add(cliente3);
	
	Cliente cliente4 = new Cliente();
	cliente4.setNome("Ana");
	cliente4.setIdade(15);
	cliente4.setProfissao("Estudante");
	listaCliente.add(cliente4);
	
	Cliente cliente5 = new Cliente();
	cliente5.setNome("Carlos");
	cliente5.setIdade(37);
	cliente5.setProfissao("Desenvolvedor");
	listaCliente.add(cliente5);
	
	ImprimirLista imprimirLista = new ImprimirLista();
	ClienteServico cs = new ClienteServico();
	
	System.out.println("Cliente com 18 anos");
	imprimirLista.imprimindo(cs.buscarClientePorIdadeExata(listaCliente, 18));
	
	System.out.println("Cliente com mais de 18 anos");
	imprimirLista.imprimindo(cs.buscarClientePorMaioridade(listaCliente, true));
	
	System.out.println("Cliente com menos de 18 anos");
	imprimirLista.imprimindo(cs.buscarClientePorIdadeExata(listaCliente, 15));
	
	System.out.println("Cliente com profissão exata");
	imprimirLista.imprimindo(cs.buscarClientePorProfissao(listaCliente, "Desenvolvedor"));
	
	System.out.println("Clientes comprofissões fornecidas");
	imprimirLista.imprimindo(cs.imprimirListaCliente("Imprimindo tudo", listaCliente));
	
	}
	
	
	
}
