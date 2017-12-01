import java.util.Date;

public class Solicitacao {

	private Date dataSolicit;
	private Date dataResposta;
	private Date dataRetirada;
	private static int id;  // id unico da solicitacao, incrementado a cada nova solicitacao
	private int quantidade;
	private Item item;
	private boolean foiAprov;

	public Date getDataSolicit() {
		return dataSolicit;
	}

	public void setDataSolicit(Date dataSolicit) {
		this.dataSolicit = dataSolicit;
	}

	public Date getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(Date dataResposta) {
		this.dataResposta = dataResposta;
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
		Solicitacao.id = id;
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
