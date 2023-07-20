package arquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import classes.Usuario;



public class LerEscreverObjetos {
	private String nomeArquivo;
	//construtuor
	public LerEscreverObjetos(String nomeArquivo) {
	this.nomeArquivo = nomeArquivo;	
		
	}

	public void escreverObjeto(Usuario[] usuarios) {
		try {
			FileOutputStream fluxo = new FileOutputStream(nomeArquivo);//passa o nome do arquivo
			ObjectOutputStream objeto = new ObjectOutputStream(fluxo);
			objeto.writeObject(usuarios);
			objeto.close();
			JOptionPane.showMessageDialog(null, "Gravado com Secesso!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Usuario[] lerObjeto() {
		Usuario[] usuario = null; //variavel que vai receber o objeto do arquivo
		FileInputStream fluxo;
		try {
			fluxo = new FileInputStream(nomeArquivo);
			ObjectInputStream objeto = new ObjectInputStream(fluxo);
			usuario = (Usuario[]) objeto.readObject();
			objeto.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return usuario;
		
	}
}


