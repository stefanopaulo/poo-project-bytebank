
public class CriaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.saldo = 200;
		System.out.println("Saldo da primeira conta: " + c1.saldo);
		
		c1.saldo += 100;
		System.out.println("Saldo da primeira conta: " + c1.saldo);
		
		Conta c2 = new Conta();
		
		c2.saldo = 50;
		System.out.println("Saldo da segunda conta: " + c2.saldo);
		
		if (c1 == c2) {
			System.out.println("verdade");
		} else {
			System.out.println("falso");
		}
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
