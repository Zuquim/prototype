import java.util.Date;

public class Funcionario extends Usuario {

	static final boolean gestor = false;
	static Solicitacao s = new Solicitacao();
	
	
	
	private void solicita(Item i, int q) {
		Date date = new Date();
		s.setDataSolicit(date);
		s.setQuantidade(q);
		s.setItem(i);
		
	}
	
}
