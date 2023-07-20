package telas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import arquivos.LerEscreverObjetos;
import classes.Agendamento;

public class TelaAgendamento extends JFrame {
    private JButton jbCadastrar, jbMostrar, jbVoltar;
    private JTextArea jtaMostrar;
    private JScrollPane jspMostrar;
    private JLabel jlNome, jlAnimal, jlServico, jlData, jlHora, jlNomeAnimal;
    private JTextField jtfNome, jtfAnimal, jtfNomeAnimal, jtfData, jtfHora;
    private JRadioButton jrbBanho, jrbConsulta, jrbTosa;
    private ButtonGroup bgServico;

    private List<Agendamento> agendamentos = new ArrayList<>();;
    
    public TelaAgendamento() {
        // Configurações básicas da tela
        setTitle("Agendamento");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);;
        setLayout(null);
        
        URL url = this.getClass().getResource("/img/petshop2.png");
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(iconeTitulo);

        // Criação do botão de voltar
        jbVoltar = new JButton("Voltar");
        jlNome = new JLabel("Nome");
        jlAnimal = new JLabel("Animal");
        jlData = new JLabel("Data");
        jlHora = new JLabel("Hora");
        jlNomeAnimal = new JLabel("Nome do Pet");

        jtfNome = new JTextField();
        jtfAnimal = new JTextField();
        jtfData = new JTextField();
        jtfHora = new JTextField();
        jtfNomeAnimal = new JTextField();

        // Início configuração ButtonGroup
        bgServico = new ButtonGroup();
        jlServico = new JLabel("Serviço");        
        jrbBanho = new JRadioButton("Banho");
        jrbTosa = new JRadioButton("Tosa");
        jrbConsulta = new JRadioButton("Consulta");
        
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostra");
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);

        bgServico.add(jrbConsulta);
        bgServico.add(jrbTosa);
        bgServico.add(jrbBanho);// Fim ButtonGroup

        // Adiciona os componentes à tela e define a posição
        add(jbVoltar);
        add(jbCadastrar);
        add(jbMostrar);
        add(jlNome);
        add(jlAnimal);
        add(jlServico);
        add(jlData);
        add(jlHora);
        add(jlNomeAnimal);
        add(jtfNome);
        add(jtfAnimal);
        add(jtfData);
        add(jtfHora);
        add(jtfNomeAnimal);
        add(jrbBanho);
        add(jrbTosa);
        add(jrbConsulta);
        add(jspMostrar);
        
        jlNome.setBounds(10, 10, 50, 20);  // coluna, linha, comprimento e largura
        jtfNome.setBounds(10, 30, 170, 20);

        jlAnimal.setBounds(10, 50, 50, 20);  // coluna, linha, comprimento e largura
        jtfAnimal.setBounds(10, 70, 80, 20);

        jlData.setBounds(100, 50, 50, 20);  // coluna, linha, comprimento e largura
        jtfData.setBounds(100, 70, 80, 20);

        jlHora.setBounds(190, 50, 50, 20);  // coluna, linha, comprimento e largura
        jtfHora.setBounds(190, 70, 80, 20);

        jlNomeAnimal.setBounds(10, 90, 180, 20);  // coluna, linha, comprimento e largura
        jtfNomeAnimal.setBounds(10, 110, 170, 20);

        jlServico.setBounds(190, 90, 80, 20);  // coluna, linha, comprimento e largura
        jrbBanho.setBounds(190, 110, 80, 20);
        jrbTosa.setBounds(190, 130, 80, 20);
        jrbConsulta.setBounds(190, 150, 80, 20);
        
        jbVoltar.setBounds(170, 220, 100, 30);
        jbCadastrar.setBounds(10, 185, 100, 30);
        jbMostrar.setBounds(10, 220, 100, 30);
        jspMostrar.setBounds(10, 270, 261, 170);

      
        
        // ActionListener para o botão de voltar
        jbVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova instância da tela principal
                TelaPrincipal telaPrincipal = new TelaPrincipal("Menu Principal");
                // Define a tela atual como invisível
                setVisible(false);
                // Define a tela principal como visível
                telaPrincipal.setVisible(true);
            }
        });
        
        jbCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!jtfNome.getText().isEmpty() &&
                    !jtfAnimal.getText().isEmpty() &&
                    !jtfHora.getText().isEmpty() &&
                    !jtfNomeAnimal.getText().isEmpty() &&
                    !jtfData.getText().isEmpty() &&
                    (bgServico.getSelection() != null)) {
                    String cliente = jtfNome.getText();
                    String nomeAnimal = jtfNomeAnimal.getText();
                    String animal = jtfAnimal.getText();
                    String data = jtfData.getText();
                    String hora = jtfHora.getText();
                    String servico;
                    
                    if (jrbBanho.isSelected()) {
                        servico = "seu Banho";
                    } else if (jrbTosa.isSelected()) {
                        servico = "sua Tosa";
                    } else {
                        servico = "sua Consulta";
                    }
    
                    agendamentos.add(new Agendamento(cliente, animal, servico, data, hora, nomeAnimal));
                    LerEscreverObjetos gravar = new LerEscreverObjetos("Agendamento.bin");
                    gravar.escreverObjeto(null, agendamentos, null);
                    
                    jtfNome.setText("");
                    jtfData.setText("");
                    jtfAnimal.setText("");
                    jtfHora.setText("");
                    jtfNomeAnimal.setText("");
                
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Agendamento", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        jbMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("\t Agendar Serviços \n");
                if (!agendamentos.isEmpty()) {
                    for (Agendamento agendamento : agendamentos) {
                        jtaMostrar.append(agendamento.mostrarAgendamento());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Agendamento não finalizado, revise seus dados", "Agendamento", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}