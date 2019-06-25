package codigos;

/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Evento extends ItemAgenda implements Comparable<Evento>{
	String local;

	/**
	 * Construtor 
	 * 
	 * @param titulo do evento
	 * @param descricao do evento
	 * @param duracao do evento
	 * @param local do evento
	 */
	public Evento(String titulo, String descricao, Periodo duracao, String local) {
		super.setDescricao(descricao);
		super.setDuracao(duracao);
		super.setTitulo(titulo);
		this.setLocal(local);
	}
	/**
	 * pega o valor do local
	 * 
	 * @return localização
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * Atribui valor a variavel local
	 *
	 * @param local String que representa a localização do evento
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * Este metodo compara dois elementos da classe evento
	 *
	 *@return o compareTo da propria classe primitiva 
	 */
	public int compareTo(Evento evento) {
		return this.getLocal().compareTo(evento.getLocal());
	}
	/**
	 * Esse metodo retorna uma String referente a classe Evento
	 * 
	 * @return toString
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		dados.append("\nLocal: " +this.getLocal());
		
		return dados.toString();
	}
}
