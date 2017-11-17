
public class Gestor extends Usuario {

	static final boolean gestor = true;
	static boolean resposta;
	
	private boolean avalia(Solicitacao s) {
		Date data = new Date();
//		if s.getQuant() > s.item.estoque {resposta = false;}
		if(resposta = true) s.foiAprov = true;
		s.setDataResposta(data);
		return resposta;
	}

