package Codigos;
/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */
public class Horario {
	/** hora e minutos referente ao Horario */
	private int h, min;
	/**
	 * Construtor sobrecarregado
	 * 
	 * @param h
	 * @param min
	 */
	public Horario(int h, int min)  {
		this.setHora(h,min);
	}
	/**
	 * Construtor sobrecarregado
	 * 
	 * @param h
	 */
	public Horario(int h) {
		this.setHora(h,0);
	}
	/**
	 * Construtor default
	 * 
	 */
	public Horario()  {
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
	 */
	public void setHora(int h, int min) {
		try {
			if(isHoraValida(h,min) == true) {
				this.h = h;
				this.min = min;
				}
		}
		catch(Exception e) {
			
		}
		
	}
	/**
	 * Esse metodo verifica se dois elementos da classe horario
	 * são iguais
	 * 
	 * @param objeto
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
	 * @param objeto
	 * @return int
	 * 
	 */	
	public int compareTo(Object objeto){
		Horario aux = (Horario) objeto;
		if((this.getHora() > aux.getHora()) || (this.getHora() == aux.getHora() && this.getMinuto() > aux.getMinuto())) {
			return 1;
		}
		
		if((this.getHora() < aux.getHora()) ||(this.getHora() == aux.getHora() && this.getMinuto() < aux.getMinuto())) {
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
	 * @return boolean
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
		horario.append(":");
		horario.append(this.getMinuto());
		
		return horario.toString();
	}
	

		

	}
	
