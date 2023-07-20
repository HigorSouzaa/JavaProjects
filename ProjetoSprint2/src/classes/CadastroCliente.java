package classes;

public class CadastroCliente {
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
	public CadastroCliente(String nome, String cpf, String endereco, String telefone, 
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
		return  "Cadastro Confirmado."
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
				+ "\nSexo: " + this.sexoPet;
	}


	
	

}
