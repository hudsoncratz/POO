
public class Ponto extends Coordenada{
	private Coordenada c1, c2;
	
	public Ponto(Coordenada c1, Coordenada c2) {
		this.setPonto(c1,c2);
	}
	public Ponto() {
		Coordenada c = new Coordenada();
		this.setPonto(c,c);
	}
	
	public Coordenada getC1() {
		return this.c1;
	}
	public Coordenada getC2() { 
		return this.c2;
	}
	
	public void setPonto(Coordenada c1, Coordenada c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean equals(Object objeto) {
		Ponto aux = (Ponto) objeto;
		if ((aux.getC1()==this.getC1()) && aux.getC2() == this.getC2()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Ponto: ("+c1+","+c2+")");
		return dados.toString();
	}

}
