package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Doador;

public class TelaDoador extends JFrame {
	private JLabel jlNome,jlIdade, jlPeso, jlGenero,jlImagem;
	private JTextField jtfNome, jtfIdade, jtfPeso; //Usado para pequenos textos
	private JButton jbCadastrar, jbMostrar;
	private JTextArea jtaMostrar; //Usado para grande textos
	private JScrollPane jspMostrar; //Barra de rolagem
	private JRadioButton jrbMasculino, jrbFeminino;
	private ButtonGroup bgGenero;//Agrupa os radios buttons para que somente um seja selecionado
	private Doador[] doadors = new Doador[40];
	private ImageIcon imagem;
	private int indice = 0;
	

	public TelaDoador(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);//Tamanho da tela
		setLayout(null);//Desabilita o dimensionamento 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha a janela e encerra o programa
		iniciarComponente();
		criarEventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.pink);
	}
	
	
	private void iniciarComponente() {
		
		URL url = this.getClass().getResource("/img/favIcon.png");
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(iconeTitulo);
		
		
		//Objetos
		imagem = new ImageIcon(getClass().getResource("/img/icon.png"));
		jlImagem = new JLabel(imagem);
		jlNome = new JLabel("Nome");
		jtfNome = new JTextField();
		jrbFeminino = new JRadioButton("Feminino", true);
		bgGenero = new ButtonGroup();
		jrbMasculino = new JRadioButton("Masculino");
		bgGenero = new ButtonGroup();
		jlIdade = new JLabel("Idade");
		jtfIdade = new JTextField();
		jlPeso = new JLabel("Peso");
		jtfPeso = new JTextField();
		jbCadastrar = new JButton("Cadastrar");
		jbMostrar = new JButton("Mostrar");
		jtaMostrar = new JTextArea();
		jspMostrar = new JScrollPane(jtaMostrar);
		jlGenero = new JLabel("Genero");
		jrbFeminino.setOpaque(false);
		jrbMasculino.setOpaque(false);
		
		
		
		//Adicionar objeto � tela
		add(jlImagem);
		add(jlGenero);
		add(jlNome);
		add(jtfNome);
		add(jrbFeminino);
		add(jrbMasculino);
		add(jlIdade);
		add(jtfIdade);
		add(jlPeso);
		add(jtfPeso);
		add(jbCadastrar);
		add(jbMostrar);
		add(jlGenero);
		add(jspMostrar);
		bgGenero.add(jrbFeminino);
		bgGenero.add(jrbMasculino);
		
		
		//Dimensionamento
		jlNome.setBounds(10, 40, 50, 20);
		jtfNome.setBounds(10, 60, 200, 20);
		jlIdade.setBounds(160, 80, 50, 20);
		jtfIdade.setBounds(160, 100, 50, 20);
		jlPeso.setBounds(10, 80, 50, 20);
		jtfPeso.setBounds(10, 100, 100, 20);
		jbCadastrar.setBounds(10, 190, 100, 20);
		jbMostrar.setBounds(120, 190, 100, 20);
		jrbFeminino.setBounds(10, 160, 100, 20);
		jrbMasculino.setBounds(130, 160, 100, 20);
		jspMostrar.setBounds(10, 220, 350, 120);
		jlGenero.setBounds(90, 140, 50, 20);
		
		
		jlImagem.setBounds(250, 40, 100, 100);

	
		
	}	

	private void criarEventos() {	
		//Criar evento do bot�o Cadastrar
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//A valida��o do campo em vazio
				if (!jtfNome.getText().isEmpty() && !jtfIdade.getText().isEmpty() && !jtfPeso.getText().isEmpty()) {
					//Declarar as vari�veis
					String nome, genero;
					int idade;
					float peso;
					
					//Entradas
					nome = jtfNome.getText();				
					idade = Integer.parseInt(jtfIdade.getText());
					peso = Float.parseFloat(jtfPeso.getText());
					
					if (jrbMasculino.isSelected()) {
						genero = "Masculino";
						
					} else {
						genero = "Feminino";
					}
					
					//Objeto da classe Doador
					doadors[indice] = new Doador(nome, genero, peso, idade);
					
					//Processamento
					doadors[indice].mostrarDados();
					doadors[indice].mostrarQuantidadeSangue();
					indice++;
					
					//Limpar os campos
					jtfNome.setText("");
					jtfIdade.setText("");
					jtfPeso.setText("");
		
				
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Doação de Sangue", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});//Fim do evento
		
		//Evento do bot�o Mostrar
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("\t Doação de Sangue \n");
				
				//Valida��o do objeto nulo
				if (doadors[0] != null) {
					for (int i = 0; i < indice; i++) {
						jtaMostrar.append((doadors[i].mostrarDados() + "\n" + doadors[i].mostrarQuantidadeSangue()));
						
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum doador foi encontrado", "Doação de Sangue", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		TelaDoador doador = new TelaDoador("Doador");
		doador.setVisible(true);

	}
}
	
