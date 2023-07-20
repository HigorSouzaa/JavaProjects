package telas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import arquivos.LerEscreverObjetos;
import classes.Cliente;

public class TelaCadastroCliente extends JFrame {
	private JButton jbCadastrar, jbMostrar, jbVoltar;
	private JTextArea jtaMostrar;
	private JScrollPane jspMostrar;
	private JLabel jlTexto, jlNome, jlCpf, jlEndereco, jlTelefone, jlGenero, jlIdade, jlNomePet, jlTipoAnimal, jlPedigree, jlIdadePet, jlRaca, jlSexoPet;
	private JTextField jtfNome, jtfCpf, jtfEndereco, jtfTelefone, jtfIdade, jtfNomePet, jtfTipoAnimal, jtfPedigree, jtfIdadePet, jtfRaca;
	private JRadioButton jrbMasculino, jrbFeminino, jrbMacho, jrbFemea;
	private ButtonGroup bgGenero, bgSexoPet;
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public TelaCadastroCliente() {
		setTitle("Cadastro");
        setSize(400, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);;
        setLayout(null);
        
        URL url = this.getClass().getResource("/img/petshop2.png");
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(iconeTitulo);
        
        jlTexto = new JLabel("Agora vamos Cadastrar nosso amiguinho.");
        jlNome = new JLabel("Nome");
        jtfNome = new JTextField();
        jlCpf = new JLabel("CPF");
        jtfCpf = new JTextField();
        jlEndereco = new JLabel("Endereço");
        jtfEndereco = new JTextField();
        jlTelefone = new JLabel("Telefone");
        jtfTelefone = new JTextField();
        jlIdade = new JLabel("Idade");
        jtfIdade = new JTextField();
        jlNomePet = new JLabel("Nome do Pet");
        jtfNomePet = new JTextField();
        jlIdadePet = new JLabel("Idade do Pet");
        jtfIdadePet = new JTextField();
        jlTipoAnimal = new JLabel("Espécie");
        jtfTipoAnimal = new JTextField();
        jlPedigree = new JLabel("Pedigree");
        jtfPedigree = new JTextField();
        jlRaca = new JLabel("Raça");
        jtfRaca = new JTextField();
        
        jlGenero = new JLabel("Genero");
        bgGenero = new ButtonGroup();
        jrbFeminino = new JRadioButton("Feminino");
        jrbMasculino = new JRadioButton("Masculino");
        bgGenero.add(jrbFeminino);
        bgGenero.add(jrbMasculino);
        
        jlSexoPet = new JLabel("Sexo do Pet");
        bgSexoPet = new ButtonGroup();
        jrbMacho = new JRadioButton("Macho");
        jrbFemea = new JRadioButton("Fêmea");
        bgSexoPet.add(jrbMacho);
        bgSexoPet.add(jrbFemea);
        
        jbVoltar = new JButton("Voltar");
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        
        add(jbVoltar);
        add(jbCadastrar);
        add(jbMostrar);
        add(jlGenero);
        add(jlSexoPet);
        add(jlTexto);
        add(jlNome);
        add(jtfNome);
        add(jlCpf);
        add(jtfCpf);
        add(jlEndereco);
        add(jtfEndereco);
        add(jlTelefone);
        add(jtfTelefone);
        add(jlIdade);
        add(jtfIdade);
        add(jlNomePet);
        add(jtfNomePet);
        add(jlTipoAnimal);
        add(jtfTipoAnimal);
        add(jlPedigree);
        add(jtfPedigree);
        add(jlIdadePet);
        add(jtfIdadePet);
        add(jlRaca);
        add(jtfRaca);
        add(jrbFemea);
        add(jrbMacho);
        add(jrbFeminino);
        add(jrbMasculino);
        add(jspMostrar);

        
        jlNome.setBounds(10, 10, 50, 20);  //coluna,linha,comprimento e largura
        jtfNome.setBounds(10, 30, 170, 20);
        
        jlCpf.setBounds(190, 10, 50, 20);
        jtfCpf.setBounds(190, 30, 80, 20);

        jlIdade.setBounds(10, 50, 50, 20);  //coluna,linha,comprimento e largura
        jtfIdade.setBounds(10, 70, 80, 20);

        jlTelefone.setBounds(100, 50, 50, 20);  //coluna,linha,comprimento e largura
        jtfTelefone.setBounds(100, 70, 80, 20);

        jlEndereco.setBounds(190, 50, 80, 20);  //coluna,linha,comprimento e largura
        jtfEndereco.setBounds(190, 70, 80, 20);

        jlGenero.setBounds(10, 90, 80, 20);  //coluna,linha,comprimento e largura
        jrbMasculino.setBounds(100, 90, 90, 20);
        jrbFeminino.setBounds(190, 90, 80, 20);
        
        jlTexto.setBounds(10, 130, 250, 20);

        jlNomePet.setBounds(10, 150, 180, 20);  //coluna,linha,comprimento e largura
        jtfNomePet.setBounds(10, 170, 170, 20);
        
        jlPedigree.setBounds(190, 150, 80, 20);
        jtfPedigree.setBounds(190, 170, 80, 20);
        
        jlIdadePet.setBounds(10, 190, 80, 20);  //coluna,linha,comprimento e largura
        jtfIdadePet.setBounds(10, 210, 80, 20);

        jlRaca.setBounds(100, 190, 50, 20);  //coluna,linha,comprimento e largura
        jtfRaca.setBounds(100, 210, 80, 20);

        jlTipoAnimal.setBounds(190, 190, 80, 20);  //coluna,linha,comprimento e largura
        jtfTipoAnimal.setBounds(190, 210, 80, 20);

        jlSexoPet.setBounds(10, 230, 80, 20);  //coluna,linha,comprimento e largura
        jrbMacho.setBounds(100, 230, 90, 20);
        jrbFemea.setBounds(190, 230, 80, 20);
        
        jbVoltar.setBounds(170, 300, 100, 30);
        jbCadastrar.setBounds(10, 265, 100, 30);
        jbMostrar.setBounds(10, 300, 100, 30);
        
        jspMostrar.setBounds(10, 350, 361, 250);
        
     
        // ActionListener para o botão de voltar
        jbVoltar.addActionListener(new ActionListener() { //Inicio Voltar para TelaPrincipal
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova instância da tela principal
                TelaPrincipal telaPrincipal = new TelaPrincipal("Menu Principal");
                // Define a tela atual como invisível
                setVisible(false);
                // Define a tela principal como visível
                telaPrincipal.setVisible(true);
            }
        }); // Fim voltar
        
        jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!jtfNome.getText().isEmpty() 
					&&	!jtfCpf.getText().isEmpty()
					&&	!jtfEndereco.getText().isEmpty()
					&&	!jtfTelefone.getText().isEmpty()
					&&	!jtfIdade.getText().isEmpty()
					&&	!jtfNomePet.getText().isEmpty()
					&&	!jtfTipoAnimal.getText().isEmpty()
					&&	!jtfPedigree.getText().isEmpty()
					&&	!jtfRaca.getText().isEmpty()
					&&	!jtfIdadePet.getText().isEmpty()
					&&  (bgGenero.getSelection() != null)
					&& 	(bgSexoPet.getSelection()!= null)) {
					
					String nome = jtfNome.getText();
					String cpf = jtfCpf.getText();
					String endereco = jtfEndereco.getText();
					String telefone = jtfTelefone.getText();
					String sexo = jrbMasculino.isSelected()? "Masculino" : "Feminino";
					String idade = jtfIdade.getText();
					String nomePet = jtfNomePet.getText();
					String animal = jtfTipoAnimal.getText();
					String pedigree = jtfPedigree.getText();
					String idadePet = jtfIdadePet.getText();
					String raca = jtfRaca.getText();
					String sexoPet = jrbMacho.isSelected()? "Macho" : "Femea";
					
					clientes.add(new Cliente(nome, cpf, endereco, telefone, sexo, idade, nomePet, animal, pedigree, idadePet, raca, sexoPet));
					LerEscreverObjetos gravar = new LerEscreverObjetos("Cliente.bin");
					gravar.escreverObjeto(null, null, clientes);
					
					jtfNome.setText("");
					jtfCpf.setText("");
					jtfEndereco.setText("");
					jtfIdade.setText("");
					jtfNomePet.setText("");
					jtfNome.setText("");
					jtfPedigree.setText("");
					jtfRaca.setText("");
					jtfTelefone.setText("");
					jtfTipoAnimal.setText("");
					jtfIdadePet.setText("");
					
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Cadastrar", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
        
        
        jbMostrar.addActionListener(new ActionListener() { //Inicio Mostrar
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("\t Tela Cadastro \n");
				if (!clientes.isEmpty()) {
					for (Cliente cliente : clientes) {
						jtaMostrar.append(cliente.mostrarDados());
					}
				} else {
					JOptionPane.showMessageDialog(null, "Cadastro nao finalizado, Revise seus dados", "Cadastro", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
     
       
	}
}
