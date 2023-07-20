package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Doador;
import classes.Pessoa;

public class TelaPessoa extends JFrame {
	private JLabel jlNome,jlIdade, jlEndereco, jlTelefone, jlCpf;
	private JTextField jtfNome, jtfIdade, jtfEndereco, jtfTelefone, jtfCpf; //Usado para pequenos textos
	private JButton jbCadastrar, jbMostrar;
	private JTextArea jtaMostrar; //Usado para grande textos
	private JScrollPane jspMostrar; //Barra de rolagem
	private Pessoa[] pessoas = new Pessoa[40];
	private int indice = 0;

	public TelaPessoa(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		setLocationRelativeTo(this);
		iniciarComponente();
		criarEventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
	}

	

	private void iniciarComponente() {
		
		//Objetos
		jlNome = new JLabel("Nome");
		jtfNome = new JTextField();
		jlIdade = new JLabel("Idade");
		jtfIdade = new JTextField();
		jlEndereco = new JLabel("Endereço");
		jtfEndereco = new JTextField();
		jlTelefone = new JLabel("Telefone");
		jtfTelefone = new JTextField();
		jbCadastrar = new JButton("Cadastrar");
		jbMostrar = new JButton("Mostrar");
		jtaMostrar = new JTextArea();
		jspMostrar = new JScrollPane(jtaMostrar);
		jtfCpf = new JTextField();
		jlCpf = new JLabel("CPF");
		
		
		
		
		//Adicionar objeto � tela
		add(jlNome);
		add(jtfNome);
		add(jlTelefone);
		add(jtfTelefone);
		add(jlIdade);
		add(jtfIdade);
		add(jlEndereco);
		add(jtfEndereco);
		add(jbCadastrar);
		add(jbMostrar);
		add(jspMostrar);
		add(jlCpf);
		add(jtfCpf);
		
		//Dimensionamento
		jlNome.setBounds(10, 40, 50, 20);
		jtfNome.setBounds(10, 60, 210, 20);
		jlIdade.setBounds(160, 80, 50, 20);
		jtfIdade.setBounds(160, 100, 60, 20);
		jlEndereco.setBounds(10, 80, 80, 20);
		jtfEndereco.setBounds(10, 100, 110, 20);
		jlTelefone.setBounds(10, 120, 80, 20);
		jtfTelefone.setBounds(10, 140, 110, 20);
		jlCpf.setBounds(130, 120, 70, 20);
		jtfCpf.setBounds(130, 140, 90, 20);
		jbCadastrar.setBounds(10, 180, 100, 20);
		jbMostrar.setBounds(120, 180, 100, 20);
		jspMostrar.setBounds(10, 220, 210, 120);

	
		
	}	
	
	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!jtfNome.getText().isEmpty() 
					&& !jtfIdade.getText().isEmpty() 
					&& !jtfEndereco.getText().isEmpty() 
					&& !jtfTelefone.getText().isEmpty() 
					&& !jtfCpf.getText().isEmpty()) {
					
						String nome, idade, endereco, cpf, telefone;
						
						//Entradas
						
						nome =  jtfNome.getText();
						endereco = jtfEndereco.getText();
						idade = jtfIdade.getText();
						cpf = jtfCpf.getText();
						telefone = jtfTelefone.getText();
						
						//objeto da classe
						pessoas[indice] = new Pessoa(nome, idade, endereco, telefone, cpf);
						indice++;
						
						jtfNome.setText("");
						jtfIdade.setText("");
						jtfTelefone.setText("");
						jtfEndereco.setText("");
						jtfCpf.setText("");
						
						
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Pessoa", JOptionPane.WARNING_MESSAGE);
				}
								
			}
		});  // Fim jbCadastrar
		
		jbMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("\t Pessoa \n");
				if (pessoas[0] !=null) {
					for (int i = 0; i < indice; i++) {
						jtaMostrar.append(pessoas[i].mostrarDados());
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nenhuma pessoa encontrada", "Pessoa", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}); // Fim jbMostrar
	}
	
	public static void main(String[] args) {
		TelaPessoa pessoa = new TelaPessoa("Pessoa");
		pessoa.setVisible(true);
	}
}
