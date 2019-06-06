package ex24;

import java.io.Serializable;
import java.util.*;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * TreeSet.
 * <p>
 * De fotma a não gerar repetições, oferece métodos para sortear numeros
 * 
 * @author Hudson L. Cratz
 * @version 1.0 (junho - 2019)
 */
public class NumSorteados implements Serializable {
	/**
	 * Variaveis
	 */
	private TreeSet<Integer> numeros = new TreeSet<Integer>(); // arvore de numeros sorteados
	private final static int FaixaMaxDefault = 99, FaixaInfDefault = 0, QuantDefault = 4;
	private int faixaSup = NumSorteados.FaixaMaxDefault, faixaInf = NumSorteados.FaixaInfDefault,
			quant = NumSorteados.QuantDefault;

	/**
	 * construtor basico para gerar uma TreeSet de forma aleatoria
	 */
	public NumSorteados() {
		this.sorteia();
	}

	/**
	 * construtor que altera os valores default e gera
	 * 
	 * @param tam
	 * @param valormin
	 * @param valormax
	 */
	public NumSorteados(int tam, int valormin, int valormax) {
		this.setQuant(tam);
		this.setFaixaInf(valormin);
		this.setFaixaSup(valormax);
		this.sorteia();
	}

	/**
	 * 
	 */
	public NumSorteados(int quant) {
		this.setQuant(quant);
		this.sorteia();
	}

	/**
	 * metodo pra sortear o numero
	 * 
	 */
	public void sorteiaAntigo() {
		int x, i = 1;
		Random aleatorio = new Random();
		while (i <= this.getQuant()) {
			x = aleatorio.nextInt(this.getFaixaSup());
//			System.out.println("X =" + x + " i" + i);
			if (this.numeros.contains(x) == true)
				i--;
			else {
				this.numeros.add(new Integer(x));
				i++;
			}
		}
	}

	public void sorteia() {
		Integer x, i = this.getQuant();
		Random aleatorio = new Random();
		while (i >= 0) {
			x = aleatorio.nextInt(this.getFaixaSup());
			System.out.println("X =" + x + " i" + i);
			if (this.numeros.contains(x)) i++;
			else {
				this.numeros.add(new Integer(x));
				i--;
			}
		}

	}
	/**
	 * alterar o tamanho da TreeSet
	 * 
	 * @param tam
	 */
	public void setQuant(int tam) {
		if (tam >= 0)
			this.quant = tam;
		else
			this.quant = 0;
	}

	/**
	 * alterar o valor maximo da TreeSet
	 * 
	 * @param valormax
	 */
	public void setFaixaSup(int valormax) {
		this.faixaSup = valormax;
	}

	/**
	 * alterar o valor minimo da TreeSet
	 * 
	 * @param valormin
	 */
	public void setFaixaInf(int valormin) {
		this.faixaInf = valormin;
	}

	/**
	 * get do valor maximo da TreeSet
	 * 
	 * @return valor maximo alteravel
	 */
	public int getFaixaSup() {
		return this.faixaSup;
	}

	/**
	 * get do valor minimo da TreeSet
	 * 
	 * @return valor minimo alteravel
	 */
	public int getFaixaInf() {
		return this.faixaInf;
	}

	/**
	 * get do tamanho alteravel
	 * 
	 * @return tamanho da treeset
	 */
	public int getQuant() {
		return this.quant;
	}

	/**
	 * get do tamanho default da TreeSet
	 * 
	 * @return o tamanho default da TreeSet
	 */
	public int getQuantDefault() {
		return this.QuantDefault;
	}

	/**
	 * get do valor maximo
	 * 
	 * @return o valor maximo de um numero sorteado
	 */
	public int getFaixaSupDefault() {
		return this.FaixaMaxDefault;
	}

	/**
	 * get do valor minimo/
	 * 
	 * @return o valor minimo de um numero
	 */
	public int getFaixaInfDefault() {
		return this.FaixaInfDefault;
	}

	/**
	 * pega a TreeSet de numeros sorteados
	 * 
	 * @return numeros sorteados
	 */

	public TreeSet getNumSorteados() {
		return this.numeros;
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo dos numeros
	 * sorteados
	 * 
	 * @return retorna uma String como os dados da classe 
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.numeros);
		return info.toString();
	}
}