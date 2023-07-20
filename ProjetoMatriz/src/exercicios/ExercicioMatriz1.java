package exercicios;

import javax.swing.JOptionPane;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		//Matriz para guardar números inteiros
		//Declaração de uma matriz unidimensional
		 int [] matriz = new int[10];
		 
		 //Leitura de uma matriz
		 for (int i = 0; i < matriz.length; i++) {
			 matriz[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor na matriz"));
			
		}
		 //Escrita da matriz
		 for (int i = 0; i < matriz.length; i++) {
			 System.out.println(matriz[i]);
			
		}
		 
	}
}
