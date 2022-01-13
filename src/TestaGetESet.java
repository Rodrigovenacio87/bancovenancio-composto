
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 2109; jeito errado
		conta.setNumero(2109);
		
		System.out.println(conta.getNumero());
		
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo Venâncio da Silva");
		
		conta.setTitular(rodrigo);
		
		//System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Desenvolvedor Java"); 
	
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());

	}

}
