package classes;

public class Prestacacao {
public float valor;
public float taxa;
public float prestacacao;
public int meses;
public Prestacacao(float valor, float taxa, int meses) {
	super();
	this.valor = valor;
	this.taxa = taxa;
	this.meses = meses;
}

public void calculoPrestacacao () {
	this.prestacacao = this.valor + (this.valor *(this.taxa/100)) * this.meses;
}
public String mostrarDados () {
	return "Sua nova Prestação é de: R$" + this.prestacacao;
	
}
}
