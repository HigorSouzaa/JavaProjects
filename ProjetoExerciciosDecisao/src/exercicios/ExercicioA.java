package exercicios;

import javax.swing.JOptionPane;

public class ExercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,diferenca = 0;
		//Entradas
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Entra com o 1º Numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Entra com o 2º  Numero: "));
		
		//Processamento
		if (num1 > num2) {
			diferenca = num1 - num2;
		}
		
		if (num1 < num2) {
			diferenca = num2 - num1;
		}
	
		//Saida
		JOptionPane.showMessageDialog(null, "Diferença = " + diferenca);
		
		
		
		
		
	}

}
