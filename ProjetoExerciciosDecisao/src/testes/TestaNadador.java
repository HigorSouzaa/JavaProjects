package testes;

import javax.swing.JOptionPane;

import classes.Nadador;

public class TestaNadador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declara��o de variaveis
		String nome;
		int idade;
		
		//Entradas
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
		
		//declara��o objeto nadador
		Nadador nadador = new Nadador(nome, idade);
		
		//Saida e processamento
		nadador.classificarCategorias();
		JOptionPane.showMessageDialog(null, nadador.mostrarDados());
	}

}
