import java.util.Date;

public class Funcionario extends Usuario {

	static final boolean gestor = false;
	private static Solicitacao s = new Solicitacao();
	
	public void solicita(Item i) {
		Date data = new Date();
		s.setDataSolicit(data);
		s.setId(s.getId()+1);  // incrementador do id de solicitacao
//		i.setId();
	}
	
}
