package Codigos;
/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */

public class Salao{
	/** numero de horas que o salao fica aberto */
	private int numAtendimentos;
	/** Endereco referente ao Salao */
	private Endereco localizaSalao;
	/** nome referente ao Salao */
	private String nomeSalao;
	/** horario de abertura referente ao Salao */
	private Horario horarioAbertura;
	/**
	 * Construtor
	 * 
	 * @param numAtendimentos
	 * @param localizaSalao
	 * @param nomeSalao
	 * @param horarioAbertura
	 */
	public Salao(int numAtendimentos, Endereco localizaSalao, String nomeSalao, Horario horarioAbertura) {
		this.setHorarioAbertura(horarioAbertura);
		this.setLocalizaSalao(localizaSalao);
		this.setNomeSalao(nomeSalao);
		this.setNumAtendimentos(numAtendimentos);
	}
	/**
	 * pega o numero de horas que o salao fica aberto
	 * 
	 * @return numAtendimentos
	 */
	public int getNumAtendimentos() {
		return this.numAtendimentos;
	}
	/**
	 * pega Endereco referente ao Salao
	 * 
	 * @return localizaSalao
	 */
	public Endereco getLocalizaSalao() {
		return this.localizaSalao;
	}
	/**
	 * pega nome referente ao Salao
	 * 
	 * @return nomeSalao
	 */
	public String getNomeSalao() {
		return this.nomeSalao;
	}
	/**
	 * pega  horario de abertura referente ao Salao
	 * 
	 * @return horarioAbertura
	 */
	public Horario getHorarioAbertura() {
		return this.horarioAbertura;
	}
	/**
	 * 
	 * Atribui valor ao numAtendimentos
	 * @param numAtendimentos
	 * 
	 */
	public void setNumAtendimentos(int numAtendimentos) {
		this.numAtendimentos = numAtendimentos;
	}
	/**
	 * 
	 * Atribui valor ao localizaSalao
	 * @param localizaSalao
	 * 
	 */
	public void setLocalizaSalao(Endereco localizaSalao) {
		this.localizaSalao = localizaSalao;
	}
	/**
	 * 
	 * Atribui valor ao nomeSalao
	 * @param nomeSalao
	 * 
	 */
	public void setNomeSalao(String nomeSalao) {
		this.nomeSalao = nomeSalao;
	}
	/**
	 * 
	 * Atribui valor ao horarioAbertura
	 * @param horarioAbertura
	 * 
	 */
	public void setHorarioAbertura(Horario horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}
	/**
	 * Esse metodo verifica se dois saloes são iguais
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		Salao aux = (Salao) objeto;
		if(this.getHorarioAbertura() == aux.getHorarioAbertura() && this.getLocalizaSalao() == aux.getLocalizaSalao()
				&& this.getNomeSalao() == aux.getNomeSalao() && this.getNumAtendimentos() == aux.getNumAtendimentos())
			return true;
		else return false;
	}
	/** 
	 * Esse metodo verifica se um salao fica mais tempo aberto que o outro
	 * 
	 * @param objeto
	 * @return int
	 *
	 */	
	public int CompareTo(Object objeto) {
		Salao aux = (Salao) objeto;
		if(this.getNumAtendimentos() > aux.getNumAtendimentos()) return 1;
		if(this.getNumAtendimentos() < aux.getNumAtendimentos()) return -1;
		else return 0;
	}
	/**
	 * Esse metodo retorna uma String referente a classe Salao
	 * 
	 * @return String
	 */	
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		dados.append("Nome do Salao: " +this.getNomeSalao());
		dados.append("\nEndereco:\n" +this.getLocalizaSalao());
		dados.append("\nHorario de Abertura: " +this.getHorarioAbertura());
		return dados.toString();
	}


	
	
	
	
	
	
}
