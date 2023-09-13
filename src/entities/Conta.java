package entities;

public class Conta {
	private Integer numero;
	private String nome;
	private Double valorConta;
	
	
	public Conta(Integer numero, String nome, Double valorConta) {
		this.numero = numero;
		this.nome = nome;
		this.valorConta = valorConta;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorConta() {
		return valorConta;
	}

	public void setValorConta(Double valorConta) {
		this.valorConta = valorConta;
	}
	
	public double deposito(double valorDeposito) {
		return valorConta += valorDeposito;	
	}
	
	public double saque(double saqueValor) {
		return valorConta -= saqueValor + 5;
	}
	
	public String toString() {
		return "Conta: "
				+ numero
				+ ", Titular: "
				+ nome
				+ ", Valor da conta: "
				+ String.format("%.2f", valorConta);
	}
}
