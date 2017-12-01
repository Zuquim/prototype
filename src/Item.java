
public class Item {

	private int id, idFK;
	private String descricao;
	
	public Item (int id, int idFK, String descriçao) {
		this.setDescricao(descriçao);
		this.setId(idFK);
		this.setIdFK(idFK);
	}
	
	
	public int getIdFK() {
		return idFK;
	}


	public void setIdFK(int idFK) {
		this.idFK = idFK;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
