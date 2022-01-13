
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(6663, 22890);
		
		Conta conta3 = new Conta(1325, 77770);
		
		System.out.println(conta.getTotal());
		
	}

}
