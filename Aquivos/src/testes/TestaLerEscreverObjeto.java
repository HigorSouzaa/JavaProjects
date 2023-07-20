package testes;

import arquivos.LerEscreverObjetos;
import classes.Crianca;

public class TestaLerEscreverObjeto {
	public static void main(String[] args) {
		//Crianca crianca = new Crianca("Joelcinho", 12);
		LerEscreverObjetos objeto = new LerEscreverObjetos();
		//obejto.escreverObjeto(crianca);
		Crianca crianca1 = objeto.lerObjeto();
		System.out.println("Nome: " + crianca1.nome + "\nIdade: " + crianca1.idade);
		
		
	}
}
