package teste;

import java.util.Scanner;

import classes.Retangulo;

public class TesteRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largura, altura, comprimento;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		altura = entrada.nextInt();
		System.out.print("Informe a  largura: ");
		largura = entrada.nextInt();
		System.out.print("Informe o comprimento:  ");
		comprimento = entrada.nextInt();
		
		Retangulo retangulo = new Retangulo(largura, comprimento, altura);
		
		retangulo.calculoVolume();
		
		System.out.print(retangulo.mostrarDados());
		
		
	}

}
