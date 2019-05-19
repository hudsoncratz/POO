package E11;

public class Chefe extends Funcionario {

	String departamento;

	double salario;

	public Chefe(String nome, int identidade, Data dtNasc, double salario, Data dtAdm, String departamento) throws Exception{
		super(nome, identidade, dtNasc, salario, dtAdm);
		this.setChefe(departamento);
	}
	public Chefe(String nome, int identidade, Data dtNasc, double salario, double taxa, Data dtAdm, String departamento) throws Exception{
		super(nome, identidade, dtNasc, salario, taxa, dtAdm);
		this.setChefe(departamento);
	}
	public String getDepartamento() {
		return this.departamento;
	}

	public void setChefe(String departamento) throws Exception {
		this.departamento = departamento;
	}
	public double Emprestimo() {
		return super.Emprestimo()*2;
	}
	
	public String toString() {
		
		StringBuilder chefe = new StringBuilder();
		chefe.append(super.toString());
		chefe.append("\n");
		chefe.append(this.departamento);
		
		return chefe.toString();
		
	}

	
	
}
