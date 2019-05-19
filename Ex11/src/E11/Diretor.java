package E11;

public class Diretor extends Chefe {

	Data dtProm;
	
	public Diretor(String nome, int identidade, Data dtNasc, double salario, Data dtAdm, String departamento, Data dtProm) throws Exception {
		super(nome, identidade, dtNasc, salario, dtAdm, departamento);
		this.setDiretor(dtProm);
	}
	public Diretor(String nome, int identidade, Data dtNasc, double salario, double taxa, Data dtAdm, String departamento, Data dtProm) throws Exception {
		super(nome, identidade, dtNasc, salario, taxa, dtAdm, departamento);
		this.setDiretor(dtProm);
	}
	
	public Data getDtProm() {
		return this.dtProm;
	}
	
	public void setDiretor(Data dtProm) {
		this.dtProm = dtProm;
	}
	public double Emprestimo() {
		return super.Emprestimo()*1.5;
	}
	public String toString() {
		
		StringBuilder diretor = new StringBuilder();
		diretor.append(super.toString());
		diretor.append("\n");
		diretor.append(this.dtProm);
		
		return diretor.toString();
		
	}
	
}
