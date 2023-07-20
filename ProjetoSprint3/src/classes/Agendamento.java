package classes;

public class Agendamento {
	
	//Variaves
    public String cliente;
    public String animal;
    public String servico;
    public String data;
    public String hora;
    public String nomeAnimal;
    
    //Construtor
	public Agendamento(String cliente, String animal, String servico, String data, String hora, String nomeAnimal) {
		super();
		this.cliente = cliente;
		this.animal = animal;
		this.servico = servico;
		this.data = data;
		this.hora = hora;
		this.nomeAnimal = nomeAnimal;
	}
    
	//Metodo
	public String mostrarAgendamento() {
		return  "\nOlá " + this.cliente + " agendamos " + this.servico
				+ "\nPara o dia " + this.data + " no horario das: " + this.hora
				+ "\nEsperamos você e nosso Amiguinho(a) " + this.nomeAnimal + "." + "\n-----------------------------\n";
		
		

	}
    
    

}
