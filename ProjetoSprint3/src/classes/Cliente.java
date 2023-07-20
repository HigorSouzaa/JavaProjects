package classes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cliente {
	//Variaveis
	public String nome;
	public String cpf;
	public String endereco;
	public String telefone;
	public String sexo;
	public String idade;
	public String nomePet;
	public String animal;
	public String pedigree;
	public String idadePet;
	public String raca;
	public String sexoPet;
	
	//Construtor
	public Cliente(String nome, String cpf, String endereco, String telefone, 
			String sexo, String idade, String nomePet, String animal, String pedigree, String idadePet, String raca,
			String sexoPet) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
		this.idade = idade;
		this.nomePet = nomePet;
		this.animal = animal;
		this.pedigree = pedigree;
		this.idadePet = idadePet;
		this.raca = raca;
		this.sexoPet = sexoPet;
	}

	
	//Metodo
	public String mostrarDados() {
		return  "\nCadastro Confirmado."
				+"\nOlá " + this.nome + "!" 
				+ "\nNome: " + this.nome 
				+ "\nCPF: " + this.cpf
				+ "\nEndereço: " + this.endereco
				+ "\nTelefone: " + this.telefone
				+ "\nSexo: " + this.sexo
				+ "\nIdade: " + this.idade
				+ "\n" + this.nome + " tambem cadastramos seu amiguinho(a) " + this.nomePet
				+ "\nNome: " + this.nomePet
				+ "\nAnimal: " + this.animal
				+ "\nIdade: " + this.idadePet
				+ "\nRaça: " + this.raca
				+ "\nSexo: " + this.sexoPet  + "\n-----------------------\n";
	}

	public void exibir() {
			
	        JFrame frame = new JFrame("Agendamento");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	        JLabel jlNome = new JLabel("Nome");
	        JTextField jtfNome = new JTextField();
	        frame.getContentPane().add(jlNome);
	        frame.getContentPane().add(jtfNome);
	        
	        jlNome.setBounds(10, 20, 50, 20);  //coluna,linha,comprimento e largura
			jtfNome.setBounds(10, 40, 200, 20);
	
	        frame.pack();
	        frame.setVisible(true);
        
        
	}

	
	

}
