package testes;

import javax.swing.JOptionPane;

import classes.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		String nome;
		float nota1,nota2;
				
		//Entradas
		nome = JOptionPane.showInputDialog("Entre com o nome do Aluno: ");	
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota do Aluno: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota do Aluno: "));		
		//objeto da classe Aluno
		Aluno aluno = new Aluno(nome, nota1, nota2);
		//Processamento
		aluno.calcularMedia();
		aluno.mostrarStatus();
		//Saida
		JOptionPane.showMessageDialog(null, aluno.mostraDados());
		
		
		

		

	}

}
