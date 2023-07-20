package classes;

public class Aluno {
	//Atributos
public String nome;
public float nota1;
public float nota2;
public float media;
public String statusAluno;
	//Construtor
public Aluno(String nome, float nota1, float nota2) {
	super();
	this.nome = nome;
	this.nota1 = nota1;
	this.nota2 = nota2;
}	
	//Metodo
public String mostraDados () {
		return "Nome: " + this.nome
				+ "\nPrimeira Nota: " + this.nota1
				+ "Segunda Nota: " + this.nota2
				+ "\nMedia: " + this.media
				+ "\nAluno: " + this.statusAluno;
} 

public String mostrarStatus()  {
	if (this.media >= 5) {
		this.statusAluno = "Aprovado";
	}
	
	if (this.media <= 5) {
		this.statusAluno = "Reprovado";
	}
	return nome;

}


public void calcularMedia() {
	this.media = (this.nota1 + this.nota2)/2;

}
}