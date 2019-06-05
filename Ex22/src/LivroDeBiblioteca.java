public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
	private String statusEmprestimo;
	private String localizacao, descricao;
	
	public LivroDeBiblioteca(String titulo, String autor, int nPg, int aEd, String statusEmprestimo,
			String localizacao, String descricao) {
		
		super(titulo, autor, nPg, aEd);
		this.setLocalizacao(localizacao);
		this.setDescricao(descricao);
		this.setStatusEmprestimo(statusEmprestimo);
	}

	public String isStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public void setStatusEmprestimo(String statusEmprestimo) {
		try {
			if(statusEmprestimo.equals("EMPRESTADO") || statusEmprestimo.equals("DEVOLVIDO")
				|| statusEmprestimo.equals("EMATRASO") || statusEmprestimo.equals("EMMANUTENCAO")  ) {
				this.statusEmprestimo = statusEmprestimo;
			}
		}
		catch(Exception e) {
			System.out.println("Campo invalido");
		}
	}
	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String isEmprestado() {
		return this.isStatusEmprestimo();
	}

	@Override
	public void empresta() {
		if(this.isEmprestado() == "DEVOLVIDO"){
			this.setStatusEmprestimo("EMPRESTADO");
		}
	}

	@Override
	public void devolve() {
		this.setStatusEmprestimo("EMATRASO");
	}

	@Override
	public String localiza() {
		return this.getLocalizacao();
	}

	@Override
	public String apresentaDescricao() {
		return this.getDescricao();
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("'");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.isStatusEmprestimo());
		dado.append(",");
		dado.append(this.getLocalizacao());
		dado.append(",");
		dado.append(this.getDescricao());
		dado.append("' ");
		return dado.toString();
	}
}


