//atributos(variaveis Casracteristicas de um objeto)

public class Conta {
	
	private double Saldo;
	private int Agencia;
	private int Numero;
	private Cliente Titular;
	private static int total;
	
	// construtor pode receber parametros
	public Conta(int Agencia, int numero ) {
		Conta.total ++;
		System.out.println("o total de contas é " + total);
		this.Agencia = Agencia;
		this.Numero = Numero;
		System.out.println("Estou criando uma conta" + this.Numero + this.Agencia);
	}

	public void deposito(double valor) {
		this.Saldo = this.Saldo + valor;
		// ou poderia declar assim
		// this.Saldo +=valor;
	}

	public boolean saca(double valor) {
		if (this.Saldo >= valor) {
			this.Saldo = this.Saldo - valor;
			// ou poderia declar assim
			// this.Saldo -=valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferencia(double valor, Conta destino) {
		if (this.Saldo >= valor) {
			this.Saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	
	public int getNumero() {
		return this.Numero;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("nao pode numero menor que 0 ");
			return;
		}
		this.Numero = numero;
		
	}
	
	public int  getAgencia() {
		return this.Agencia;
	}
	
	public void setAgencia(int agencia) {
		if(Agencia <=0) {
			System.out.println("nao pode valor menor que 0");
			return;
	}
		this.Agencia = agencia;
}
	public void setTitular(Cliente titular) {
		Titular = titular;
	}
	
	public Cliente getTitular() {
		return Titular;
	}

	public int getTotal() {
		return total;
	}

	public  void setTotal(int total) {
		Conta.total = total;
	}
	
	
}
