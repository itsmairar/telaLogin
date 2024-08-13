package application;

public class Login {

	private String login = "pooa";
	private String senha = "senha";
	
	public boolean Login1(String login, String senha) {
		return this.login.endsWith(login) && this.senha.equals(senha);
	}
}
