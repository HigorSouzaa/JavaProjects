package Testes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.CadastroCliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declara��o variaveis
		 String nome;
		 String cpf;
		 String endereco;
		 String telefone;
		 String sexo;
		 String idade;
		 String nomePet;
		 String animal;
		 String pedigree;
		 String idadePet;
		 String raca;
		 String sexoPet;
		 
		 
		 //Entradas
		 nome = JOptionPane.showInputDialog("Olá qual seu nome: ");
		 cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
		 endereco = JOptionPane.showInputDialog("Informe seu Endereço: ");
		 telefone = JOptionPane.showInputDialog("Informe seu Telefone para Contato: ");
		 sexo = JOptionPane.showInputDialog("Informe seu Sexo: ");
		 idade = JOptionPane.showInputDialog("Informe sua Idade: ");
		 nomePet = JOptionPane.showInputDialog("Informe o Nome do Nosso Amiguinho(a): ");
		 animal = JOptionPane.showInputDialog("Informe qual é seu Animal: ");
		 pedigree = JOptionPane.showInputDialog("Informe o pedrigree de seu animal: ");
		 idadePet = JOptionPane.showInputDialog("Informe a idade do nosso amiguinho(a): ");
		 raca = JOptionPane.showInputDialog("Informe qual a raça do nosso amiguinho(a): ");
		 sexoPet = JOptionPane.showInputDialog("Informe o sexo do nosso amiguinho(a): ");
		 
		 //Declara��o do objeto CadastroCliente
		 CadastroCliente cadastro = new CadastroCliente(nome, cpf, endereco, telefone, sexo, idade, nomePet, animal, pedigree, idadePet, raca, sexoPet);
		 
		 //Saida
		 JOptionPane.showMessageDialog(null, cadastro.mostrarDados(), "Cadastro Cliente", 
		 JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/petshop2.png"));
		 
		 
	}

}
