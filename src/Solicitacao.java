import java.util.Date;

public class Solicitacao {

	private Date dataSolicit;
	private Date dataAprov;
	private Date dataRetirada;
	private int id;
	private int quantidade;
	private Item item;
	private boolean foiAprov;

	public Date getDataSolicit() {
		return dataSolicit;
	}

	public void setDataSolicit(Date dataSolicit) {
		this.dataSolicit = dataSolicit;
	}

	public Date getDataAprov() {
		return dataAprov;
	}

	public void setDataAprov(Date dataAprov) {
		this.dataAprov = dataAprov;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isFoiAprov() {
		return foiAprov;
	}

	public void setFoiAprov(boolean foiAprov) {
		this.foiAprov = foiAprov;
	}

}
