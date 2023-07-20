package testes;

import javax.swing.JOptionPane;

import classes.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis
		String nome;
		float salario;
		int identificacao;
		
		//entradas
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario: "));
		identificacao = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Identificação: "));
		
		//declaração objeto 
		Funcionario funcionario = new Funcionario(nome, salario, identificacao);
		
		//Processamento
		funcionario.calcularReajusteSalario();
		
		//Saida
		JOptionPane.showMessageDialog(null, funcionario.mostrarRajutes());

	}
}
