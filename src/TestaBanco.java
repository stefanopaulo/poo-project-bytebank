
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cl1 = new Cliente();
		
		cl1.nome = "Paulo Silveira";
		cl1.cpf = "222.222.222-22";
		cl1.profissao = "programador";
		
		Conta c1 = new Conta();
		
		c1.titular = cl1;
		c1.deposita(100);
		
		// System.out.println("Titular da conta: " + c1.titular.nome);
		// System.out.println("Saldo em conta: " + c1.saldo);
		
		Conta c2 = new Conta();
		
		System.out.println(c2.titular);
		
		c2.titular = new Cliente();
		
		c2.titular.nome = "Marcela";
		System.out.println(c2.titular.nome);
		
	}

}
