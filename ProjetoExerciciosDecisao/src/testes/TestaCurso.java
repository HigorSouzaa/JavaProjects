package testes;

import javax.swing.JOptionPane;

import classes.Curso;


public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEclara��o variaveis
		String nome;
		String codigo;
		String tipoPagamento;
		
		//Entradas
		nome = JOptionPane.showInputDialog("Ol� Informe seu nome para come�armos");
		codigo = JOptionPane.showInputDialog("Informe o codigo do seu curso dentre:"
				+ "\nIngles = IGL "
				+ "\nEspanho = ESP"
				+ "\nEspanho e Ingles = IGEP");
		tipoPagamento = JOptionPane.showInputDialog("Deseja pagar A vista ?");
		
		Curso curso = new Curso(codigo, tipoPagamento, nome);
		
		//Saida e preocessamento
		curso.calcularValorCurso();
		JOptionPane.showMessageDialog(null, curso.mostrarDados());
		
	}

}
