package classes;

import javax.swing.JOptionPane;

public class DoadorPrincipal {

	public static void main(String[] args) {

		String[] menu= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String[] menu1= {"Masculino","Feminino"};
		String opcao; 
		Doador doador = null;
		
		do { 
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "O doador", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar");
			
			switch (opcao) {
			case "Cadastrar":
				String nome;
			    float peso = 0;
			    int idade = 0;
			    String genero = null;
			
			    nome = JOptionPane.showInputDialog("Qual seu Nome: "); 
			    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a seu idade: "));
			    genero = (String) JOptionPane.showInputDialog(null, "Escolha um genero", "O doador", JOptionPane.INFORMATION_MESSAGE, null, menu1, "Masculino");
			    peso = Float.parseFloat(JOptionPane.showInputDialog("Qual seu Peso: "));

			    
			    doador = new Doador(nome, peso, idade, genero);
			    doador.mostrarQuantidadeSangue();
			    
				break;
				
				
			case "Pesquisar": 
				if (doador != null) {
					String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
					if (doador.nome.equals(nomePesquisa)) {
						JOptionPane.showMessageDialog(null, doador.mostrarQuatSangue);				
					} else {
						JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "O doador", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "O doador", JOptionPane.WARNING_MESSAGE);
					}
				
				break;
			
			
			case "Mostrar": 
			if (doador != null) {
				JOptionPane.showMessageDialog(null, doador.mostrarQuatSangue);
			} else {
				JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "O doador", JOptionPane.WARNING_MESSAGE);
			}
			
				break;
			default: break;
				
			}
			
			
		} while (!opcao.equalsIgnoreCase("Sair"));

	}

}
