 package classes;

public class Aluno {
	//Atributos
	public float nota1;
	public float nota2;
	public String nome;
	public float media;
	public String statusAluno;
	
	//Construtor
	public Aluno(float nota1, float nota2, String nome) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nome = nome;
	
	
	}

	//M�todo
	public String mostrarDados() {
		return "\nNome: " + this.nome 
				+ "\nNota1: " + this.nota1
				+ "\nNota2: " + this.nota2	
				+ "\nMedia: " + this.media
				+"\nAluno: " + this.statusAluno
				+ "\n**********************\n\n";
		
	}
public void calcularMedia(){
	this.media = (this.nota1 + this.nota2)/2;	

}
public void verificarStatusAluno() {
	this.statusAluno = this.media >= 5 ? "Aprovado" : "Reprovado";
}


}


