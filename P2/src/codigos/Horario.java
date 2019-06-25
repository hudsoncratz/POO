package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Horario {
	private int h, min;
	/**
	 * Construtor sobrecarregado
	 * 
	 * @param h
	 * @param min
	 * @throws Exception 
	 */
	public Horario(int h, int min) throws Exception {
		this.setHora(h,min);
	}
	/**
	 * Construtor sobrecarregado
	 * 
	 * @param h
	 * @throws Exception 
	 */
	public Horario(int h) throws Exception {
		this.setHora(h,0);
	}
	/**
	 * Construtor default
	 * 
	 * @throws Exception 
	 */
	public Horario() throws Exception {
		this.setHora(0,0);
	}
	/**
	 * pega a hora
	 * 
	 * @return hora
	 */
	public int getHora() {
		return this.h;
	}
	/**
	 * pega os minutos
	 * 
	 * @return minuto
	 */
	public int getMinuto() {
		return this.min;
	}
	/**
	 * Atribui valores a classe Horario
	 * 
	 *@param h
	 *@param min
	 *@throws Exception
	 */
	public void setHora(int h, int min)throws Exception {
		if(isHoraValida(h,min) == true) {
		this.h = h;
		this.min = min;
		}
		else {
			throw new Exception("Hora invalida");
		}
	}
	/**
	 * Esse metodo verifica se dois elementos da classe horario
	 * são iguais
	 * 
	 * @param hora
	 * @return
	 */
	public boolean equals(Object objeto) {
		Horario aux = (Horario) objeto;
		if(aux.getHora() == this.getHora() && aux.getMinuto() == this.getMinuto()) {
			return true;
		}
		else return false;
	}
	/**
	 * Esse metodo verifica se dois elementos da classe horario
	 * são iguais (0), maior (1) ou menor (-1)
	 * 
	 * @param hora
	 * @return 1 se a hora aux for maior do que a atual
	 * @return -1 se a hora aux for menor do que a atual
	 * @return 0 se a hora aux for igual  a atual
	 * 
	 */	
	public int compareTo(Object objeto)throws Exception {
		Horario aux = (Horario) objeto;
		if((aux.getHora() > this.getHora()) || (aux.getHora() == this.getHora() && aux.getMinuto() > this.getMinuto())) {
			return 1;
		}
		
		if((aux.getHora() < this.getHora()) ||(aux.getHora() == this.getHora() && aux.getMinuto() < this.getMinuto())) {
			return -1;
		}
		else return 0;		
	}
	/**
	 * Esse metodo verifica se o elemnto da classe
	 * Horario é valido
	 * 
	 * @param h
	 * @param min
	 * @return true se for valida
	 * @return false se for invalida
	 */		
	public  static boolean isHoraValida(int h, int min) {
		if(h>=0 && h<24 && min>=0 && min<60) {
			return true;
		}
		else return false;
	}
	/**
	 * Esse metodo retorna uma String referente a classe Horaraio
	 * 
	 * @return toString
	 */
	public String toString() {
		
		StringBuilder horario = new StringBuilder();
		
		horario.append(this.getHora());
		horario.append("h");
		horario.append(this.getMinuto());
		horario.append("min");
		
		return horario.toString();
	}
	

		

	}
	
