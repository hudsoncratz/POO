
public class Quadrado {
	private Ponto ponto;
	private double comprimento;
	private double espessura;
	private boolean solido;
	
	//Contrutores
	
	public Quadrado (Ponto ponto, double comprimento, double espessura, boolean solido) {
		this.setPonto(ponto);
		this.setComprimento(comprimento);
		this.setEspessura(espessura);
		this.setSolido(solido);
	}
	
	public Quadrado () {
		Ponto p = new Ponto();
		this.setPonto(p);
		this.setComprimento(0.0);
		this.setEspessura(0.0);
		this.setSolido(false);
	}
	
	//Gets
	
	public double getComprimento() {
		return this.comprimento;
	}
	public Ponto getPonto() {
		return this.ponto;
	}
	public double getEspessura() {
		return this.espessura;
	}
	public boolean getSolido() {
		return this.solido;
	}
	
	//Sets
	
	public void setPonto(Ponto p) {
		this.ponto = p;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	public void setSolido(boolean solido) {
		this.solido = solido;
	}
	
	//Metodos
	
	public double calculaArea() {
		return Math.pow(this.comprimento, 2);
	}
	public double calculaPerimetro() {
		return 4 * this.comprimento;
	}
	
	public boolean equals(Object objeto) {
		Quadrado aux = (Quadrado) objeto;
		if (this.getComprimento() == aux.getComprimento() && this.getEspessura() == aux.getEspessura() && 
				this.getSolido() == aux.getSolido()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Coordenada: " + this.getPonto());
		dados.append("\nComprimento: " + this.getComprimento());
		return dados.toString();
	}
	
	
}
