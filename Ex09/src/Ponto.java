
public class Ponto {
	private double x,y;
	private static final double LIMITEINFERIOR = 0;
	private static final double LIMITESUPERIOR = 500;
	private static double limInferior = LIMITEINFERIOR;
	private static double limSuperior = LIMITESUPERIOR;
	
	
	//construtores
	
	public Ponto(double x, double y)throws Exception {
		this.setPonto(x,y);
	}
	public Ponto() throws Exception{
		this(0,0);
	}
	public Ponto(String xy) {
	}
	
	//Gets
	
	public static double getLimInferior() {
		return Ponto.limInferior;
	}
	
	public static double getLimSuperior() {
		return Ponto.limSuperior;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}	
	
	//Sets
	
	public static void setLimInferior(double limite) {
		Ponto.limInferior = limite;
	}
	
	public static void setLimSuperior(double limite) {
		Ponto.limSuperior = limite;
	}
	public void setPonto(double x, double y) throws Exception {
		try {
			if(x>=limInferior && x<=limSuperior && y>=limInferior && y<=limSuperior ) {
				this.x = x;
				this.y = y;
			}
		}
		catch(Exception e){
			throw new Exception("ERROR");
		}
	}
	
	//Metodos
	
	public boolean equals(Object objeto) {
		Ponto aux = (Ponto) objeto;
		if((aux.getX() == this.getX())  && aux.getY() == this.getY()) {
			return true;
		}
		else return false;
	}
	
	public Ponto clone() {
		Ponto aux;
		try {
			aux = new Ponto(this.getX(), this.getY());
		} catch (Exception e) {
			return null;
		}
		return aux;	
	}	
	public void criaSwap() throws Exception {
		this.setPonto(getY(), getX());
	}
	public boolean temEixoComum(Object objeto) {
		Ponto aux = (Ponto) objeto;
		if((aux.getX() == 0 && aux.getY()==0) || this.getX() == 0 && this.getY()==0) {
			return true;
		}
		if((aux.getX()>=0 && aux.getY()>=0) && (this.getX()<=0 && aux.getY()<=0)) {
			return false;
		}
		if((aux.getX()<=0 && aux.getY()>=0) && (this.getX()>=0 && aux.getY()<=0)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public double distancia(Object objeto) {
		Ponto aux = (Ponto) objeto;
		double d;
		d = Math.sqrt(Math.pow(aux.getX() - this.getX(), 2) + Math.pow(aux.getY() - this.getY(), 2));
		return d;
	}
	public double distancia(double x, double y) {
		
		double d;
		d = Math.sqrt(Math.pow(x- this.getX(), 2) + Math.pow(y - this.getY(), 2));
		return d;
	}
	
	public static double distancia(double x1, double y1, double x2, double y2) {
		double d;
		d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return d;
	}
	public double distanciaDaOrigem() {
		double d;
		d = Math.sqrt(Math.pow(0- this.getX(), 2) + Math.pow(0 - this.getY(), 2));
		return d;
	}
	
	public int compareTo(Object objeto) {
		Ponto aux = (Ponto) objeto;
		double d1, d2;
		d1 = this.distanciaDaOrigem();
		d2 = aux.distanciaDaOrigem();
		if(d1>d2) {
			return 1;
		}
		if(d1<d2) {
			return -1;
		}
		else return 0;
	}
	
		public String toString() {
			
			StringBuilder ponto = new StringBuilder();
			
			ponto.append("(");
			ponto.append(this.getX());
			ponto.append(",");
			ponto.append(this.getY());
			ponto.append(")");
			
			return ponto.toString();
		}
		
}

