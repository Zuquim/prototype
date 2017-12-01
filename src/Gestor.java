
public class Gestor extends Usuario {

	

	static final boolean gestor = true;
	static boolean resposta;
	
	
	public Gestor(String matricula, String nome, String login, String senha, String foto) {
		super(matricula, nome, login, senha, foto, gestor);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	private boolean avalia(Solicitacao s) {
//		if s.getQuant() > s.item.estoque {resposta = false;}
		return resposta;
	}
	
}
