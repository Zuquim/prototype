import java.util.Date;

public class Funcionario extends Usuario {

	static final boolean gestor = false;
	static Solicitacao s = new Solicitacao();
	
	Date date = new Date();
	
	private void solicita(Item i) {
		s.setDataSolicit(date);
//		i.setId();
	}
	
}
