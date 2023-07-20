package Testes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Agendamento;



public class TestaAgendamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		   String cliente;
		   String animal;
		   String servico;
		   String data;
		   String hora;
		   String nomeAnimal;
		   
		 //Entradas
		 cliente = JOptionPane.showInputDialog("Ola qual o seu nome: ");
		 nomeAnimal = JOptionPane.showInputDialog("Qual é o nome do nosso amiguinho(a): ");
		 animal = JOptionPane.showInputDialog("Que tipo de animal seria: ");
		 servico = JOptionPane.showInputDialog("Você gostaria de qual serviço: ");
		 data = JOptionPane.showInputDialog("Para qual dia voc� deseja: ");
		 hora = JOptionPane.showInputDialog("Qual horario seria melhor para você: ");

		 //objeto da classe Agendamento
		 Agendamento agendamento = new Agendamento(cliente, animal, servico, data, hora, nomeAnimal);
		 
		 //Saida
		 JOptionPane.showMessageDialog(null, agendamento.mostrarAgendamento(), "Agendamento", 
		 JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/petshop2.png"));
	}

}
