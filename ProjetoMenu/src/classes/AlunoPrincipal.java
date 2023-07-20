package classes;

import javax.swing.JOptionPane;

public class AlunoPrincipal {

	public static void main(String[] args) {
		// Criando as opções de Menu
		String[] menu= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String opcao; 
		Aluno aluno = null;

		do { 
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "A Escola", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar");
			
			switch (opcao) {
			case "Cadastrar":
				//declarar as variaveis
				String nome;
				float nota1 = 0, nota2 = 0;
				
				//entradas
				nome = JOptionPane.showInputDialog("Informe seu nome: ");
				nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua primeira nota: "));
				nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua segunda nota: "));
				
				//manipulação objeto aluno
				aluno = new Aluno(nome, nota1, nota2);
				aluno.calcularMedia();
				aluno.mostrarStatus();					
				
				break;
			
			case "Pesquisar":
				
				
				if (aluno != null) {
					String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
					if (aluno.nome.equals(nomePesquisa)) {
						JOptionPane.showMessageDialog(null, aluno.mostraDados());				
					} else {
						JOptionPane.showMessageDialog(null, "Não há alunos cadastrados", "A Escola", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Não há alunos cadastrados", "A Escola", JOptionPane.WARNING_MESSAGE);
					}
				
				break;
			
			case "Mostrar":
				//saida
				if (aluno != null) {
					JOptionPane.showMessageDialog(null, aluno.mostraDados());
				} else {
					JOptionPane.showMessageDialog(null, "Não há alunos cadastrados", "A Escola", JOptionPane.WARNING_MESSAGE);
				}
				
				
				break;
								
			default: break;
				
			}
			
			
		} while (!opcao.equalsIgnoreCase("Sair"));
	}

}
