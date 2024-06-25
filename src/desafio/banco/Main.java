package desafio.banco;

import java.util.Scanner;

import desafio.banco.Banco;
import desafio.banco.Conta;
import desafio.banco.ContaCorrente;
import desafio.banco.ContaPoupanca;
import desafio.banco.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Banco banco = new Banco();
		int operacao;
		
		do{
		System.out.println(" ");
		System.out.println("Bem vindo ao Banco DIO: ");
		System.out.println("1 - Abrir Conta");
		System.out.println("2 - Deposito em conta corrente");
		System.out.println("3 - Deposito em conta poupanca");
		System.out.println("4 - Saque da conta corrente");
		System.out.println("5 - Saque da conta poupanca");
		System.out.println("6 - Extrato da conta corrente");
		System.out.println("7 - Extrato da conta poupança");
		System.out.println("8 - Saldo da conta corrente");
		System.out.println("9 - Saldo da conta poupanca");
		System.out.println("0 - Sair do banco\n");
		
		operacao = sc.nextInt();
		
		switch (operacao) {
			case 1:
				banco.abrirConta();
				break;
			case 2:
				banco.depositarContaCorrente();
				break;
			case 3:
				banco.depositarContaPoupanca();
				break;
			case 4:
				banco.sacarContaCorrente();
				break;
			case 5:
				banco.sacarContaPoupanca();
				break;
			case 6: 
				banco.emitirExtratoCorrente();
				break;
			case 7:
				banco.emitirExtratoPoupanca();
				break;
			case 8:
				banco.exibirSaldoCorrente();
				break;
			case 9:
				banco.exibirSaldoPoupanca();
				break;
			case 0: 
				System.out.println("Desligando aparelho:\n ");
				break;
			default:
				System.out.println("Opção invalida.\n");
				break;
			}
		} while (operacao != 0);

		sc.close();
	}

}
