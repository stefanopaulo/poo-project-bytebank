
public class TestaBanco {

	public static void main(String[] args) {

		Conta c1 = new Conta(200, 1337, 164);
		Conta c2 = new Conta(300, 1337, 896);
		
		System.out.println(Conta.getTotal());
		
	}

}
