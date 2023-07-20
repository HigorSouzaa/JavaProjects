package telas;

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

public class TelaUsario extends JFrame {
	private JLabel jlLogin, jlSenha;
	private JTextField jtfLogin;
	private JPasswordField jpfSenha;
	private JButton jbLogar, jbCadastrar;
	private	Usuario[] usuarios = new Usuario[40];
	private int indice = 0;
	
	
	
	public TelaUsario(String title) throws HeadlessException {
		super(title);
		setSize(250, 250);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		setLocationRelativeTo(this);;
		getContentPane().setBackground(Color.white);
		iniciarComponente();
		criarEventos();
	}

	private void iniciarComponente() {
		jlLogin = new JLabel("Login:");
		jlSenha = new JLabel("Senha:");
		
		jtfLogin = new JTextField();
		jpfSenha = new JPasswordField();
		
		jbLogar = new JButton("Logar");
		jbCadastrar = new JButton("Cadastrar");
		
		add(jbCadastrar);
		add(jbLogar);
		add(jlLogin);
		add(jlSenha);
		add(jpfSenha);
		add(jtfLogin);
		
		jlLogin.setBounds(80, 10, 50, 20);
		jtfLogin.setBounds(80, 30, 80, 20);
		jlSenha.setBounds(80, 50, 50, 20);
		jpfSenha.setBounds(80, 70, 80, 20);
		
		jbCadastrar.setBounds(70, 100, 100, 20);
		jbLogar.setBounds(70, 125, 100, 20);
	
	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro cadastro = new TelaCadastro("Cadastro",usuarios,indice);
				cadastro.setVisible(true);
				indice++;
				
				
				
			}
		});// Fim cadastrar
		
		jbLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botao login
				if (usuarios[0] !=null) {
					for (int i = 0; i < indice; i++) {
						if (usuarios[i].login.equals(jtfLogin.getText())
								&& usuarios[i].senha.equals(String.valueOf(jpfSenha.getPassword()))) {
									TelaDoador doador = new TelaDoador("Doação de Sangue");
									doador.setVisible(true);doador.setVisible(true);
									setVisible(false);
									break;
						
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado", "Login", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		
	}
 
	public static void main(String[] args) {
		TelaUsario login = new TelaUsario("Login");
		login.setVisible(true);
	}
}
