package classes;

public class Nadador {
	//declara��o de variaveis
	public String nome;
	public String categoria;
	public int idade;
	
	//Construtor
	public Nadador(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Metodo
	public String classificarCategorias() {
		if (this.idade >= 5 && this.idade <= 7) {
			this.categoria = " Vo�� Infatil A";
	
		} else if (this.idade >= 8 && this.idade <= 11) {
			this.categoria = " voc� perten�e h� categoria: Infantil B";
				
		} else if (this.idade >= 12 && this.idade <= 13) {
			this.categoria = " voc� perten�e h� categoria: Juvenil A";
		
		} else if (this.idade >= 14 && this.idade <= 17) {
			this.categoria = " voc� perten�e h� categoria: Juvenil B";
			
		} else if (this.idade >= 18 && this.idade <= 30) {
			this.categoria = " voc� perten�e h� categoria: Adultos";
			
		} else {
			this.categoria = " voc� nao tem idade pra ser nadador";
		}
		
		return this.categoria;
		
	}
	
	public String mostrarDados() {
		return this.nome + this.classificarCategorias();
	}
	
	
	
}
