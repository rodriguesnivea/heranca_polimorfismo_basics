
public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, int idade, String cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + "]";
	}
}
