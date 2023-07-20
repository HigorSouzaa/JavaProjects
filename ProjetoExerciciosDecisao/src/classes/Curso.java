package classes;


public class Curso {
	
	//DEclaração variaveis
	public String nome;
	public String codigo;
	public String tipoPagamento;
	public float valorCurso;
	
	//contrutor
	public Curso(String codigo, String tipoPagamento, String nome) {
		super();
		this.codigo = codigo;
		this.tipoPagamento = tipoPagamento;
		this.nome = nome;
	}
	
	//metodo
	public float calcularValorCurso() {
		if (this.codigo.equalsIgnoreCase("IGL")) { // ingnora se as letras sao maiuscula ou minuscula
			if (this.tipoPagamento.equalsIgnoreCase("sim")) { // ingnora se as letras sao maiuscula ou minuscula
				this.valorCurso = (float) (1614.00 * 0.9);
			} else {
				this.valorCurso = 1614.00f;
			}	
		} else {
			if (this.codigo.equalsIgnoreCase("ESP")) { // ingnora se as letras sao maiuscula ou minuscula
				if (this.tipoPagamento.equalsIgnoreCase("sim")) { // ingnora se as letras sao maiuscula ou minuscula
					this.valorCurso = 1200 * 0.9f ;
				} else {
					this.valorCurso = 1200f;
				}
								
			} else {
				if (this.tipoPagamento.equalsIgnoreCase("sim")) { // ingnora se as letras sao maiuscula ou minuscula
					this.valorCurso = 2400 * 0.9f ;
				} else {
					this.valorCurso = 2400f;
				}
			}
		}
		return this.valorCurso;
	}
	
	public String mostrarDados() {
		return this.nome + " o valor total do seu curso ficou R$" + valorCurso;
		
	}

}
