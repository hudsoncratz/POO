
public class Livro {
	
	private String titulo;
	private String autor;
	private int nPg; 
	private int aEd;
	
	public Livro(String titulo, String autor, int nPg, int aEd ) {
		this.setLivro(titulo, autor, nPg, aEd);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getNPg() {
		return this.nPg;
	}
	public int getAEd() {
		return this.aEd;
	}
	
	public void setLivro(String  titulo, String autor, int nPg, int aEd) {
		this.titulo = titulo;
		this.autor = autor;
		this.nPg = nPg;
		this.aEd = aEd;
	}
	
	public String toString() {
		
		StringBuilder livro = new StringBuilder();
		
		livro.append(this.getTitulo());
		livro.append(this.getAutor());
		livro.append(this.getNPg());
		livro.append(this.getAEd());
		
		return livro.toString();
	}
}
