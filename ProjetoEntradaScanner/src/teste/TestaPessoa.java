package teste;

import java.util.Scanner;

import classes.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		float altura;
		int idade;
		
		//obejeto classe Scanner
		Scanner entrada = new Scanner(System.in);
		//Entradas
		System.out.print("Qual o seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Qual a sua altura: ");
		altura = entrada.nextFloat();
		System.out.print("Qual a sua idade: ");
		idade = entrada.nextInt();
		//Objeto da classe pessoa
		Pessoa pessoa =  new Pessoa(nome, altura, idade); 
		System.out.println(pessoa.mostrarDados());
		
	}

}
