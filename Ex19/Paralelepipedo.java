package Ex19;

public class Paralelepipedo implements ObjetoTridimensional {
	Ponto3D c1, c2, centro;
	double a = this.c1.getX() - this.c2.getX();
	double b = this.c1.getY() - this.c2.getY();
	double c = this.c1.getZ() - this.c2.getZ();

	public Paralelepipedo(Ponto3D c1, Ponto3D c2, Ponto3D centro) {
		this.c1 = c1;
		this.c2 = c2;
		this.centro = centro;
	}
	
	@Override
	public Ponto3D centro() throws Exception {
		// TODO Auto-generated method stub
		return this.centro;
	}

	@Override
	public double calculaSuperficie() {
		return 2 * (a * b + b * c + c * a);
	}

	@Override
	public double calculaVolume() {
		return a*b*c;
	}
	
	public String toString() {
		return c1.toString()+c2.toString()+centro.toString();
	}
	
}
