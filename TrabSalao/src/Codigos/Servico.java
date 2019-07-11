package Codigos;

/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */
public class Servico {
	/** maximo valor cobrado referente ao servico */
	private static double maxValue = 100;
	/** valor referente ao Servico */
	private double valor;
	/** Tipo de Servico pedido pelo cliente */
	private TipoServico tipoServico;
	/**
	 * Construtor 
	 * 
	 * @param valor
	 * @param tipoServico
	 */
	public Servico(double valor, TipoServico tipoServico) {
		this.setValor(valor);
		this.setTipoServico(tipoServico);
	}
	/**
	 * pega o valor
	 * 
	 * @return valor
	 */
	public double getValor() {
		return this.valor;
	}
	/**
	 * pega o tipo de Servico
	 * 
	 * @return tipoServico
	 */
	public TipoServico getTipoServico() {
		return this.tipoServico;
	}
	/**
	 * 
	 * Atribui valor ao valor do servico
	 * @param valor
	 */
	public void setValor(double valor) {
		try {
			if(valor>0 && valor<maxValue) this.valor = valor;
		}
		catch(Exception e) {
			System.out.println("Valor invalido");
		}
	}
	/**
	 * 
	 * Atribui valor ao tipoServico
	 * @param tipoServico
	 */
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	/**
	 * Esse metodo verifica se dois servicos são iguais
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		Servico aux = (Servico) objeto;
		if(this.getTipoServico() == aux.getTipoServico() && this.getValor() == this.getValor())
			return true;
		else return false;
		
	}
	/**
	 * Esse metodo verifica se um servico é mais caro que o outro
	 * 
	 * @param objeto
	 * @return int
	 */
	public int CompareTo (Object objeto) {
		Servico aux = (Servico) objeto;
		if(this.getValor() > aux.getValor()) return 1;
		if(this.getValor() < aux.getValor()) return -1;
		else return 0;
	}
	/**
	 * Esse metodo retorna uma String referente a classe Servico
	 * 
	 * @return String
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(this.getTipoServico());
		dados.append("\n");
		dados.append(this.getTipoServico());
		
		return dados.toString();
	}
	
	
}
