package dominio;

public class Conta {

	private int idConta;
	private String numeroConta;
	private float saldo;
	private int idCliente;
	
	public int getIdConta() {
		return idConta;
	}
	
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
