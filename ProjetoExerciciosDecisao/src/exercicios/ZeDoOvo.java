package exercicios;

import javax.swing.JOptionPane;

public class ZeDoOvo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		Object [] menu = {
				"Ovo azul/Coxinha/Coca cola",
				"Ovo rosa/Esfilha/Pinga",
				"Ovo mole/Conhaque",
				"Ovo mexido/Café/Pão"
				};
		
		int quantidade;
		float valorTotal = 0;
		String codigo;
		
		//entradas
		codigo = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "O produto", JOptionPane.INFORMATION_MESSAGE, null, menu, "Ovo azul/Coxinha/Coca cola");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produto: "));
		
		switch (codigo) {
		case "Ovo azul/Coxinha/Coca cola": valorTotal = quantidade * 10.30f; break;
		case "Ovo rosa/Esfilha/Pinga": valorTotal = quantidade * 13.20f; break;
		case "Ovo mole/Conhaque": valorTotal = quantidade * 9.50f; break;
		case "Ovo mexido/Café/Pão": valorTotal = quantidade * 6.80f; break;
			
		default: JOptionPane.showMessageDialog(null, "Sem opção de pedido","Zé do Ovo",JOptionPane.WARNING_MESSAGE);    break;
		}
		
		JOptionPane.showMessageDialog(null, "Valor total de: " + valorTotal + "R$ ");
	}

}
