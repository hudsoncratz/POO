package Ex19;

public class Ponto3D extends Ponto {
	private double z;

	public Ponto3D(double x, double y, double z) throws Exception {
		super(x, y);
		this.setZ(z);
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getZ() {
		return this.z;
	}

	public void ampZ(double z) {
		this.setZ(z*this.z);
	}
	
	public String toString() {
		return super.toString() + "z: "+this.getZ()+")";
	}
	
}
