package classes;

public class Agendamento {
	
	//Variaves
    public String nome;
    public String animal;
    public String servico;
    public String data;
    public String hora;
    public String nomeAnimal;
    public String mudaPalavra;
    
    //Construtor
	public Agendamento(String nome, String animal, String servico, String data, String hora, String nomeAnimal) {
		super();
		this.nome = nome;
		this.animal = animal;
		this.servico = servico;
		this.data = data;
		this.hora = hora;
		this.nomeAnimal = nomeAnimal;
	}
    
	//Metodo
	public String mostrarAgendamento() {
		return  "Olá, " + this.nome + "." + " Agendamos " + this.mudaPalavra + this.servico + "."
				+ "\nPara o dia " + this.data + " no horaio das: " + this.hora + "."
				+ "\nEsperamos você e nosso Amiguinho(a) " + this.nomeAnimal + ".";
		
		

	}

	public void mudarPalavra() {
		if (this.servico.equals("Banho")) {
			this.mudaPalavra = "seu ";
		
		} else if (this.servico.equals("Tosa")) {
			this.mudaPalavra = "sua ";
		
		} else if (this.servico.equals("Consulta")) {
			this.mudaPalavra = "sua ";
		
		} else {
			this.mudaPalavra = "seu ";
		}
		
		
	}
    

}
