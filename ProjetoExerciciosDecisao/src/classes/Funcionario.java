package classes;

public class Funcionario {
	public String nome;
	public float salario;
	public int identificacao;
	
	//Construtor
	public Funcionario(String nome, float salario, int identificacao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.identificacao = identificacao;
	}
	
	//Metodo
	public float calcularReajusteSalario() {
		if (this.salario > 500) {
			if (this.salario <= 1000) {
				this.salario = (float) (this.salario * 1.10);
			} else {
				this.salario = (float) (this.salario * 1.05);
			}
		} else {
			this.salario = (float) (this.salario * 1.15);
		}
		return this.salario;
	}
	
	//Metodo 
	public String mostrarRajutes() {
		return "Olá " + this.nome 
				+ "\nIdentificação: " + this.identificacao 
				+ "\nSeu salario reajustado é de: " + this.salario;
	}
}
