package codigos;
import java.util.*;

/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */
public class Agenda extends ItemAgenda {
	
	private List<ItemAgenda> itensAgenda;
	

	/**
	 * Construtor default
	 * 
	 * @param Lista de itemAgendas
	 */
	public Agenda() {
		this.setAgenda();
	}

	/**
	 * Construtor sobrecarregado
	 * 
	 * @param Lista de ItemAgendas
	 */
	public Agenda (List<ItemAgenda> itensAgenda) {
		this.setAgenda(itensAgenda);
	}
	/**
	 * Pega um conjunto de itens pertencentes a classe itemAgenda
	 * 
	 * @return Uma lista de itens
	 */
	public List<ItemAgenda> getItensAgenda() {
		return this.itensAgenda;
	}
	/**
	 * Atribui valor ao conjunto de itens
	 * @param itensAgenda
	 */
	public void setAgenda(List<ItemAgenda> itensAgenda) {
		this.itensAgenda = itensAgenda;
	}
	/**
	 * Default
	 * @param 
	 */
	public void setAgenda() {
		this.itensAgenda = new LinkedList<ItemAgenda>();
	}
	
	/**
	 * Insere itens do tipo ItemAgenda
	 * @param itensAgenda 
	 *
	 */
	public void insereItem(ItemAgenda itensAgenda) {
		this.getItensAgenda().add(itensAgenda);
	}
	/**
	 * Remove itens do tipo ItemAgenda
	 * @param itensAgenda
	 *
	 */
	public void remove(ItemAgenda itensAgenda) {
		try {
			if (this.getItensAgenda().contains(itensAgenda) == true) {
				this.getItensAgenda().remove(itensAgenda);
			}
		}
		catch(Exception e){
			System.out.println("Item não existe");
		} 	
	}
	/**
	 * Verifiica se uma lista é igual a outra
	 * @param objeto
	 *
	 */
	public boolean equals(Object objeto) {
		Agenda aux = (Agenda) objeto;
		if (this.getItensAgenda().size() == aux.getItensAgenda().size())
			return true;
		else
			return false;
	}
	/**
	 * Verifiica o tamanho referente a duas listas
	 * @param objeto
	 * @return int
	 */
	public int compareTo(Agenda objeto) {
		Agenda aux = (Agenda) objeto;
		if (this.getItensAgenda().size() > aux.getItensAgenda().size())
			return 1;
		if (this.getItensAgenda().size() < aux.getItensAgenda().size())
			return -1;
		else
			return 0;
	}
	/**
	 * Metodo que retorna todos os valores da lista
	 *@return List
	 */
	public List TodosOsItens() {
		return this.getItensAgenda();
	}
	/**
	 * Metodo que retorna itens entre duas datas especificas
	 *@return List
	 */
	public List IntervaloDeData(Data _inicial, Data _final) {
		int i;
		List<ItemAgenda> itens_entre_data_informada = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itensAgenda.size(); i++) {
			if (Data.compareTo(this.itensAgenda.get(i).getDuracao().getdInicio(), _inicial) != -1 && 
					Data.compareTo(this.itensAgenda.get(i).getDuracao().getdFim(), _final) != 1) {
				itens_entre_data_informada.add(this.itensAgenda.get(i));
			}
		}
		return itens_entre_data_informada;
	}
	/**
	 * Metodo que retorna itens da classe Meta ordenados
	 *@return List
	 */
	public List informaMetas() {
		int i;
		List<Meta> metas = new LinkedList<Meta>();
		for (i = 0; i < this.itensAgenda.size();i++) {
			if (this.itensAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Meta")) {
				metas.add((Meta) this.itensAgenda.get(i));
			}
		}
		Collections.sort(metas);
		return metas;
	}
	
	/**
	 * Metodo que lista de elementos da classe Lembrete
	 *@return List
	 */
	public List informaLembretes() {
		int i;
		List<Lembrete> lembretes = new LinkedList<Lembrete>();
		for (i = 0; i < this.itensAgenda.size();i++) {
			if (this.itensAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Lembrete")) {
				lembretes.add((Lembrete) this.itensAgenda.get(i));
			}
		}
		Collections.sort(lembretes);
		return lembretes;
	}
	/**
	 * Metodo que lista de elementos da classe Evento
	 *
	 *@return List
	 */
	
	
	public List informaEventos() {
		int i;
		List<Evento> eventos = new LinkedList<Evento>();
		for (i = 0; i < this.itensAgenda.size();i++) {
			if (this.itensAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Evento")) {
				eventos.add((Evento) this.itensAgenda.get(i));
			}
		}
		Collections.sort(eventos);
		return eventos;
	}
	
	/**
	 * Esse metodo retorna uma String referente a classe Agenda
	 * 
	 * @return String
	 */
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(this.getItensAgenda());
		
		return dados.toString();
		
	}
}
