package Ex19;

public class CilindroEscalavel implements ObjetoTridimensional, Escalavel {
	Ponto3D sup, inf;
	double raio;

	public CilindroEscalavel(Ponto3D sup, Ponto3D inf, double raio) {
		this.sup = sup;
		this.inf = inf;
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}

	@Override
	public void amplia(double escala) throws Exception {
		this.raio *= escala;
	}

	@Override
	public void espelha() throws Exception {
		this.sup.setX(this.sup.getX() * (-1));
		this.sup.setY(this.sup.getY() * (-1));
		this.inf.setX(this.inf.getX() * (-1));
		this.inf.setY(this.inf.getY() * (-1));
	}

	@Override
	public Ponto3D centro() throws Exception {
		Ponto3D centro = null;
		try {
			centro = new Ponto3D(this.sup.getX(), this.sup.getY(), (this.sup.getZ() - this.inf.getZ()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return centro;
	}

	@Override
	public double calculaSuperficie() {
		double areaCirculo = 2 * Math.PI * Math.pow(this.getRaio(), 2);
		double circunf = 2 * Math.PI * this.getRaio();
		return circunf + 2 * areaCirculo;
	}

	@Override
	public double calculaVolume() {
		double areaCirculo = 2 * Math.PI * Math.pow(this.getRaio(), 2);
		return areaCirculo * this.inf.getZ();
	}

	public String toString() {
		return sup.toString() + inf.toString() + "raio: " + this.getRaio();

	}
}
