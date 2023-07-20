package classes;

import javax.swing.JOptionPane;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String opcao; 
		Funcionario funcionario = null;

		do { 
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma op��o", "O servi�o", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar");
			
			switch (opcao) {
			case "Cadastrar": 
				//variaveis
				String nome = null;
				float salario = 0;
				int identificacao = 0;
				
				//entradas
				nome = JOptionPane.showInputDialog("Informe seu nome: ");
				salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario: "));
				identificacao = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Identifica��o: "));
				
				
				funcionario = new Funcionario(nome, salario, identificacao);
				funcionario.calcularReajusteSalario();
				
				break;
			
			
			case "Pesquisar": 
				if (funcionario != null) {
					String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
					if (funcionario.nome.equals(nomePesquisa)) {
						JOptionPane.showMessageDialog(null, funcionario.mostrarRajutes());				
					} else {
						JOptionPane.showMessageDialog(null, "N�o h� Funcionarios cadastrados", "O servi�o", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "N�o h� Funcionarios cadastrados", "O servi�o", JOptionPane.WARNING_MESSAGE);
					}
				
				break;
			
			
			case "Mostrar": 
				if (funcionario != null) {
					JOptionPane.showMessageDialog(null, funcionario.mostrarRajutes());
				} else {
					JOptionPane.showMessageDialog(null, "N�o h� Funcionarios cadastrados", "O servi�o", JOptionPane.WARNING_MESSAGE);
				}
				
				break;
								
			default: break;
				
			}
			
			
		} while (!opcao.equalsIgnoreCase("Sair"));
	}

}
