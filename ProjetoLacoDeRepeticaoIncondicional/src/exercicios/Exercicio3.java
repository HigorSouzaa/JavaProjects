package exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int somador = 0;
		for (int i = 1; i <= 100; i++) {
			somador = somador + i;
		}
			
		JOptionPane.showMessageDialog(null, somador);
	}
}
