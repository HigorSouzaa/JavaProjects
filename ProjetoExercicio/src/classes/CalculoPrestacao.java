package classes;

public class CalculoPrestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //declara��o e atribui��o das variaveis
		double valor = 20,taxa = 10,prestacao;
		int meses = 2;
		//processamento
		prestacao = valor + (valor * (taxa/100) * meses);
		//saida
		System.out.println("Nova Presta��o: " + prestacao + " $Reais");
		
		
	
	
	}
	
	


}
