
public class Coordenada {
	private double c;
	
	//Construtores
	
	public Coordenada(double c) {
		this.setCoordenada(c);
	}
	public Coordenada() { //default
		this(0.0);
	}
	// Gets e Sets
	
	public double getC() {
		return this.c;
	}
	
	public void setCoordenada(double c) {
		this.c = c;
	}
	
	public boolean equals(Object objeto) {
		Coordenada aux = (Coordenada) objeto;
		if (this.getC() == aux.getC()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Coordenada: " + getC());
		return dados.toString();
	}
}
