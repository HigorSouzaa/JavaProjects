package classes;

public class Doador {
	public String nome;
	public String genero;
	public float peso;
	public int idade;
	
	public Doador(String nome, String genero, float peso, int idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.idade = idade;
	}
	
	//MÉTODO
	public String mostrarDados() {
		return "Nome: " + this.nome
				+"\nGenero: " + this.genero
				+"\nPeso: " + this.peso
				+"\nIdade: " + this.idade + "anos"
				+"\nQuantidade de Sangue:" + mostrarQuantidadeSangue() ;
	}
		//Verifica a idade do doador, o peso e determina se pode doar
		public String mostrarQuantidadeSangue() {
			String texto;
			if (this.idade >= 16 && this.idade <= 69 && this.peso >= 50) {
				if (this.genero.equalsIgnoreCase("Masculino")) {
					return "Doar 700 gramas";
					
				} else {
					return "Doar 400 gramas";

				}
				
				} else {
				return "Não pode doar sangue";

			}
			
		}


	
	}
	
	


