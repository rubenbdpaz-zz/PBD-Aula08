package dominio;

public class Historico {
	private int idHistorico;
	private int tipoOperacao;
	private float valor;
	private String dataOperacao;
	private int idConta;
	
	public int getIdHistorico() {
		return idHistorico;
	}
	
	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
	}
	
	public int getTipoOperacao() {
		return tipoOperacao;
	}
	
	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getDataOperacao() {
		return dataOperacao;
	}
	
	public void setDataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	
	public int getIdConta() {
		return idConta;
	}
	
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

}
