
public class TestaBanco {

	public static void main(String[] args) {

		Conta c1 = new Conta(200, 1337, 164);
		Cliente cl1 = new Cliente();
				
		c1.setCliente(cl1);
		
		c1.getCliente().setNome("Paulo Silveira");
		c1.getCliente().setCpf("222.222.222-22");
		c1.getCliente().setProfissao("programador");
		
		System.out.println("número da conta: " + c1.getNumero());
		System.out.println("agência: " + c1.getAgencia());
		System.out.println("titular da conta: " + c1.getCliente().getNome());
		System.out.println("saldo em conta: " + c1.getSaldo());
		
	}

}
