
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(double saldo, int agencia, int numero) {
		this.deposita(saldo);
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			this.saldo = 0.0;
			return;
		}
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
			
		return false;
	}
	
	public boolean transfere(double valor, Conta conta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		}
			
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Número da agência inválido");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número da conta inválido");
			return;
		}
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setCliente(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getCliente() {
		return this.titular;
	}

}
