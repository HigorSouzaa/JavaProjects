package exercicios;

import javax.swing.JOptionPane;

public class Produto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] menu = {"ABCD","XYPK","KLMP","QRST"};
		String codigo;
		int quantidade;
		float valorTotal = 0;
		
		codigo = (String) JOptionPane.showInputDialog(null, "Informe o codigo:", "O produto", JOptionPane.INFORMATION_MESSAGE, null, menu, "ABCD");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produto: "));
		
		switch (codigo) {
		case "ABCD": valorTotal = quantidade * 5.30f; break; 
		case "XYPK": valorTotal = quantidade * 6.00f; break;
		case "KLMP": valorTotal = quantidade * 3.20f; break;
		case "QRST": valorTotal = quantidade * 2.50f; break;
			
		default: JOptionPane.showMessageDialog(null, "Código inválido","O produto",JOptionPane.WARNING_MESSAGE);    break;
		}
		
		JOptionPane.showMessageDialog(null, "Valor total de: " + valorTotal + "R$ ");
		
	}
	
}
