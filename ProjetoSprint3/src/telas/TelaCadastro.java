package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arquivos.LerEscreverObjetos;
import classes.Usuario;

public class TelaCadastro extends JFrame {
	private JLabel jlLogin, jlSenha;
	private JTextField jtfLogin;
	private JPasswordField jpfSenha;
	private JButton jbCadastrar;
	private List<Usuario> usuarios;

	public TelaCadastro(String title,List<Usuario> usuarios) throws HeadlessException {
		super(title);
		this.usuarios = usuarios;
		
		setSize(250, 250);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		setLocationRelativeTo(this);;
		getContentPane().setBackground(Color.ORANGE);
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
		
		jbCadastrar = new JButton("Cadastrar");
		
		add(jbCadastrar);
		add(jlLogin);
		add(jlSenha);
		add(jpfSenha);
		add(jtfLogin);
		
		jlLogin.setBounds(80, 10, 50, 20);
		jtfLogin.setBounds(80, 30, 80, 20);
		jlSenha.setBounds(80, 50, 50, 20);
		jpfSenha.setBounds(80, 70, 80, 20);
		
		jbCadastrar.setBounds(70, 100, 100, 20);

	}
	
	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String login, senha;
						 
					login = jtfLogin.getText();
					senha = String.valueOf(jpfSenha.getPassword()); // comverte char em String

					usuarios.add(new Usuario(login, senha));
					setVisible(false);
					LerEscreverObjetos gravar = new LerEscreverObjetos("Usuario.bin");
					gravar.escreverObjeto(usuarios, null, null);
						

					
					
			}});// Fim Cadastro
	
		
	}

}
