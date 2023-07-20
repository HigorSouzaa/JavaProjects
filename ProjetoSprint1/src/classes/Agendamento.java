package classes;

public class Agendamento {
	
	//Variaves
    public String nome;
    public String animal;
    public String servico;
    public String data;
    public String hora;
    public String nomeAnimal;
    
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
		return  "Olá " + this.nome + " agendamos seu " + this.servico
				+ "\nPara o dia " + this.data + " no horaio das: " + this.hora
				+ "\nEsperamos você e nosso Amiguinho(a) " + this.nomeAnimal + ".";
		
		

	}
    
    

}
