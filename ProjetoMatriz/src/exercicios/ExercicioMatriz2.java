package exercicios;

import javax.swing.JOptionPane;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		//Declaração
		int[] matrizA = new int[10]; //Número de elementos
		int[] matrizB = new int[10];
		int[] matrizC = new int[10];
		
		//Leitura da matriz
		for (int i = 0; i < matrizA.length; i++) {
			matrizA[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da matriz A"));
			matrizB[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da matriz B"));
		}
		//Resolução do problemas
		for (int i = 0; i < matrizC.length; i++) {
			matrizC[i] = matrizA[i] - matrizB[i];
		}
		
		//Escrita da matriz
		System.out.println("Matriz A\tMatriz B\tMatriz C");
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println(matrizA[i] + "\t" + matrizB[i] + "\t" + matrizC[i]);
			
		}
			
		}
		}
	

