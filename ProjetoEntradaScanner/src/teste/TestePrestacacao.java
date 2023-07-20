package teste;

import java.util.Scanner;

import classes.Prestacacao;

public class TestePrestacacao {

	public static void main(String[] args) {
		
		float valor, taxa, prestacacao;
		int meses;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o valor: ");
		valor = entrada.nextFloat();
		System.out.print("Entre com a taxa: ");
		taxa = entrada.nextFloat();
		System.out.print("Entre com o meses: ");
		meses = entrada.nextInt();
		
		Prestacacao prestacacao1 = new Prestacacao(valor, taxa, meses);
		
		prestacacao1.calculoPrestacacao();
		
		System.out.print(prestacacao1.mostrarDados());
		

	}

}
