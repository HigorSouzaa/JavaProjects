package classes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PetFamily {

	public static void main(String[] args) {
		Agendamento agendamento = null;
		CadastroCliente cadastroCliente = null;
		String[] menuPrincipal= {"Agendamento","Cadastro"}; //Matriz Estatica
		String[] menuCorpo= {"Cadastrar","Pesquisar","Mostrar","Sair"}; //Matriz Estatica
		String[] menuServico= {"Banho","Tosa","Banho e Tosa","Consulta"}; //Matriz Estatica
		String opcaoAgendamento;
		String opcaoCadastro;
		String opcaoPetFamily;
		String opcaoServico;
		
		
		//entrada Para saber se o usuario vai querer Fazer Agendameto ou Cadastro.
		opcaoPetFamily = (String) JOptionPane.showInputDialog(null, "Deseja realizar um: ", "PetFamily", JOptionPane.INFORMATION_MESSAGE, null, menuPrincipal, "Agendamento");
		if (opcaoPetFamily.equals("Agendamento")) {

			do {
				opcaoAgendamento = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "PetFamily", JOptionPane.INFORMATION_MESSAGE, null, menuCorpo, "Cadastrar");
				
				switch (opcaoAgendamento) {
				case "Cadastrar": 
					String nome;
					String animal;
					String servico;
					String data;
					String hora;
					String nomeAnimal;
					String mudaPalavra;
					   
					nome = JOptionPane.showInputDialog("Olá, qual o seu nome?: ");
					nomeAnimal = JOptionPane.showInputDialog("Qual é o nome do nosso amiguinho(a): ");
					animal = JOptionPane.showInputDialog("Que tipo de animal seria: ");
					servico = (String) JOptionPane.showInputDialog(null, "Você gostaria de qual serviço: ", "PetFamily", JOptionPane.INFORMATION_MESSAGE, null, menuServico, "Banho");
					data = JOptionPane.showInputDialog("Para qual dia você deseja: ");
					hora = JOptionPane.showInputDialog("Qual horario seria melhor para você: ");

					agendamento = new Agendamento(nome, animal, servico, data, hora, nomeAnimal);
					agendamento.mudarPalavra();
					
					break;
				case "Pesquisar": 
					if (agendamento != null) {
						String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
						if (agendamento.nome.equals(nomePesquisa)) {
							JOptionPane.showMessageDialog(null, agendamento.mostrarAgendamento(), "Agendamento", 
							JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/petshop2.png"));			
						} else {
							JOptionPane.showMessageDialog(null, "Não conseguimos terminar o agendameto."
									+ "\nverifique se os dados estão correto", "Agendamento", JOptionPane.WARNING_MESSAGE);
							}
						
					} else {
						JOptionPane.showMessageDialog(null, "Não conseguimos terminar o agendameto."
								+ "\nverifique se os dados estão correto", "Agendamento", JOptionPane.WARNING_MESSAGE);
						}
					
					break;
				case "Mostrar": 
					if (agendamento != null) {
						JOptionPane.showMessageDialog(null, agendamento.mostrarAgendamento(), "Agendamento", 
						JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/petshop2.png"));
					} else {
						JOptionPane.showMessageDialog(null, "Não conseguimos terminar o agendameto."
						+ "\nverifique se os dados estão correto", "Agendamento", JOptionPane.WARNING_MESSAGE);
					}
					
					break;
									
									
				}
				
				
			} while (!opcaoAgendamento.equalsIgnoreCase("Sair"));
			
		} else {
			
			do { 
				opcaoCadastro = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "PetFamily", JOptionPane.INFORMATION_MESSAGE, null, menuCorpo, "Cadastrar");
				
				switch (opcaoCadastro) {
				case "Cadastrar": 
					 String nome;
					 String cpf;
					 String endereco;
					 String telefone;
					 String sexo;
					 String idade;
					 String nomePet;
					 String animal;
					 String pedigree;
					 String idadePet;
					 String raca;
					 String sexoPet;
					 
					 nome = JOptionPane.showInputDialog("Olá qual seu nome: ");
					 cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
					 endereco = JOptionPane.showInputDialog("Informe seu Endereço: ");
					 telefone = JOptionPane.showInputDialog("Informe seu Telefone para Contato: ");
					 sexo = JOptionPane.showInputDialog("Informe seu Sexo: ");
					 idade = JOptionPane.showInputDialog("Informe sua Idade: ");
					 nomePet = JOptionPane.showInputDialog("Informe o Nome do Nosso Amiguinho(a): ");
					 animal = JOptionPane.showInputDialog("Informe qual é seu Animal: ");
					 pedigree = JOptionPane.showInputDialog("Informe o pedrigree de seu animal: ");
					 idadePet = JOptionPane.showInputDialog("Informe a idade do nosso amiguinho(a): ");
					 raca = JOptionPane.showInputDialog("Informe qual a raça do nosso amiguinho(a): ");
					 sexoPet = JOptionPane.showInputDialog("Informe o sexo do nosso amiguinho(a): ");

					 CadastroCliente cadastro = new CadastroCliente(nome, cpf, endereco, telefone, sexo, idade, nomePet, animal, pedigree, idadePet, raca, sexoPet);
					
					 break;
				case "Pesquisar": 
					
					if (cadastroCliente != null) {
						String nomePesquisa = JOptionPane.showInputDialog("Informe o nome a Pesquisar: ");
						if (cadastroCliente.nome.equals(nomePesquisa)) {
							JOptionPane.showMessageDialog(null, cadastroCliente.mostrarDados());				
						} else {
							JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "Cadastro", JOptionPane.WARNING_MESSAGE);
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "Cadastro", JOptionPane.WARNING_MESSAGE);
						}
					
					break;
				case "Mostrar": 
					
					if (cadastroCliente != null) {
						JOptionPane.showMessageDialog(null, cadastroCliente.mostrarDados(), "Cadastro", 
						JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/petshop2.png"));
					} else {
						JOptionPane.showMessageDialog(null, "Não há cadastrados efetuado", "Cadastro", JOptionPane.WARNING_MESSAGE);
					}
					break;
					
				}
					
			} while (!opcaoCadastro.equalsIgnoreCase("Sair"));
		}
		
		
		

	}

}