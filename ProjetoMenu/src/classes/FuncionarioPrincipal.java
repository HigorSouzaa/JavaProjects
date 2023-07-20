package classes;

import javax.swing.JOptionPane;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String opcao; 
		Funcionario funcionario = null;

		do { 
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "O serviço", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar");
			
			switch (opcao) {
			case "Cadastrar": 
				//variaveis
				String nome = null;
				float salario = 0;
				int identificacao = 0;
				
				//entradas
				nome = JOptionPane.showInputDialog("Informe seu nome: ");
				salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario: "));
				identificacao = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Identificação: "));
				
				
				funcionario = new Funcionario(nome, salario, identificacao);
				funcionario.calcularReajusteSalario();
				
				break;
			
			
			case "Pesquisar": 
				if (funcionario != null) {
					String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
					if (funcionario.nome.equals(nomePesquisa)) {
						JOptionPane.showMessageDialog(null, funcionario.mostrarRajutes());				
					} else {
						JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
					}
				
				break;
			
			
			case "Mostrar": 
				if (funcionario != null) {
					JOptionPane.showMessageDialog(null, funcionario.mostrarRajutes());
				} else {
					JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
				}
				
				break;
								
			default: break;
				
			}
			
			
		} while (!opcao.equalsIgnoreCase("Sair"));
	}

}
