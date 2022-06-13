
public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, int idade, String cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + "]";
	}
	
}
