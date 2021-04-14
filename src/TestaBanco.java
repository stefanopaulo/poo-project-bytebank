
public class TestaBanco {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.deposita(100);
		
		System.out.println(c1.getSaldo());
		
	}

}
