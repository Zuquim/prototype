import java.util.Date;

public class Gestor extends Usuario {

	static final boolean gestor = true;
	private static boolean resposta;
	
	public boolean avalia(Solicitacao s) {
		Date data = new Date();
//		if s.getQuant() > s.item.estoque {resposta = false;}
		if(resposta = true) {
			s.setFoiAprov(true);
			s.setDataResposta(data);
		}
		s.setDataResposta(data);
		return resposta;
	}
}
