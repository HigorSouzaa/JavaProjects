package classes;

public class Paciente {
	public String nome;
	public String genero;
	public float altura;
	
	//Construtor
	public Paciente(String nome, String genero, float altura) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.altura = altura;
	}
	
	//Metodo
	public float calcularPesoIdeal() {
		if (this.genero.equals("Feminino")) {
			return (float) ((62.1 * this.altura) - 44.7);
		} else {
			return (float) ((72.7 * this.altura) - 58);
			
		}
	}
	
}
