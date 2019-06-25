package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Meta extends ItemAgenda implements Comparable<Meta> {
	private int prioridade;
	/**
    * construtor para inicializar valores nos campos
    *
    * @param titulo
    * @param descricao
    * @param prioridade
    * @param duracao
	 * @throws Exception 
    */
	public Meta(String titulo, String descricao, int prioridade, Periodo duracao) throws Exception {
		super.setDescricao(descricao);
		super.setDuracao(duracao);
		super.setTitulo(titulo);
		this.setPrioridade(prioridade);
		
	}
	/**
	 * pega o int prioridade
	 * 
	 * @return int
	 */
	public int getPrioridade() {
		return this.prioridade;
	}
	/**
	 * Atribui valor a prioridade
	 * @param prioridade
	 */
	public void setPrioridade(int prioridade) throws Exception {
		if (prioridade < 1) {
			throw new Exception("\nO valor da prioridade deve ser maior do que zero\n");
		}
		else {
			this.prioridade = prioridade;
		}
	}
	/**
	 * Metodo que compara dois itens do tipo Meta
	 * @param meta
	 * @return int
	 */
	public int compareTo(Meta meta) {
		if (this.getPrioridade() < meta.getPrioridade()) return -1;
		else if (this.getPrioridade() > meta.getPrioridade()) return 1;
		else return 0;
	}
	/**
	 * Esse metodo retorna uma String referente a classe Meta
	 * 
	 * @return String
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		dados.append("\nGrau de prioridade: \n" +this.getPrioridade());
		
		return dados.toString();
	}
	
}
