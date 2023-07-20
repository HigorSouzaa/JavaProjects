package classes;

public class Quadrado {
	//Variaveis
	
	public int a;
	public int b;
	public int c;
	public int resultado;

	//Contrutor 

	public Quadrado(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void calcularResultado() {
		this.resultado = this.a + this.b + this.c;
		
	}

	public String mostrarDados() {
		return "";
	}
}
