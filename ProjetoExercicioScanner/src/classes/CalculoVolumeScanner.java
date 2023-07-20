package classes;

import java.util.Scanner;

public class CalculoVolumeScanner {

	public static void main(String[] args) {
		//declaração variaveis
		int largura,comprimento,altura,volume;
		//objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		//Entradas
		System.out.print("Entre com o valor da largura: ");
		largura = entrada.nextInt(); // Espera a entrada de um numero inteiro
		System.out.print("Entre com o valor do comprimento: ");
		comprimento = entrada.nextInt();
		System.out.print("Entre com o valor do altura: ");
		altura = entrada.nextInt();
		
		//Processamento
		volume = (altura*comprimento*largura)/100;
		
		//Saida
		System.out.print("O volume da sua caixa é de: " + volume + "m³");
	} 

}
