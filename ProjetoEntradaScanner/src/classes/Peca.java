package classes;

public class Peca {
public String codigopeca;
public float valortotal;
public float valordapeca;
public int quantidadepeca;

public Peca(String codigopeca, float valordapeca, int quantidadepeca) {
	super();
	this.codigopeca = codigopeca;
	this.valordapeca = valordapeca;
	this.quantidadepeca = quantidadepeca;
}

public String mostrarDados() {
	return "A peça: " + this.codigopeca + " esta como o valor total de: R$" + this.valortotal;
}

public void calculoValorTotal() {
	this.valortotal = this.valordapeca*this.quantidadepeca;
}

	

}
