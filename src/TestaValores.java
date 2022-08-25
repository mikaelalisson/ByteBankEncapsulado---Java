
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		Conta conta2 = new Conta(1337, 24227);
		
		
		Conta conta3 = new Conta(1337, 24228);
		
		System.out.println("----------------------------------");
		System.out.println("Total de contas: " +Conta.getTotal());
	}
}
