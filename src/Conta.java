
public class Conta {
	
	public double saldo;
	public int agencia;
	public int numero;
	public String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void transfere(double valor, Conta conta) {
		conta.saldo += valor;
		this.saldo -= valor;
	}

}
