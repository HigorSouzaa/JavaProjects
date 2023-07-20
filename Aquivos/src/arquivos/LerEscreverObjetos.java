package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import classes.Crianca;

public class LerEscreverObjetos {
	public void escreverObjeto(Crianca crianca) {
		try {
			FileOutputStream fluxo = new FileOutputStream("Crianca.bin");//passa o nome do arquivo
			ObjectOutputStream objeto = new ObjectOutputStream(fluxo);
			objeto.writeObject(crianca);
			objeto.close();
			JOptionPane.showMessageDialog(null, "Gravado com Secesso!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public Crianca lerObjeto() {
	Crianca crianca = null; //variavel que vai receber o objeto do arquivo
	FileInputStream fluxo;
	try {
		fluxo = new FileInputStream("Crianca.bin");
		ObjectInputStream objeto = new ObjectInputStream(fluxo);
		crianca = (Crianca) objeto.readObject();
		objeto.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return crianca;
}
}
