package testes;

import javax.swing.JOptionPane;

import classes.Doador;

public class TestaDoador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		String nome;
		String genero;
		int idade;
		float peso;
		
		//Entradas
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		genero = JOptionPane.showInputDialog("Informe seu genero: ").toUpperCase(); //CONVERTE AS LETRAS PARA MAIUSCULA
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		peso = Float.parseFloat(JOptionPane.showInputDialog("informe seu peso: "));
		
		//declaração objeto
		Doador doador = new Doador(nome, genero, idade, peso);
		
		//Processamento
		doador.mostrarQuantidadeSangue();
		
		//saida
		JOptionPane.showMessageDialog(null, doador.mostrarDados());
		
	}

}
