package testes;

import javax.swing.JOptionPane;

import classes.Viagem;

public class TestaViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float velocidade,tempo,kmPorLitros;
		
		//Entrada
		velocidade = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua velocidade: ","A Viagem",JOptionPane.OK_CANCEL_OPTION));
		tempo = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe seu tempo: ","A Viagem",JOptionPane.INFORMATION_MESSAGE));
		kmPorLitros = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe quantos Km/l seu veiculo faz: ","A Viagem",JOptionPane.INFORMATION_MESSAGE));
		//Declaracao Objeto classe Viagem
		Viagem viagem = new Viagem(velocidade, tempo, kmPorLitros);
		//Processamento
		viagem.calculoDistancia();
		viagem.calculoLitrosUsados();
		//Saida
		JOptionPane.showMessageDialog(null, viagem.mostrarResultado());
		
		

	}

}
