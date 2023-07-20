package teste;

import java.util.Scanner;

import classes.Peca;

public class TestePeca {

	public static void main(String[] args) {
		
		String codigopeca;
		float valordapeca, valortotal;
		int quantidadepeca;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o codigo da Pe�a: ");
		codigopeca = entrada.next();
		System.out.print("Digite a Quantidade de Pe�a: ");
		quantidadepeca = entrada.nextInt();
		System.out.print("Digite o valor da Pe�a: ");
		valordapeca = entrada.nextFloat();
		
		Peca pecas = new Peca(codigopeca, valordapeca, quantidadepeca);
		
		pecas.calculoValorTotal();
		
		System.out.print(pecas.mostrarDados());
		

	}

}
