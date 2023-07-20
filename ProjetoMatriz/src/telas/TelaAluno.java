package telas;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Aluno;

public class TelaAluno extends JFrame {
	private Aluno[] alunos = new Aluno[40]; //Matriz 
	private JLabel jlNome, jlNota1, jlNota2, jlImagem;//Aceita pequenos textos
	private JTextField jtfNome, jtfNota1, jtfNota2;//Aceita qualquer 
	private JButton jbCadastrar, jbMostrar;
	private JTextArea jtaMostrar;
	private JScrollPane jspMostrar;
	private ImageIcon imagem;
	private int indice = 0;
	

	public TelaAluno(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		iniciarComponente();
		criarEventos();
		
	}


	private void iniciarComponente() {
		
		//Objetos
		imagem = new ImageIcon(getClass().getResource("/img/escolar.png"));
		jlImagem = new JLabel(imagem);
		jlNome = new JLabel("Nome");
		jtfNome = new JTextField();
		jlNota1 = new JLabel("Nota 1");
		jtfNota1 = new JTextField();
		jlNota2 = new JLabel("Nota 2");
		jtfNota2 = new JTextField();
		jbCadastrar = new JButton("Cadastrar");
		jbMostrar = new JButton("Mostrar");
		jtaMostrar = new JTextArea();
		jspMostrar = new JScrollPane(jtaMostrar);
		
		
		//Adicionar objeto � tela
		add(jlImagem);
		add(jlNome);	
		add(jtfNome);
		add(jlNota1);
		add(jtfNota1);
		add(jlNota2);
		add(jtfNota2);
		add(jbCadastrar);
		add(jbMostrar);
		add(jspMostrar);
		
		
		//Dimensionamento
		jlNome.setBounds(10, 20, 50, 20);
		jtfNome.setBounds(10, 40, 200, 20);
		jlNota1.setBounds(10, 70, 50, 20);
		jtfNota1.setBounds(10, 90, 50, 20);
		jlNota2.setBounds(160, 70, 50, 20);
		jtfNota2.setBounds(160, 90, 50, 20);
		jbCadastrar.setBounds(10, 120, 95, 20);
		jbMostrar.setBounds(115, 120, 95, 20);
		jspMostrar.setBounds(10, 160, 200, 150);
		jlImagem.setBounds(230, 30, 130, 130);
		
		
	}
	
	private void criarEventos() {
		//Criar evento do bot�o Cadastrar
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declarar as vari�veis
				String nome;
				float nota1, nota2;
				
				//A valida��o do campo em vazio
				if (!jtfNome.getText().isEmpty() 
					&& !jtfNota1.getText().isEmpty() 
					&& !jtfNota2.getText().isEmpty()) {
						
					
					
					//Entradas
					nome = jtfNome.getText();
					nota1 = Float.parseFloat(jtfNota1.getText());
					nota2 = Float.parseFloat(jtfNota2.getText());
					
					//Objeto da classe Aluno
					alunos[indice] = new Aluno(nota1, nota2, nome);
					
					//Processamento
					alunos[indice].calcularMedia();
					alunos[indice].verificarStatusAluno();
					indice++;
					
					//Limpar os campos
					jtfNome.setText("");
					jtfNota1.setText("");
					jtfNota2.setText("");
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Não há alunos cadastrados", "A Escola", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
				
				
			}
		});//Fim do evento
		
		//Evento do bot�o Mostrar
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Valida��o do objeto nulo
				if (alunos[0] != null) {
					jtaMostrar.setText("\t A Escola\n");
					for (int i = 0; i < indice; i++) {
						jtaMostrar.append(alunos[i].mostrarDados());
						
					}
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum aluno foi cadastrado", "A Escola", JOptionPane.WARNING_MESSAGE);
				}

			}
				
			
		});
	

		}
	
		public static void main(String[] args) {
			TelaAluno aluno = new TelaAluno("Escola");
			aluno.setVisible(true);
		}
	}
	
