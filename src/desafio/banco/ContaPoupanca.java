package desafio.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta, Cliente cliente) {
		super(agencia, conta, cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extato Bancario Poupanca ***");
		for (String e : extrato)
			System.out.println(e);
			System.out.println("Saldo CP: " + saldo());
	}

	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		extrato.add("Valor aplicado na poupança: " + valor);
	}
	
	@Override
	public String toString() {
		return "Conta Poupança"
				+ "\n agencia: " + agencia
				+ "\n conta: " + conta
				+ "\n saldo: " + saldo
				+ "\n cliente: " + cliente;
	}
}
