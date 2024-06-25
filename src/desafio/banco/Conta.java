package desafio.banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	protected List<String> extrato = new ArrayList<>();
	
	public Conta(int agencia, int conta, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			extrato.add("Saque de: " + valor);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		extrato.add("Deposito de: " + valor);
	}
	
	public void imprimirExtrato() {
		System.out.println("*** Extato Bancario ***");
		for (String e : extrato)
			System.out.println(e);
			System.out.println("Saldo: " + saldo());
	}
	
	public double saldo() {
		return saldo; 
	}
	
}

