package model;

public class Modelo {
	private String login;
	
	private String senha;

	public boolean validarAcesso(String login, String senha) {
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Modelo [login=" + login + ", senha=" + senha + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
