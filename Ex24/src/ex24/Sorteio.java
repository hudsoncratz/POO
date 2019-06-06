package ex24;

import ex02.Data;

/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 */
public class Sorteio{
	private NumSorteados sorteio;
	private Data dataSort;
	
	/**
	 * construtor default
	 */
	public Sorteio() throws Exception{
		this.setNumSort();
		this.setData();
	}
	
	/**
	 * construtor que precisa gerar um sorteio, inicia a classe com a data default. 
	 */
	public Sorteio(Data data) throws Exception{
		this.setNumSort();
		this.setData(data);
	}
	
	/**
	 * constroi o sorteio de acordo com os parametros
	 * @param data
	 */
	public Sorteio(Data data, int quant, int valormin, int valormax) throws Exception{
		this.setNumSort(quant, valormin, valormax);
		this.setData(data);
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void setData()throws Exception{
		this.dataSort = new ex02.Data(1,1,1900); //Data default
	}
	
	/**
	 * 
	 * @param data
	 */
	public void setData(Data data) throws Exception{
		this.dataSort.setData(data.getDia(), data.getMes(), data.getAno());
	}
	
	public void setNumSort(int quant , int valormin, int valormax) {
		this.sorteio = new NumSorteados(quant,valormin,valormax);
	}
	
	/**
	 * 
	 * @param numSort
	 */
	public void setNumSort(NumSorteados numSort) {
		this.sorteio = numSort;
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param quant quantidade de numeros sorteados
  	 */
	
	public void setNumSort(int quant) {
		this.sorteio = new NumSorteados(quant);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado com valor default
  	 * 
  	 */
	
	public void setNumSort() {
		this.sorteio = new NumSorteados();
	}
	
	
	/**
	 * 
	 */
	public String toString() {
		return this.sorteio.toString() + this.dataSort.toString();		
	}
}