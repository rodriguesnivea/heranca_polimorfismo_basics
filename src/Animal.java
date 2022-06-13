
public class Animal {
	private String nome;
	private String especie;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", especie=" + especie + "]";
	}
	
	public void falar() {
		System.out.println("Fala");
	}
	
}
