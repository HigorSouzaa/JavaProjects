package teste;

import java.util.Scanner;

import classes.Quadrado;

public class TesteQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a, b, c;
	int resultado;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Entre com o valor de a: ");
	a = entrada.nextInt();
	System.out.print("Entre com o valor de b: ");
	b = entrada.nextInt();
	System.out.print("Entre com o valor de c: ");
	c = entrada.nextInt();
	
	Quadrado quadrado = new Quadrado(a, b, c);
	
	

	
	
	}

}
