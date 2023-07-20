package teste;

import java.util.Scanner;

import classes.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		
		String nome;
		float nota1, nota2, media;
		
		//Declaração de classe
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual seu nome: ");
		nome = entrada.nextLine();
		
		System.out.print("Qual foi sua primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Qual foi sua segunda nota: ");
		nota2 = entrada.nextFloat();
		
		//Declaracao da classe aluno
		
		Aluno aluno = new Aluno(nome, nota1, nota2);
		
		//Processamento
		
		aluno.calcularMedia();
		
		//Saida
		
		System.out.println(aluno.mostraDados());
		
		

	}

}
