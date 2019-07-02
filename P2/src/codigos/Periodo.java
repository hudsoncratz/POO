package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Periodo {
	private Data dInicio, dFim;
	private Horario hInicio, hFim;
	
	/**
	 * Construtor
	 * 
	 * @param dInicio
	 * @param dFim
	 * @param hInicio
	 * @param hFim
	 * @throws Exception 
	 */
	public Periodo(Data dInicio, Data dFim, Horario hInicio, Horario hFim) throws Exception {
		setPeriodo(dInicio, dFim, hInicio, hFim);
	}
	/**
	 * pega o valor da data inicial do periodo
	 * 
	 * @return Data
	 */
	public Data getdInicio() {
		return dInicio;
	}
	/**
	 * pega o valor da data final do periodo
	 * 
	 * @return Data
	 */
	public Data getdFim() {
		return dFim;
	}
	/**
	 * pega o valor da hora inicial do periodo
	 * 
	 * @return Horario
	 */
	public Horario gethInicio() {
		return hInicio;
	}
	/**
	 * pega o valor da hora final do periodo
	 * 
	 * @return Horario
	 */
	public Horario gethFim() {
		return hFim;
	}
	/**
	 * 
	 * Atribui valores a classe Periodo
	 * Verificando se o tempo relativo ao final da tarefa é maior
	 * do que o inicial
	 * @param dInicio
	 * @param dFim
	 * @param hInicio
	 * @param hFim
	 * @throws Exception
	 */
	public void setPeriodo(Data dInicio, Data dFim, Horario hInicio, Horario hFim) throws Exception {
		try {
			if( (this.getdInicio().compareTo(dInicio,dFim)==-1) || (this.getdFim().compareTo(dInicio,dFim)==0 && hInicio.compareTo(hFim)==1)) {
				this.dInicio = dInicio;
				this.dFim = dFim;
				this.hInicio = hInicio;
				this.hFim = hFim;
			}
		}
		catch(Exception e){
			System.out.println("ERROR");
		}
	}
	/**
	 * Esse metodo retorna uma String referente a classe Periodo
	 * 
	 * @return String
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append("\nData de inicio: " +this.getdInicio());
		dados.append("\nHorario de inicio: " +this.gethInicio());
		dados.append("\nData de Fim: " +this.getdFim());
		dados.append("\nHorario de Fim: " +this.gethFim());
		
		
		return dados.toString();
	}
	
	
}
