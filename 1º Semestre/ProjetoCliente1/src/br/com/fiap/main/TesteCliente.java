package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar o Objeto
		Cliente objetoCliente = new Cliente();
		
		// Entrada de dados do Objeto na Variável
		objetoCliente.setNome("Marcelo Augusto");
		objetoCliente.setIdade(18);
		objetoCliente.setPeso(80.5);
		
		
		// Saída de dados do Objeto pela Variável
		System.out.println("Olá " + objetoCliente.getNome());
		System.out.println("Você tem " + objetoCliente.getIdade() + " anos.");
		System.out.println("Seu peso é de " + objetoCliente.getPeso() + " kilos.");
	}

}
