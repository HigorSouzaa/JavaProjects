package classes;

public class Pessoa {
	//Atributos
public String nome;
public float altura;
public int idade;
//Construtor
public Pessoa(String nome, float altura, int idade) {
	super();
	this.nome = nome;
	this.altura = altura;
	this.idade = idade;
}
//Metodo
public String mostrarDados() {
	return "Nome: " + this.nome
			+"\nAltura: " + this.altura
			+"\nIdade: " + this.idade;
			
}


}