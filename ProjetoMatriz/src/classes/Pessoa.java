package classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Pessoa {
	public String nome;
	public String idade;
	public String endereco;
	public String telefone;
	public String cpf;
	private DecimalFormat telefoneFormatado = new DecimalFormat("(##) # ####-####");
	
	public Pessoa(String nome, String idade, String endereco, String telefone, String cpf) {
		
		//Construtor
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	//M�todo
	public String mostrarDados() {
		return "\nNome: " + this.nome
				+ "\nIdade: " + this.idade
				+ "\nEndereço: " + this.endereco
				+ "\nTelefone: " + formatTelefone() 
				+ "\nCPF: " + this.cpf
				+ "\n*********************** \n\n";
	}
	
	public String formatTelefone() {
        try {
            String ddi = telefone.substring(0, 2);
            String ddd = telefone.substring(2, 4);
            String prefixo = telefone.substring(4, 8);
            String sufixo = telefone.substring(8);

            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(4);
            nf.setGroupingUsed(false);

            return String.format("+%s (%s) %s-%s", ddi, ddd, nf.format(Integer.parseInt(prefixo)), nf.format(Integer.parseInt(sufixo)));
        } catch (Exception e) {
            e.printStackTrace();
            return telefone;
        }
    }

}
