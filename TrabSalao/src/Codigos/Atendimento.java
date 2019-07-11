package Codigos;

/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */
public class Atendimento {
	/** Hoarario referente ao intervalo de atendimento */
	private Horario horaInicio, horaFim;
	/** Nome do cliente */
	private String nomeCliente;
	/** Tipo de servico solicitado */
	private TipoServico tipoServico;
	/** Data marcada para o atendimento */
	private Data dataAtendimento;
	
	/**
	 * Construtor
	 * 
	 * @param horaInicio
	 * @param nomeCliente
	 * @param nomeCliente
	 * @param dataAtendimento
	 * @throws Exception 
	 */
	public Atendimento(Horario horaInicio, String nomeCliente, TipoServico tipoServico, Data dataAtendimento) throws Exception{
		this.setIntervalo(horaInicio, horaInicio);
		this.setNomeCliente(nomeCliente);
		this.setTipoServico(tipoServico);
		this.setDataAtendimento(dataAtendimento);
	}
	/**
	 * pega o tipo de servico
	 * 
	 * @return TipoServico
	 */
	public TipoServico getTipoServico() {
		return this.tipoServico;
	}
	/**
	 * pega o nome do cliente
	 * 
	 * @return String
	 */
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	/**
	 * pega o horario de inicio do atendimento
	 * 
	 * @return Horario
	 */
	public Horario getHoraInicio() {
		return this.horaInicio;
	}
	/**
	 * pega o horario de termino do atendimento
	 * 
	 * @return Horario
	 */
	public Horario getHoraFim() {
		return this.horaFim;
	}
	/**
	 * pega a data marcada para o atendimento
	 * 
	 * @return Data
	 */
	public Data getDataAtendimento() {
		return this.dataAtendimento;
	}
	/**
	 * 
	 * Atribui valor a data
	 * @param dataAtendimento
	 * 
	 */
	public void setDataAtendimento(Data dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	/**
	 * 
	 * Atribui valor ao tipo de servico
	 * @param tipoServico
	 * 
	 */
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	/**
	 * 
	 * Atribui valor ao nome do cliente
	 * @param nomeCliente
	 * 
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	/**
	 * 
	 * Atribui valor ao intervalo de horas ao atendimento
	 * @param horaInicio
	 * @param horaFim
	 * 
	 */
	public void setIntervalo(Horario horaInicio, Horario horaFim) throws Exception {
		horaFim = new Horario(horaFim.getHora()+1);
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	/**
	 * Esse metodo verifica se dois atendimentos são iguais
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals (Object objeto) {
		Atendimento aux = (Atendimento) objeto;
		if(this.getDataAtendimento() == aux.getDataAtendimento() && this.getHoraInicio() == aux.getHoraInicio()
				&& this.getHoraFim() == aux.getHoraFim() && this.getNomeCliente() == aux.getNomeCliente()
				&& this.getTipoServico() == aux.getTipoServico()) return true;
		else return false;
	}
	/**
	 * Esse metodo verifica se os atendimentos são no mesmo horario e data, antes ou depois 
	 * 
	 * @param objeto
	 * @return int
	 */
	public int CompareTo (Object objeto) {
		Atendimento aux = (Atendimento) objeto;
		if((this.getDataAtendimento().compareTo(aux.getDataAtendimento()) == 1) 
				|| (this.getDataAtendimento().compareTo(aux.getDataAtendimento()) == 0 ) && this.getHoraInicio().compareTo(aux.getHoraInicio()) == 1 )
			return 1;
		if((this.getDataAtendimento().compareTo(aux.getDataAtendimento()) == -1) 
				|| (this.getDataAtendimento().compareTo(aux.getDataAtendimento()) == 0 ) && this.getHoraInicio().compareTo(aux.getHoraInicio()) == -1 )
			return -1;
		else return 0;
		
	}
	/**
	 * Esse metodo retorna uma String referente a classe Atendimento
	 * 
	 * @return String
	 */
	
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(this.getDataAtendimento());
		dados.append("\n"+this.getHoraInicio());
		dados.append(" - ");
		dados.append(this.getHoraFim());
		dados.append("\n"+this.getNomeCliente());
		dados.append("\n"+this.getTipoServico());
		
		return dados.toString();
	}
	
	
}
