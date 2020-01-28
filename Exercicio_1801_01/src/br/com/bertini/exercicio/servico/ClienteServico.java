package br.com.bertini.exercicio.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.bertini.exercicio.dominio.Cliente.Cliente;

public class ClienteServico {

	public List<Cliente> buscarClientePorIdadeExata(List<Cliente> listaCliente, Integer idade) {

		List<Cliente> listaClienteRetornoIdade = new ArrayList<>();

		for (Cliente cliente : listaCliente) {

			if (cliente.getIdade().intValue() == idade.intValue()) {
				listaClienteRetornoIdade.add(cliente);

			}
		}
		return listaClienteRetornoIdade;


	}

	
	public List<Cliente> buscarClientePorMaioridade(List<Cliente> listaCliente, boolean maiorIdade) {
		
		List<Cliente> listaClienteRetornoMaioridade = new ArrayList<>();

		for (Cliente cliente : listaCliente) {

			if (maiorIdade) {
				listaClienteRetornoMaioridade.add(cliente);
			}
		}
		return listaClienteRetornoMaioridade;
	}
	
	
	public List<Cliente> buscarClientePorProfissao (List<Cliente> listaCliente, String profissao) {
		
		List<Cliente> listaClientePorProfissao = new ArrayList<>();
		
		for (Cliente cliente : listaCliente) {
			
			if (cliente.getProfissao().equals(profissao)) {
				listaClientePorProfissao.add(cliente);
			}
		}
		return listaClientePorProfissao;
	}
	
	
	public List<Cliente> imprimirListaCliente (String mensagemIformativa, List<Cliente> listaCliente) {
		return listaCliente;
	}
	
	
}