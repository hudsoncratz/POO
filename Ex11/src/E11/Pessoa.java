package E11;

public class Pessoa {
	String nome;
	int identidade;
	Data dtNasc;

	public Pessoa(String nome, int identidade, Data dtNasc)throws Exception {
		this.setPessoa(nome, identidade, dtNasc);
	}

	public String getNome() {
		return this.nome;
	}
	public Data getDtNasc() {
		return this.dtNasc;
	}
	public int getIdentidade() {
		return this.identidade;
	}

	public void setPessoa(String nome, int identidade, Data dtNasc)throws Exception {

		this.dtNasc = dtNasc;
		this.nome = nome;
		this.identidade = identidade;

	}
	public double Emprestimo() {
		return 1000;
	}
	
	public String toString() {
		
		StringBuilder pessoa = new StringBuilder();
		
		pessoa.append(this.getNome());
		pessoa.append("\n");
		pessoa.append(this.getIdentidade());
		pessoa.append("\n");
		pessoa.append(this.getDtNasc());
		
		return pessoa.toString();
	}
	

}
