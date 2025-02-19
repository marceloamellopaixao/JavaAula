package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.beans.Documentos;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar os objetos
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		Documentos objDocumentos = new Documentos();
		
		// Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		objCliente.setDocumentos(objDocumentos);
		
		// Endereço
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Nome da Rua: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da casa: ")));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o nome do Bairro: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o municipio: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite seu Estado: "));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite seu CEP: "));

		
		// Telefone
		objTelefone.setTelFixo(JOptionPane.showInputDialog("Telefone Fixo: "));
		objTelefone.setTelCelular(JOptionPane.showInputDialog("Telefone Celular: "));
		objTelefone.setTelComercial(JOptionPane.showInputDialog("Telefone Comercial: "));
		objTelefone.setTelContato(JOptionPane.showInputDialog("Telefone Contato: "));
		
		// Documentos
		objDocumentos.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
		objDocumentos.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
		objDocumentos.setSus(JOptionPane.showInputDialog("Digite seu SUS: "));
		objDocumentos.setPis(JOptionPane.showInputDialog("Digite seu PIS: "));
		objDocumentos.setTituloEleitor(JOptionPane.showInputDialog("Digite o seu Titulo de Eleitor: "));
		
		// Saída de dados
		System.out.println("Olá " + objCliente.getNome() + ", como vai? "
				+ "\nVocê tem " + objCliente.getIdade() + " anos, "
				+ "\nVocê está pesando " + objCliente.getPeso() + " kilos, "
						+ "\n" + objCliente.getNome() + ", sua moradia esta localizada na Rua/Avenida " + 
				objCliente.getEndereco().getLogradouro() + ", nº " + objCliente.getEndereco().getNumero() + ", " + objCliente.getEndereco().getBairro() + " - " 
						+ objCliente.getEndereco().getMunicipio() + " / " + objCliente.getEndereco().getEstado() + ", CEP: " + objCliente.getEndereco().getCep()
				+ "\nTelefones Cadastrados: " + objCliente.getTelefone().getTelFixo() + " | "  + objCliente.getTelefone().getTelCelular() + " | " 
						+ objCliente.getTelefone().getTelComercial() + " | " + objCliente.getTelefone().getTelContato() 
						+ "\n\nDocumentos Cadastrados: " 
						+ "\nRG: " + objCliente.getDocumentos().getRg()
						+ "\nCPF: " + objCliente.getDocumentos().getCpf()
						+ "\nSUS: " + objCliente.getDocumentos().getSus()
						+ "\nPIS: " + objCliente.getDocumentos().getPis()
						+ "\nTitulo de Eleitor: " + objCliente.getDocumentos().getTituloEleitor());
	}

}
