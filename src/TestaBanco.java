
public class TestaBanco {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.setNumero(1337);
		c1.setAgencia(146);
		c1.deposita(100);
		
		System.out.println("n�mero da conta: " + c1.getNumero());
		System.out.println("ag�ncia: " + c1.getAgencia());
		System.out.println("saldo em conta: " + c1.getSaldo());
		
	}

}
