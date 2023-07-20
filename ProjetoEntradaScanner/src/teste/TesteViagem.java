package teste;

import java.util.Scanner;

import classes.Viagem;

public class TesteViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float velocidade, tempo, kmPorLitros;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua Velocidade: ");
		velocidade = entrada.nextFloat();
		System.out.print("Informe seu Tempo: ");
		tempo = entrada.nextFloat();
		System.out.print("Informe quantos km/l seu veiculo faz: ");
		kmPorLitros = entrada.nextFloat();
		
		Viagem viagem = new Viagem(velocidade, tempo, kmPorLitros);
		
		viagem.calculoDistancia();
		viagem.calculoLitrosUsados();
		
		System.out.println(viagem.mostrarResultado());
		
		
		

	}

}
 