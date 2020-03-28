package br.edu.escola.testes;

import br.edu.escola.controller.EscolaController;
import br.edu.escola.negocio.Escola;

public class EscolaTeste {

	public static void main(String[] args) {
		
		EscolaController controle = new EscolaController();
		
		controle.incluir(new Escola("infnet"));
		controle.incluir("instituto infnet");
		controle.incluir(new Escola("instituto"));
		
		System.out.println("Escolas: " + controle.obterLista());
		
		controle.excluir(2);
		
		System.out.println("Escolas: " + controle.obterLista());
		
		System.out.println("Escola 1: " + controle.obterPorId(1));
	}
}