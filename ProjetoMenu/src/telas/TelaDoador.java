package telas;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import classes.Aluno;
import classes.Doador;

public class TelaDoador extends JFrame {
	
	private JLabel jlNome, jlPeso, jlIdade, jlGenero;
	private JTextField jtfNome, jtfPeso, jtfIdade, jtfGenero;
	private JButton jbCadastrar, jbMostrar;
	private Doador doador = null;
	
	public TelaDoador(String title) throws HeadlessException {
		super(title);
		setSize(410, 400);//tamanho da tela
		setLayout(null);//desabilita dimensionamento automatico do java
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a janela e encerra o programa 
		iniciarComponente();
		criarEventos();
	}

	private void iniciarComponente() {
		
		//Objetos
		jlNome = new JLabel("Nome");
		jtfNome = new JTextField();
		
		jlPeso = new JLabel("Peso");
		jtfPeso  = new JTextField();
		
		jlIdade = new JLabel("Idade");
		jtfIdade = new JTextField();
		
		jlGenero = new JLabel("Genero");
		jtfGenero = new JTextField();
		
		jbCadastrar = new JButton("Cadastrar");
		jbMostrar = new JButton("Mostrar");
		
		//adicionar a tela
		add(jlNome);
		add(jtfNome);
		
		add(jlPeso);
		add(jtfPeso);
		
		add(jlIdade);
		add(jtfIdade);

		add(jlGenero);
		add(jtfGenero);
		
		add(jbCadastrar);
		add(jbMostrar);
		
		//dimencionamento
		jlNome.setBounds(10, 20, 50, 20);  //coluna,linha,comprimento e largura
		jtfNome.setBounds(10, 40, 210, 20);
		
		jlPeso.setBounds(10, 60, 50, 20);  //coluna,linha,comprimento e largura
		jtfPeso.setBounds(10, 80, 50, 20);
		
		jlIdade.setBounds(90, 60, 50, 20);  //coluna,linha,comprimento e largura
		jtfIdade.setBounds(90, 80, 50, 20);
		
		jlGenero.setBounds(170, 60, 50, 20);  //coluna,linha,comprimento e largura
		jtfGenero.setBounds(170, 80, 50, 20);

		jbCadastrar.setBounds(65, 120, 100, 20);
		jbMostrar.setBounds(65, 150, 100, 20);
		
	}

	private void criarEventos() {
		// TODO Auto-generated method stub
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (!jtfNome.getText().isEmpty() 
				&&	!jtfPeso.getText().isEmpty()
				&&	!jtfGenero.getText().isEmpty()
				&&	!jtfIdade.getText().isEmpty()) {
					String nome;
					String genero;
					int idade;
					float peso;
					
					nome = jtfNome.getText();
					genero = jtfGenero.getText();
					idade = Integer.parseInt(jtfIdade.getText());
					peso = Float.parseFloat(jtfPeso.getText());
					
					doador = new Doador(nome, peso, idade, genero);
					doador.mostrarQuantidadeSangue();
					
					jtfNome.setText("");
					jtfPeso.setText("");
					jtfIdade.setText("");
					jtfGenero.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Doador", JOptionPane.WARNING_MESSAGE);
				}
			}
		});//Fim Cadastrar
		
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (doador != null) {
					JOptionPane.showMessageDialog(null, doador.mostrarQuantidadeSangue());
				} else {
					JOptionPane.showMessageDialog(null, "Doador nao cadastrado", "Doador", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
	}

}