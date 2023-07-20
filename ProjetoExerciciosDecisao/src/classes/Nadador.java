package classes;

public class Nadador {
	//declaração de variaveis
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
			this.categoria = " Voçê Infatil A";
	
		} else if (this.idade >= 8 && this.idade <= 11) {
			this.categoria = " você pertençe há categoria: Infantil B";
				
		} else if (this.idade >= 12 && this.idade <= 13) {
			this.categoria = " você pertençe há categoria: Juvenil A";
		
		} else if (this.idade >= 14 && this.idade <= 17) {
			this.categoria = " você pertençe há categoria: Juvenil B";
			
		} else if (this.idade >= 18 && this.idade <= 30) {
			this.categoria = " você pertençe há categoria: Adultos";
			
		} else {
			this.categoria = " você nao tem idade pra ser nadador";
		}
		
		return this.categoria;
		
	}
	
	public String mostrarDados() {
		return this.nome + this.classificarCategorias();
	}
	
	
	
}
