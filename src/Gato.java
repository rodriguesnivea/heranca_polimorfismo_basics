
public class Gato extends Animal{
	private int qtdPatas;
	private boolean pelo;
	private String raca;
	@Override
	public void falar() {
		System.out.println("Miau");
	}
	
	public Gato(String nome, String especie) {
		super(nome, especie);
	}

	public Gato(String nome, String especie, int qtdPatas, boolean pelo, String raca) {
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
		return "Gato [qtdPatas=" + qtdPatas + ", pelo=" + pelo + ", raca=" + raca + "]";
	}
	
}
