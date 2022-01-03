package exercicioArquivo;

class Conta {
	
	private String cliente;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(String cliente, double saldo) {
		
		this.cliente=cliente;
		this.saldo=saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double saldo) {
		
		setSaldo(saldo-this.saldo);
	}
	
	public void depositar(double valor) {
		
		setSaldo(valor+this.saldo);
		
	}
	
	public void transferencia(Conta destino, double valor) {
		
		destino.setSaldo(valor+this.saldo);
		
	}
	
	public void exibirSaldo() {
		System.out.printf("O saldo do cliente "+this.cliente+" é de: %.2f Kz",this.saldo);
		
	}
	
	
}
















