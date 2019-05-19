
public class Retangulo extends Quadrado {
	private double largura;
	private static Ponto p = new Ponto();
	//Contrutores
	
	public Retangulo (Ponto p, double comprimento, double largura, double espessura, boolean solido) {
		super(p, comprimento, espessura, solido);
		this.setLargura(largura);
	}
	public Retangulo() {
		super(p, 0.0, 0.0, false);
		this.setLargura(0);
	}
	
	//Gets
	
	public double getLargura() {
		return this.largura;
	}
	
	//Sets
	
	public void setLargura(double larg) {
		this.largura = larg;
	}
	
	public double calculaArea() {
		return this.getComprimento() * this.largura;
	}
	public double calculaPerimetro() {
		return 2 * this.getComprimento() + 2 * this.largura;
	}
	public boolean equals(Object objeto) {
		Retangulo aux = (Retangulo) objeto;
		if (super.equals(aux) && this.getLargura() == aux.getLargura()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nLargura: " + this.getLargura());
		return dados.toString();
	}
}
