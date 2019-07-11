package Codigos;
/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */
public enum TipoServico {
	/** enuns referente ao tipoServico */
	Cabelo, Barba, Manicure, Pedicure,
	Depilacao, Tintura;
	/**
	 * Esse metodo verifica se a String inserida faz parte do enum TipoServico
	 *
	 * @param name
	 * @return TipoServico
	 */
    public static TipoServico equals (String name) {
    	if(name.equals("Cabelo")) return TipoServico.Cabelo;
    	if(name.equals("Barba")) return TipoServico.Barba;
    	if(name.equals("Manicure")) return TipoServico.Manicure;
    	if(name.equals("Pedicure")) return TipoServico.Pedicure;
    	if(name.equals("Depilacao")) return TipoServico.Depilacao;
    	else return TipoServico.Tintura;	
    }
	
}
