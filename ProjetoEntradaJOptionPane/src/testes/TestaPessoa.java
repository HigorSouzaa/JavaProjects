package testes;

import javax.swing.JOptionPane;

import classes.Pessoa;


public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		String nome;
		float altura;
		int idade;
		
		//Entradas
		
		nome =  JOptionPane.showInputDialog("Informe Seu Nome: ");
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe Sua Altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Sua Idade: "));
		
		//objeto da classe
		Pessoa pessoa = new Pessoa(nome, altura, idade);
		
		//Saida
		JOptionPane.showMessageDialog(null, pessoa.mostrarDados());

	}

}
