package exercicios;

import javax.swing.JOptionPane;

public class ExercicioMatrizString {

	public static void main(String[] args) {
		//Declaração
		String[] nomes = new String[5];
		
		//Leitura da matriz
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Entre com um nome");
		
		}
		//Escrita
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
			
		}

	}

}
