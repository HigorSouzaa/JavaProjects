package exercicios;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		Object [] menu = {1001,1234,6548,4987,7623};
		int codigo, quantidade;
		float valorTotal = 0;
	
		//entradas
		codigo = (int) JOptionPane.showInputDialog(null, "Escolha uma opção", "O produto", JOptionPane.INFORMATION_MESSAGE, null, menu, 1001);
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produto: "));
		
		switch (codigo) {
		case 1001: valorTotal = quantidade * 5.32f; break;
		case 1234: valorTotal = quantidade * 6.45f; break;
		case 6548: valorTotal = quantidade * 2.37f; break;
		case 4987: valorTotal = quantidade * 9.92f; break;
		case 7623: valorTotal = quantidade * 7.43f; break;
			
		default: JOptionPane.showMessageDialog(null, "Código inválido","O produto",JOptionPane.WARNING_MESSAGE);    break;
		}
		
		JOptionPane.showMessageDialog(null, "Valor total de: " + valorTotal + "R$ ");
	}

}
