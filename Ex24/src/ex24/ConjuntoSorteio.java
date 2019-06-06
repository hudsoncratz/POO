package ex24;

import ex02.Data;

import java.util.List;

/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class ConjuntoSorteio {
	private List<Sorteio> grupoSorteado;
	private int qtdSorteios = 0;

	/**
	 * Construtor default
	 * 
	 * @param grupoSorteado
	 * @throws Exception 
	 */
	public ConjuntoSorteio() throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere();
		this.qtdSorteios = this.qtdSorteios++;
	}

	/**
	 * Construtor sobrecarregado
	 * 
	 * @param qtd
	 * @throws Exception
	 */
	public ConjuntoSorteio(int qtdSorteios) throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere(qtdSorteios);
		this.qtdSorteios = qtdSorteios + this.qtdSorteios++;
	}

	/**
	 * Construtor sobrecarregado
	 * @throws Exception
	 * 
	 */
	public ConjuntoSorteio(Data data, int qtdSorteios, int quant, int valormin, int valormax) throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere(data, qtdSorteios, quant, valormin, valormax);
		this.qtdSorteios = qtdSorteios + this.qtdSorteios++;
	}
	/**
	 * Metodo default
	 *
	 */
	public List<Sorteio> insere() throws Exception {
		this.grupoSorteado.add(new Sorteio());
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere n sorteios na lista, que foram feitos em uma só data
	 * passada.
	 * 
	 * @param qtdSorteios
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(int qtdSorteios, Data data) throws Exception {
		for (int i = 0; i < qtdSorteios; i++) {
			this.grupoSorteado.add(new Sorteio(data));
		}
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere n sorteios, numa data padrao
	 * 
	 * @param qtdSorteios
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(int _qtdSorteios) throws Exception {
		for (int i = 0; i < _qtdSorteios; i++) {
			Sorteio novo = new Sorteio();
			this.grupoSorteado.add(novo);
		}
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere 1 sorteio, em uma data passada
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(Data data) throws Exception {
		Sorteio novo = new Sorteio(data);
		this.grupoSorteado.add(novo);
		return this.grupoSorteado;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(Data _data, int qtdSorteios, int _quant, int _valormin, int _valormax)
			throws Exception {
		for (int i = 0; i < qtdSorteios; i++) {
			Sorteio novo = new Sorteio(_data, _quant, _valormin, _valormax);
			this.grupoSorteado.add(novo);
		}
		return this.grupoSorteado;
	}

	/**
	 * 
	 * adiciona mais n sorteios 
	 * @param novaqtdSorteios
	 * @throws Exception 
	 */
	public void setQtdSorteios(int novaqtdSorteios) throws Exception {
		if (this.getQtdSorteios() < novaqtdSorteios) {
			this.insere((this.getQtdSorteios()) - (novaqtdSorteios));
		} else
			return;
	}

	/**
	 * 
	 * @return
	 */
	public List<Sorteio> getGrupoSorteado() {
		return this.grupoSorteado;
	}

	/**
	 * 
	 * @return
	 */
	public int getQtdSorteios() {
		return this.qtdSorteios;
	}

	/**
	 * 
	 */
	public String toString() {
		return this.grupoSorteado.toString() + "quantidade de sorteios: " + this.getQtdSorteios();
	}

}