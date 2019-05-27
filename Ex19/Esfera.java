package Ex19;

public class Esfera implements ObjetoTridimensional {
	Ponto3D centro;
	double raio;

	public Esfera(double x, double y, double z, double raio) throws Exception {
		this.centro.setX(x);
		this.centro.setY(y);
		this.centro.setZ(z);
		this.raio = raio;
	}

	public double getRaio() {
		return this.raio;
	}

	@Override
	public Ponto3D centro() throws Exception {
		return centro;
	}

	@Override
	public double calculaSuperficie() {
		return 4 * Math.pow(this.getRaio(), 2);
	}

	@Override
	public double calculaVolume() {
		return (4 * Math.pow(this.getRaio(), 3)) / 3;
	}

	public String toString() {
		return centro.toString() + "raio: " + this.getRaio();

	}
}
