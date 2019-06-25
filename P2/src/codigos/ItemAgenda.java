package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
abstract public class ItemAgenda {
	
	private String titulo, descricao;
	private Periodo duracao;
	
	/**
	 * getTitulo
	 * @return titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	/**
	 * getDescricao
	 * @return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	/**
	 * getDuracao
	 * @return duracao
	 */
	public Periodo getDuracao() {
		return this.duracao;
	}
	
	/**
	 * 
	 * Atribui valor string titulo
	 * @param titulo 
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * 
	 * Atribui valor string descricao
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * 
	 * Atribui valor ao Periodo duracao
	 * @param duracao
	 */
	public void setDuracao(Periodo duracao) {
		this.duracao = duracao;
	}
	/**
	 * Esse metodo retorna uma String referente a classe ItemAgenda
	 * 
	 * @return toString
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append("\nTitulo: " +this.getTitulo());
		dados.append("\nDescricao: " +this.getDescricao());
		dados.append("\nDuracao: " +this.getDuracao());
		
		return dados.toString();
	}
}
