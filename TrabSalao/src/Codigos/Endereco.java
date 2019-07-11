package Codigos;
/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */
public class Endereco {
	/** numero referente a Endereco */
	private int num;
	/** telefone referente ao salao */
	private long telefone;
	/** rua e o bairro referente ao salao */
	private String rua = " ", bairro  = " ";
	/**
	 * Construtor default
	 *  
	 */
	public Endereco (){ 
		this.setTelefone(0);
		this.setNum(0);
		this.setBairro("NONE");
		this.setRua("NONE");
	}
	/**
	 * Construtor sobrecarregado
	 * 
	 * @param telefone
	 * @param num
	 * @param rua
	 * @param bairro
	 */
	public Endereco(long telefone, int num, String rua, String bairro) {
		this.setTelefone(telefone);
		this.setNum(num);
		this.setBairro(bairro);
		this.setRua(rua);		
	}
	/**
	 * pega o telefone
	 * 
	 * @return long
	 */
	public long getTelefone() {
		return this.telefone;
	}
	/**
	 * pega o num
	 * 
	 * @return int
	 */
	public int getNum() {
		return this.num;
	}
	/**
	 * pega a rua
	 * 
	 * @return String
	 */
	public String getRua() {
		return this.rua;
	}
	/**
	 * pega a bairro
	 * 
	 * @return String
	 */
	public String getBairro() {
		return this.bairro;
	}
	/**
	 * 
	 * Atribui valor ao telefone
	 * @param telefone
	 * 
	 */
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	/**
	 * 
	 * Atribui valor ao num
	 * @param num
	 * 
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * 
	 * Atribui valor a rua
	 * @param rua
	 * 
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	/**
	 * 
	 * Atribui valor ao bairro
	 * @param bairro
	 * 
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * Esse metodo verifica se dois enderecos são iguais
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		Endereco aux = (Endereco) objeto;
		if(this.getTelefone() == aux.getTelefone() && this.getBairro() == aux.getBairro() 
				&& this.getNum() == aux.getNum() 
				&& this.getRua() == aux.getRua()) return true;
		else return false;
	} 
	/**
	 * Esse metodo retorna uma String referente a classe Endereco
	 * 
	 * @return String
	 */	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("\nBairro: " +this.getBairro());
		dados.append("\nRua: " + this.getRua());
		dados.append("\nN: " + this.getNum());
		dados.append("\nTelefone: " + this.getTelefone());
		
		return dados.toString();
	}
	
	
	
}
