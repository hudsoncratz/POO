package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {

	int aviso;
	/**
	 * Construtor
	 * 
	 * @param titulo
	 * @param descricao
	 * @param duracao
	 * @param aviso
	 */
	public Lembrete(String titulo, String descricao, Periodo duracao, int aviso) {
		this.setAviso(aviso);
		super.setDescricao(descricao);
		super.setDuracao(duracao);
		super.setTitulo(titulo);
	}
	
	/**
	 * pega o valor do aviso
	 * 
	 * @return int
	 */
	public int getAviso() {
		return this.aviso;
	}
	
	/**
	 * Atribui valor a variavel aviso
	 *
	 * @param aviso
	 */
	public void setAviso(int aviso) {
		try {
			if(aviso>=0)this.aviso = aviso;
		}
		catch(Exception e){
			System.out.println("ERROR");
		}
	}
	/**
	 * método que compara a diferença entre dois itens da classe Lembrete
	 * @param lembrete
	 * 
	 * @return int
	 */
	public int compareTo(Lembrete lembrete) {
		if(this.getAviso() < lembrete.getAviso()) return -1;
		else if (this.getAviso()<lembrete.getAviso()) return 1;
		else return 0;
	}
	/**
	 * Esse metodo retorna uma String referente a classe Lembrete
	 * 
	 * @return String
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		dados.append("\nAviso: " +this.getAviso());
		
		return dados.toString();
	}
	
}
