package classes;

public class Volume {
public float largura;
public float altura;
public float comprimento;
public float volume;

//Contrução
public Volume(float largura, float altura, float comprimento) {
	super();
	this.largura = largura;
	this.altura = altura;
	this.comprimento = comprimento;
}

public String mostrarDados () {
	return "Seu volume é de: " + this.volume + "cm³";
	
	
}

public void calcularVolume () {
	this.volume = this.altura * this.comprimento * this.largura;
}

}
