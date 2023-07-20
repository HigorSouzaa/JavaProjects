package classes;

public class Retangulo {
	public int largura;
	public int comprimento; 
	public int altura;
	public float volume;
	
	
	public Retangulo(int largura, int comprimento, int altura) {
		super();
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	
	public void calculoVolume () {
		this.volume = this.altura*this.comprimento*this.largura;
	}
	

	
	public String mostrarDados () {
		return "Sua largura �: " + this.largura
			+ "\nSua altura �: " + this.altura
			+ "\nSeu comprimento e de : " + this.comprimento
			+ "\nSeu volume � de: " + this.volume + "cm�";
		
	}
	
	
	
	
	

}
