package classes;

import java.io.Serializable;

public class Usuario implements Serializable {
	public String login;
	public String senha;
	
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}	

}
