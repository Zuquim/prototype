import java.util.Date;

public class Gestor extends Usuario {

	static final boolean gestor = true;
	private static boolean resposta;
	private static String solicitacoes;
	
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
	
	public void cadastraCliente() {  // TODO
		DAO.setInDB("INSERT INTO clientes(nomeCliente, emailCliente, telCliente, endCliente, respCliente)"
		+ "VALUES ('$nomeCliente', '$emailCliente', '$telCliente', '$endCliente', '$respCliente')");
	}
	
	public void cadastraFuncionario() {  // TODO
		DAO.setInDB("INSERT INTO usuarios(nomeUser, tipoUser, matriculaUser, emailUser, senhaUser)"
				+ "VALUES ('$nomeUser', '$tipoUser', '$matriculaUser', '$emailUser', '$senhaUser')");
	}
	
	public void cadastraMaterial() {  // TODO
		DAO.setInDB("INSERT INTO materiais(nomeMaterial, modeloMaterial, fabricanteMaterial, qtdMaterial, metricaMaterial)"
		+ "VALUES ('$nomeMaterial', '$modeloMaterial', '$fabricanteMaterial', '$qtdMaterial', '$metricaMaterial')");
	}
	
	public String getSolicitacoes() {  // TODO
		DAO.getFromDB("SELECT * FROM solicitacoes ORDER BY dateSolicitacao ASC");
		return solicitacoes;
	}
}
