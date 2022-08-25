
public class TestaGetandSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println("Agência: "+conta.getNumero());

		
		Cliente mikael = new Cliente();
		mikael.setNome("Mikael Alisson");
		conta.setTitular(mikael);
		
		System.out.println("Nome: "+conta.getTitular().getNome());
		
	}
	
	


}
