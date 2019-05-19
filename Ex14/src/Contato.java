
public class Contato extends Email {
	private String nome;
	
	//Costrutor
	
	public Contato(String nome, String email) throws Exception {
		super(email);
		this.setNome(nome);
	}
	public Contato(String email) throws Exception {
		super(email);
		this.setNome("Sem nome");
	}
	
	//Gets
	
	public String getNome() {
		return this.nome; 
	}

	//Sets
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Object objeto) {
		Contato aux = (Contato) objeto;
		if( super.equals(aux)==true && aux.getNome() == this.getNome()) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n");
		dados.append(this.getNome());
		
		return dados.toString();
		}
	
}
