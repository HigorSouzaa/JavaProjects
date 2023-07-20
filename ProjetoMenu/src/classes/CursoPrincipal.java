package classes;

import javax.swing.JOptionPane;

public class CursoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String[] menu1= {"IGL","ESP","IGEP"}; //Matriz Estatica
		String[] menu2= {"Sim","Nao"}; //Matriz Estatica
		
		String opcao; 
		Curso curso = null;

		do { 
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Curso", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar");
			
			switch (opcao) {
			case "Cadastrar":
				String nome;
				String codigo;
				String tipoPagamento;
				
				//Entradas
				nome = JOptionPane.showInputDialog("Olá Informe seu nome para começarmos");
				codigo = (String) JOptionPane.showInputDialog(null, "Escolha o codigo do curso "
						+ "\nIngles = IGL"
						+ "\nEspanhol = ESP"
						+ "\nEspanhol e Ingles = IGEP", "Curso", JOptionPane.WARNING_MESSAGE , null, menu1, "Ingles");
				
				tipoPagamento = (String) JOptionPane.showInputDialog(null, "Deseja pagar A vista ?", "Curso", JOptionPane.WARNING_MESSAGE, null, menu2, "Sim");
				
				curso = new Curso(codigo, tipoPagamento, nome);
				curso.calcularValorCurso();
				break;
				
			case "Pesquisar":
				if (curso != null) {
					String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
					if (curso.nome.equals(nomePesquisa)) {
						JOptionPane.showMessageDialog(null, curso.mostrarDados());				
					} else {
						JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
					}
				break;
				
			case "Mostrar":
				if (curso != null) {
					JOptionPane.showMessageDialog(null, curso.mostrarDados());
				} else {
					JOptionPane.showMessageDialog(null, "Não há Funcionarios cadastrados", "O serviço", JOptionPane.WARNING_MESSAGE);
				}
				break;
								
			default: break;
				
			}
			
			
		} while (!opcao.equalsIgnoreCase("Sair"));
	}

}
