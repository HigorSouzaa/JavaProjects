package classes;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class ListaNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nomes = new ArrayList<>();//Este sinal <> pessoal chama de diamante //
		
		int quantidade, resp;
		
		do {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("entre com a quantidade de cadastro :"));
			
			for (int i = 0; i < quantidade; i++) {
				
				nomes.add(JOptionPane.showInputDialog("Entre com um nome : "));
			}
			
			resp = JOptionPane.showConfirmDialog(null,"Voce quer cadastrar mais uma pessoa" ,"Cadastro",JOptionPane.YES_NO_OPTION);
			
		} while (resp==0);
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}

	}

}
