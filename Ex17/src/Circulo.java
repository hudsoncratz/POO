
public class Circulo {
	private Ponto ponto;
	private double raio;
	private double espessura;
	private boolean solido;
	//Construtores
	
	public Circulo(Ponto ponto, double raio, double espessura,boolean solido) {
		this.setPonto(ponto);
		this.setRaio(raio);
		this.setEspessura(espessura);
		this.setSolido(solido);
	}
	
	public Circulo() {
		Ponto p = new Ponto();
		this.setPonto(p);
		this.setRaio(0.0);
		this.setEspessura(0.0);
		this.setSolido(false);
	}
	
	//Gets
	
	public Ponto getPonto() {
		return this.ponto;
	}
	public double getRaio() {
		return this.raio;
	}
	public double getEspessura() {
		return this.espessura;
	}
	public boolean getSolido() {
		return this.solido;
	}
	public void setSolido(boolean solido) {
		this.solido = solido;
	}
	
	//Sets
	
	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	
	//Metodos
	
	public double calculaArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	public double calculaPerimetro() {
		return 2 * Math.PI * this.raio;
	}
	public boolean equals(Object objeto) {
		Circulo aux = (Circulo) objeto;
		if ((aux.getPonto()==this.getPonto()) && (aux.getEspessura() == this.getEspessura()) && (aux.getRaio() == this.getRaio()) && (aux.getSolido() == this.getSolido())) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Coordenada: " + this.getPonto());
		dados.append("\nRaio: " + this.getRaio());
		return dados.toString();
	}
	
}
