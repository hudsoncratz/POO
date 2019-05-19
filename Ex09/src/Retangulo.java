
public class Retangulo {
	private Ponto p1;
	private Ponto p2;
	
	//Construtores
	
	public Retangulo(Ponto p1, Ponto p2) throws Exception  {
		this.setRetangulo(p1,p2);
	}
	public Retangulo (double x1,double y1, double x2, double y2) throws Exception {
		Ponto p1 = new Ponto(x1,y1);
		Ponto p2 = new Ponto(x2,y2);
		this.setRetangulo(p1,p2);
	}
	public Retangulo() throws Exception  {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		this.setRetangulo(p1, p2);
	}
	//Gets
	public Ponto getP1() {
		return this.p1;
	}
	
	public Ponto getP2() {
		return this.p2;
	}
	
	//Sets
	
	public void setRetangulo(Ponto p1, Ponto p2)  {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	//Metodos
	
	public double ladoX(Ponto p1, Ponto p2) throws Exception {
		Ponto p = new Ponto(p2.getX(), p1.getY());
		double d;
		d = p.distancia(p1);
		return d;
	}
	
	public double ladoY(Ponto p1, Ponto p2) throws Exception {
		Ponto p = new Ponto(p2.getX(), p1.getY());
		double d;
		d = p.distancia(p2);
		return d;
	}
	
	public double perimetro (Ponto p1, Ponto p2) throws Exception {
		double d;
		d = 2*(this.ladoX(p1, p2)+ this.ladoY(p1, p2));
		return d;
	}
	public double area (Ponto p1, Ponto p2) throws Exception {
		double a;
		a = Math.pow(this.ladoX(p1, p2)+ this.ladoY(p1, p2), 2);
		return a;
	}
	public boolean equals (Ponto p1, Ponto p2) {
		
		if(p1.equals(p2)==true) {
			return true;
		}
		else return false;
	}
	public boolean equalsArea(Object objeto) throws Exception {
		Retangulo aux = (Retangulo) objeto;
		
		if(aux.area(aux.getP1(), aux.getP2()) == this.area(this.getP1(),this.getP2())) {
			return true;
		}
		else return false;
	}
	public int compareTo(Object objeto) throws Exception {
		Retangulo aux = (Retangulo) objeto;
		
		double area1 = this.area(this.getP1(),this.getP2());
		double area2 = aux.area(aux.getP1(), aux.getP2());
		if( area1 > area2 ) {
			return 1;
		}
		if( area1 < area2 ) {
			return -1;
		}
		return 0;
	}
	public String toString() {
		return p1.toString() + " - " + p2.toString();
	}

}
