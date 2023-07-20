package classes;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
        //declaração e atribuição das variaveis
		double valor,taxa,prestacao,meses;
		
		//objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		System.out.print("Entre com o valor: ");
		valor = entrada.nextDouble();
		System.out.print("Entre com a porcentagem da taxa: ");
		taxa = entrada.nextDouble();
		System.out.print("Entre com a quantidade de meses: ");
		meses = entrada.nextDouble();
		
		//processamento
		prestacao = valor + (valor * (taxa/100) * meses);
		
		//saida
		System.out.println("Nova Prestação: " + prestacao + " $Reais");
			
	}
	
	


}
