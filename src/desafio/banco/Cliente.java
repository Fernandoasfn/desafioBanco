package desafio.banco;

public class Cliente {

	private String nome;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n cpf: " + cpf;
	}
	
}
