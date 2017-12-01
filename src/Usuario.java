
public class Usuario {

	private String login;
	private String senha;
	private String nome;
	private String matricula;
	private String foto;
	private boolean isGestor;
	
	public Usuario(String matricula, String nome, String login, String senha, String foto, boolean isGestor) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setFoto(foto);
		this.setGestor(isGestor);
	}

	public boolean isGestor() {
		return isGestor;
	}

	public void setGestor(boolean isGestor) {
		this.isGestor = isGestor;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
