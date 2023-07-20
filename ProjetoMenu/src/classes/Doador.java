package classes;

public class Doador {
	
	public String nome;
    public float peso;
    public int idade;
    public String genero;
    public String mostrarQuatSangue;

    public Doador(String nome, float peso, int idade, String genero) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.genero = genero;
    }

    public String mostrarQuantidadeSangue() {
        if (this.idade < 16 && this.idade >69) {
        	this.mostrarQuatSangue = "Idade inferior a 18 anos e maior que 69 anos, não pode doar sangue.";
        } else {
        	if (this.peso >= 50) {
				if (this.genero.equalsIgnoreCase("Masculino")) {
					this.mostrarQuatSangue = "Parabens " + this.nome + " é abito a doar 700mg.";
				} else {
					this.mostrarQuatSangue = "Parabens " + this.nome + " é abito a doar 400mg.";
				}
			} else {
				this.mostrarQuatSangue = "Peso insuficiente, para doar é necessario ter acima que 50kg.";
			}
        }
		return this.mostrarQuatSangue;
        
    }	
    
}
