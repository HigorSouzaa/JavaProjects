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


public class TelaAluno extends JFrame {

	private JLabel jlNome, jlNota1, jlNota2; //aceita pequenos textos
	private JTextField jtfNome, jtfNota1, jtfNota2; //aceita pequenos textos
	private JButton jbCadastrar, jbMostrar;
	private Aluno aluno = null;
	
	
	public TelaAluno(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);//tamanho da tela
		setLayout(null);//desabilita dimensionamento automatico do java
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a janela e encerra o programa 
		iniciarComponente();
		criarEventos();
	}

	private void iniciarComponente() {
		//objetos
		jlNome = new JLabel("Nome");
		jtfNome = new JTextField();
		
		jlNota1 = new JLabel("Nota1");
		jtfNota1 = new JTextField();
		
		jlNota2 = new JLabel("Nota2");
		jtfNota2 = new JTextField();
		
		jbCadastrar = new JButton("Cadastrar");
		jbMostrar = new JButton("Mostrar");
		
		
		//adicionar a tela
		add(jlNome);
		add(jlNota1);
		add(jlNota2);
		add(jtfNome);
		add(jtfNota1);
		add(jtfNota2);
		add(jbCadastrar);
		add(jbMostrar);
		
		//dimencionamento
		jlNome.setBounds(10, 20, 50, 20);  //coluna,linha,comprimento e largura
		jtfNome.setBounds(20, 40, 200, 20);
		
		jlNota1.setBounds(10, 70, 50, 20);  //coluna,linha,comprimento e largura
		jtfNota1.setBounds(20, 90, 50, 20);
		
		jlNota2.setBounds(160, 70, 50, 20);  //coluna,linha,comprimento e largura
		jtfNota2.setBounds(160, 90, 50, 20);
		
		jbCadastrar.setBounds(60, 120, 100, 20);
		jbMostrar.setBounds(60, 150, 100, 20);
	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			//declaração de variaveis	
			String nome;
			float nota1, nota2;	
			
			
			//validação do campo em branco
			if (!jtfNome.getText().isEmpty() 
				&&	!jtfNota1.getText().isEmpty()
				&&	!jtfNota2.getText().isEmpty()) {
				 
				//entradas
				nome = jtfNome.getText();
				nota1 = Float.parseFloat(jtfNota1.getText()); //transformando Float em String 
				nota2 = Float.parseFloat(jtfNota2.getText()); //transformando Float em String 
				
				//processamento
				aluno = new Aluno(nome, nota1, nota2);
				aluno.calcularMedia();
				aluno.mostrarStatus();
				
				//limpar os campos
				jtfNome.setText("");
				jtfNota1.setText("");
				jtfNota2.setText("");
				
			} else {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos", "A Escola", JOptionPane.WARNING_MESSAGE);
			}
			
			
			}
		});//Fim Cadastrar
		
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//valição do objeto nulo
				if (aluno != null) {
					JOptionPane.showMessageDialog(null, aluno.mostraDados());
				} else {
					JOptionPane.showMessageDialog(null, "Aluno nao cadastrado", "A Escola", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
	}

}
