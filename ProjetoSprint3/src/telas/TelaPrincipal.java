package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;

import classes.Agendamento;
import classes.Cliente;


public class TelaPrincipal extends JFrame {

    private JButton jlAgendamento;
    private JButton jlCadastroCliente;

    public TelaPrincipal(String string) {
        // Configurações básicas da tela
        setTitle("PetFamily - Menu");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);;
		getContentPane().setBackground(Color.orange);
        setLayout(null);

        URL url = this.getClass().getResource("/img/petshop2.png");
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(iconeTitulo);
        
        // Criação dos botões de opção
        jlAgendamento = new JButton("Agendamento");
        jlCadastroCliente = new JButton("Cadastrar-se");

        // Adiciona os botões à tela e define a posição
        add(jlCadastroCliente);
        add(jlAgendamento);
        jlAgendamento.setBounds(50, 50, 200, 50); //coluna,linha,comprimento e largura
        jlCadastroCliente.setBounds(50, 150, 200, 50);

        // ActionListener para o botão de abrir a Tela de Agendamento
        jlAgendamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova instância da tela de Agendamento
                TelaAgendamento telaAgendamento = new TelaAgendamento();
                // Define a tela atual como invisível
                setVisible(false);
                // Define a tela de Agendamento como visível
                telaAgendamento.setVisible(true);
            }
        });

        // ActionListener para o botão de abrir a Tela de Cadastro de Cliente
        jlCadastroCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova instância da tela de Cadastro de Cliente
            	TelaCadastroCliente telaCadastro = new TelaCadastroCliente();
                // Define a tela atual como invisível
                setVisible(false);
                // Define a tela de Agendamento como visível
                telaCadastro.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal("Menu Principal");
        telaPrincipal.setVisible(true);
    }
}