import java.util.Date;

public class Funcionario extends Usuario {

	static final boolean gestor = false;
	static Solicitacao s = new Solicitacao();
	
	private void solicita(Item i) {
		Date data = new Date();
		s.setDataSolicit(data);
//		i.setId();
		s.id += 1;  // incrementador do id de solicitacao
	}
	
}
