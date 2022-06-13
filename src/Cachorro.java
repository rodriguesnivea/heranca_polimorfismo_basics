
public class Cachorro extends Animal{
	private int qtdPatas;
	private boolean pelo;
	private String raca;
	@Override
	public void falar() {
		System.out.println("Au au");
	}
	
	public Cachorro(String nome, String especie) {
		super(nome, especie);
	}

	public Cachorro(String nome, String especie, int qtdPatas, boolean pelo, String raca) {
		super(nome, especie);
		this.qtdPatas = qtdPatas;
		this.pelo = pelo;
		this.raca = raca;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	public boolean isPelo() {
		return pelo;
	}
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String toString() {
		return "Cachorro [qtdPatas=" + qtdPatas + ", pelo=" + pelo + ", raca=" + raca + "]";
	}
	
}
