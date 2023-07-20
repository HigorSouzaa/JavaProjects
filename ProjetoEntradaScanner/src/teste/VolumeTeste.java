package teste;

import java.util.Scanner;

import classes.Volume;

public class VolumeTeste {

	public static void main(String[] args) {
		
		// Variaveis
		float volume, altura, comprimento, largura;
		//importação Do Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		System.out.print("Entre com a altura: ");
		altura = entrada.nextFloat();
		System.out.print("Entre com a comprimento: ");
		comprimento = entrada.nextFloat();
		System.out.print("Entre com a largura: ");
		largura = entrada.nextFloat();
		
		//Importa a classe Volume
		Volume volume1 = new Volume(largura, altura, comprimento);
		
		//Processamento
	    volume1.calcularVolume();
	    
	    //Saída
	    System.out.println(volume1.mostrarDados());
	    
	}
	
	

}
