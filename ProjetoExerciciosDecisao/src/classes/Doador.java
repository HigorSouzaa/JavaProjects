package classes;

public class Doador {
	public String nome;
	public String genero;
	public int idade;
	public float peso;

	//Construtor
	public Doador(String nome, String genero, int idade, float peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
	}
	
	//Motodo
	public String mostrarQuantidadeSangue() {
		if (this.idade >= 18) {
			if (this.genero.equalsIgnoreCase("Masculino")) { //Testa se 
				return "Doar 700 gramas";
			} else {
				return "Doar 400 gramas";
			}
		} else {
			return "Vo�� nao pode doar Sangue";
		}
		
	}
	
	public String mostrarDados() {
		return "Ol�, " + this.nome + " como vo�� � do genero: " +  this.genero + " e " + " voce tem: " + this.idade + "anos"
				+ " vo�� pode doar " + this.mostrarQuantidadeSangue();
		
	
	}
	
}
