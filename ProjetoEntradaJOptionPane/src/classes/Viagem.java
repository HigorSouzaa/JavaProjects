package classes;

public class Viagem {
	public float velocidade;
	public float tempo;
	public float distancia;
	public float litrosUsados;
	public float kmPorLitros;
	
	
	public Viagem(float velocidade, float tempo, float kmPorLitros) {
		super();
		this.velocidade = velocidade;
		this.tempo = tempo;
		this.kmPorLitros = kmPorLitros;
	}

	public void calculoDistancia () {
		this.distancia = this.velocidade*this.tempo;
	}
	
	public void calculoLitrosUsados() {
		this.litrosUsados = this.distancia / this.kmPorLitros;
	}
	
	public String mostrarResultado() {
		return   "Sua Velocidade foi de: " + this.velocidade + "km"
				+   "\nSeu tempo foi de: " + this.tempo + "h"
				+   "\nSua distância percorrida foi de: " + this.distancia + "Km/h"
				+	"\nA quantidade de litros usados foi de: " + this.litrosUsados + " Litros";
		
		
	}

}
