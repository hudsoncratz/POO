package E11;

public class Funcionario extends Pessoa {
	double salario, taxa;
	Data dtAdm;

	public Funcionario(String nome, int identidade, Data dtNasc, double salario, Data dtAdm)throws Exception{
		super(nome, identidade, dtNasc);
		this.setFuncionario(salario, dtAdm);
	}
	public Funcionario(String nome, int identidade, Data dtNasc, double salario, double taxa, Data dtAdm)throws Exception{
		super(nome, identidade, dtNasc);
		this.setFuncionario(salario, dtAdm, taxa);
	}
	
	public Data getDtAdm() {
		return this.dtAdm;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getTaxa() {
		return this.taxa;
	}
	
	public void setFuncionario(double salario, Data dtAdm, double taxa) throws Exception{
		this.salario = (taxa + salario);
		this.setFuncionario(this.salario, dtAdm);
	}

	public void setFuncionario(double salario, Data dtAdm)throws Exception {
		this.salario = salario;
		this.dtAdm = dtAdm;
	}
	public double Emprestimo() {
		return getSalario();
	}
	public String toString() {
		
		StringBuilder funcionario = new StringBuilder();
		funcionario.append(super.toString());
		funcionario.append("\n");
		funcionario.append(this.getDtAdm());
		funcionario.append("\n");
		funcionario.append(this.getSalario());
		
		return funcionario.toString();
		
	}


}
