package Ex19;
//(a)
public class RetanguloEscalavel implements ObjetoGeometrico, Escalavel{
	private Ponto vse, vid, centro; //vertice superior esquerdo,, vertice inferior direito
	
	public RetanguloEscalavel(Ponto _centro, Ponto _vse, Ponto _vid) {
		this.centro = _centro; 
		this.vse = _vse; 
		this.vid = _vid;
	}
	
	@Override
	public void amplia(double escala) throws Exception {
		this.vse.ampX(escala);
		this.vse.ampY(escala);
	}

	@Override
	public void espelha() throws Exception {
		this.vse = new Ponto(this.vse.getX()*(-1),this.vse.getY()*(-1));
		this.vid = new Ponto(this.vse.getX()*(-1),this.vse.getY()*(-1));
	}


	@Override
	public double calculaÁrea() {
		double area = ((this.vse.getX() - this.vid.getX())*(this.vse.getY() - this.vid.getY()));
		return area;
	}

	@Override
	public double calculaPerímetro() {
		double vertical = this.vse.getX() - this.vid.getX();
		double horizontal = this.vse.getY() - this.vid.getY();
		return 2*vertical + 2*horizontal;
	}

	@Override
	public Ponto centro() {
		return this.centro;
	}

	@Override
	public ObjetoGeometrico clona() {
		RetanguloEscalavel novo = new RetanguloEscalavel(this.centro,this.vid,this.vse);
		return novo;
	}
	
	public String toString() {
		return "superior esquerdo: "+vse.toString()+"inferior direito: "+vid.toString();
	}

}
