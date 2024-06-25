package desafio.banco;

import desafio.banco.Cliente;
import desafio.banco.Conta;
import desafio.banco.ContaCorrente;
import desafio.banco.ContaPoupanca;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	
	private List<Conta> contasCorrente;
	private List<Conta> contasPoupanca;
	
	Scanner sc = new Scanner(System.in);
	
	public Banco() {
		this.contasCorrente = new ArrayList<>();
		this.contasPoupanca = new ArrayList<>();
	}

	public void abrirConta() {
		
		System.out.println("Nome do Cliente: ");
		String nome = sc.next();
		
		System.out.println("Digite o CPF");
		int cpf = sc.nextInt();
		
		Cliente cliente = new Cliente(nome, cpf);
		System.out.println(cliente);
		
		System.out.println("Digite a agência: ");
		int agencia = sc.nextInt();
		System.out.println("Digite a conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Digite 1 para Conta Corrente e 2 para Poupança: ");
		int tipoConta = sc.nextInt();
		
		while(tipoConta != 1 && tipoConta != 2 ) {
			System.out.println("Opção inválida! \nDigite novamente: \n");
			tipoConta = sc.nextInt();
		}
		
		if(tipoConta == 1) {
			contasCorrente.add(new ContaCorrente(agencia, conta, cliente));
		} else {
			contasPoupanca.add(new ContaPoupanca(agencia, conta, cliente));
		}
	}
	
	public void depositarContaCorrente() {
	
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasCorrente) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Digite o valor para deposito: ");
				double valor = sc.nextDouble();
				c.depositar(valor);
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
	
	public void depositarContaPoupanca() {
		
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasPoupanca) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Digite o valor para deposito: ");
				double valor = sc.nextDouble();
				c.depositar(valor);
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
	
	public void sacarContaCorrente() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasCorrente) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Digite o valor para saque: ");
				double valor = sc.nextDouble();
				c.sacar(valor);
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
	
	public void sacarContaPoupanca() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasPoupanca) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Digite o valor para saque: ");
				double valor = sc.nextDouble();
				c.sacar(valor);
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}

	public void emitirExtratoCorrente() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasCorrente) {
			if (cpf == c.cliente.getCpf()) {
				c.imprimirExtrato();
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
	
	public void emitirExtratoPoupanca() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasPoupanca) {
			if (cpf == c.cliente.getCpf()) {
				c.imprimirExtrato();
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
	
	public void exibirSaldoCorrente() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasCorrente) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Saldo CC: " + c.saldo());
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}

	public void exibirSaldoPoupanca() {
		System.out.println("Digite o CPF do titular: ");
		int cpf = sc.nextInt();
			
		for(Conta c : contasPoupanca) {
			if (cpf == c.cliente.getCpf()) {
				System.out.println("Saldo CP: " + c.saldo());
			} else {
				System.out.println("Conta não encontrada!");
			}
		}
	}
 	
}

