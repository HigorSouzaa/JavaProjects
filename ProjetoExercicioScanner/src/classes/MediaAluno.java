package classes;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracao
		String nome;
		double nota1, nota2, media;
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		
		System.out.print("Escreva seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe sua Primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Informe sua Segunda nota: ");
		nota2 = entrada.nextDouble();
		
		//Processamento
		media = (nota1+nota2)/2;
		
		//Saída
		System.out.print(nome + " sua media é de " + media);
	}

}
