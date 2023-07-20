package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arquivos.LerEscreverObjetos;
import classes.Usuario;

public class TelaLogin extends JFrame {
	private JLabel jlLogin, jlSenha;
	private JTextField jtfLogin;
	private JPasswordField jpfSenha;
	private JButton jbLogar, jbCadastrar;
	private	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public TelaLogin(String title) throws HeadlessException {
		super(title);
		setSize(250, 250);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		setLocationRelativeTo(this);;
		getContentPane().setBackground(Color.orange);
		leituraArquivo();
		iniciarComponente();
		criarEventos();
	}

	
	private void iniciarComponente() {
		
		URL url = this.getClass().getResource("/img/petshop2.png");
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(iconeTitulo);
		
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
				TelaCadastro cadastro = new TelaCadastro("Cadastro", usuarios);
				cadastro.setVisible(true);
				
				
				
			}
		});// Fim cadastrar
		
		jbLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botao login
				if (usuarios !=null) {
					for (Usuario usuario : usuarios) {
						if (usuarios != null) {
							if (usuario.login.equals(jtfLogin.getText())
									&& usuario.senha.equals(String.valueOf(jpfSenha.getPassword()))) {
										TelaPrincipal principal = new TelaPrincipal("Menu Principal");
										principal.setVisible(true);
										setVisible(false);
										break;

							}
						}	
					}			
					
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado", "Login", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});// Fim Logar
			
	}
	
	private void leituraArquivo() {
		LerEscreverObjetos leitura = new LerEscreverObjetos("Usuarios.bin");
		if (leitura.lerObjeto() != null) {
			usuarios = leitura.lerObjeto(); 
		}
		
		
	}

 
	public static void main(String[] args) {
		TelaLogin login = new TelaLogin("Login");
		login.setVisible(true);
	}
}

