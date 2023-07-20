package classes;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import classes.Usuario;

public class TelaLogin extends JFrame {

	private JLabel jlLogin, jlSenha;
	private JTextField jtfLogin;
	private JPasswordField jpfSenha;
	private JButton jbtLogar, jbtCadastrar;
	private Usuario [] usuarios = new Usuario[40];
	private int indice = 0;
	
	
	public TelaLogin(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setSize(250, 250);//tamnho da tela 
		setLayout(null);//dasabilita o dimensionamento automatico do java
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(this);//centraliza a tela
		iniciarComponente();
		criarEventos();
	}

	private void iniciarComponente() {
		// TODO Auto-generated method stub
	jlLogin = new JLabel("Login");
	jlSenha = new JLabel("Senha");
	jtfLogin = new JTextField();
	jpfSenha = new JPasswordField();
	jbtLogar = new JButton("Logar");
	jbtCadastrar = new JButton("Cadastrar");
	
	
	add(jlLogin);
	add(jlSenha);
	add(jtfLogin);
	add(jpfSenha);
	add(jbtLogar);
	add(jbtCadastrar);
	
	jlLogin.setBounds(80, 10, 50, 20);
	jtfLogin.setBounds(80, 30, 80, 20);
	jlSenha.setBounds(80, 50, 80, 20);
	jpfSenha.setBounds(80, 70, 80, 20);
	jbtLogar.setBounds(70, 115, 100, 20);
	jbtCadastrar.setBounds(70, 155, 100, 20);
	
	
	
	}

	private void criarEventos() {
		// TODO Auto-generated method stub
		//botao cadastrar
		jbtCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				TelaCadastro cadastro= new TelaCadastro("Cadastro",usuarios,indice);
				cadastro.setVisible(true);
				indice ++;
			}
		});
		jbtLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (usuarios[0] != null) {
					for (int i = 0; i< indice;i++) {
						if (usuarios[i].login.equals(jtfLogin.getText()) && usuarios[i].senha.equals(String.valueOf(jpfSenha.getPassword()))){//valueof converte para string.
							
							
							TelaDoador doador = new TelaDoador("Doa��o de sangue");
							doador.setVisible(true);
							
							
							setVisible(false);//deixa a tela login invisivel
							break;
						}
					}
				
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum Usuarios  Cadastrar");
				}
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		TelaLogin login = new TelaLogin("login");
		login.setVisible(true);
	}

}
