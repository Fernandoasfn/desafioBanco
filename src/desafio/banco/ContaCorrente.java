package desafio.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int conta, Cliente cliente) {
		super(agencia, conta, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extato Bancario Corrente ***");
		for (String e : extrato)
			System.out.println(e);
			System.out.println("Saldo CC: " + saldo());
	}
	
	@Override
	public String toString() {
		return " Conta Corrente"
				+ "\n agencia: " + agencia
				+ "\n conta: " + conta
				+ "\n saldo: " + saldo
				+ "\n cliente: " + cliente;
	}
}
