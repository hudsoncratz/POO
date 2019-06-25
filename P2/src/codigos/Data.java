package codigos;
/**
 * 
 * @author Hudson L. Cratz (junho - 2019)
 * @version 1.0
 *
 */

public class Data {
		/** Dia referente a data */
		 private int dia;
		 /** Mes referente a data */
		 private int mes; 
		 /** Ano referente a data */
		 private int ano;
		 
		/**
		 * Construtor sobrecarregado
		 * 
		 * @param dia
		 * @param mes
		 * @param ano
		 * @throws Exception 
		 */
		 
		public Data(int dia, int mes, int ano) throws Exception {
			this.setData(dia, mes, ano);
		}
		/**
		 * Construtor default
		 * 
		 * @param dia
		 * @param x
		 * @param ano
		 * @throws Exception 
		 */
		public Data(int dia, String x, int ano) throws Exception {
			this.setData(dia, x, ano);
		}
		/**
		 * Construtor default
		 * 
		 * @throws Exception 
		 */
		public Data() throws Exception{
			this.setData(1,1,1900);
		}
		/**
		 * pega o dia
		 * 
		 * @return dia
		 */
		public int getDia () {
			return this.dia;
		}
		/**
		 * pega o mes
		 * 
		 * @return mes
		 */
		public int getMes () {
			return this.mes;
		}
		/**
		 * pega o ano
		 * 
		 * @return ano
		 */
		public int getAno () {
			return this.ano;
		}
		/**
		 * 
		 * Atribui valores a classe Data
		 * @param dia
		 * @param mes
		 * @param ano
		 * @throws Exception 
		 */
		public void setData (int dia, int mes, int ano) throws Exception {
			if (Data.isDataValida(dia, mes, ano) == true)  {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
			else{
				throw new Exception("Data invalida");
			}
		}
			
		/**
		 * Esse metodo verifica se a a data inserida é valida
		 * 
		 * @param dia
		 * @param mes
		 * @param ano
		 * @return boolean
		 */
		public static boolean isDataValida (int dia, int mes, int ano) {
			if(dia < 1 || dia > 31 || mes < 0 || mes > 12 || ano < 1582) {
				return false;
			}
			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
				return true;
			}
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <= 31)) {
				return true;
			}
			if(mes == 2) {
				if( Data.isBissexto(ano) == true) {
					if(dia <= 29) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(dia <= 28) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
			return false;
			}
		}
		/**
		 * Esse metodo verifica se o ano é bissexto
		 *
		 * @param ano
		 * @return boolean
		 */
		public static boolean isBissexto(int ano) {
			if((ano%4 == 0) && (ano%100 == 0 || ano%400 == 0)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		/**
		 * Esse metodo verifica se duas datas são iguais
		 * 
		 * @param objeto
		 * @return boolean
		 */
		public boolean equals(Object objeto) {
			Data aux = (Data) objeto;
			if(aux.getDia() == this.getDia() && aux.getMes() == this.getMes() && aux.getAno() == this.getAno()) {
				return true;
			}
			else return false;
		}
		/**
		 * Esse metodo verifica se duas datas são iguais (0), maior (1) ou menor (-1) do que a outra
		 * 
		 * @param objeto
		 * @return int
		 *
		 */
		public int compareTo(Object objeto)throws Exception {
			Data aux = (Data) objeto;
			if((aux.getAno() > this.getAno()) || (aux.getAno() == this.getAno() && aux.getMes() > this.getMes())
					|| (aux.getAno() == this.getAno() && aux.getMes() == this.getMes() && aux.getDia() > this.getDia()) ) {
				return 1;
			}
			
			if((aux.getAno() < this.getAno()) || (aux.getAno() == this.getAno() && aux.getMes() < this.getMes())
					|| (aux.getAno() == this.getAno() && aux.getMes() == this.getMes() && aux.getDia() < this.getDia()) )  {
				return -1;
			}
			else return 0;		
		}
		/**
		 * Esse metodo retorna uma String referente a classe Data
		 * 
		 * @return String
		 */
		public String toString() {
				
			StringBuilder dados = new StringBuilder();
			
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			
			return dados.toString();
		}
		/**
		 * Esse metodo interpreta o mes (String) 
		 * e retorna um valor inteiro refernte ao mes
		 * @param dia
		 * @param x
		 * @param ano
		 * @throws Exception
		 */
		public void setData (int dia, String x, int ano) throws Exception{
			
			int m = 0;
			
			if(x.equals("janeiro")) 	m = 1;
			if(x.equals("fevereiro")) 	m = 2;
			if(x.equals("março"))		m = 3;
			if(x.equals("abril")) 		m = 4;
			if(x.equals("maio"))		m = 5;
			if(x.equals("junho"))		m = 6;
			if(x.equals("julho")) 		m = 7;
			if(x.equals("agosto")) 		m = 8;
			if(x.equals("setembro")) 	m = 9;
			if(x.equals("outubro")) 	m = 10;
			if(x.equals("novembro")) 	m = 11;
			if(x.equals("dezembro"))	m = 12;
			
			this.setData(dia, m, ano);
			
		}
		/**
		 * Esse metodo acrescenta um dia a data
		 * @throws Exception
		 */
		public void incrementa() throws Exception {	
			try {
				this.setData(this.getDia()+1, this.getMes(), this.getAno());
			}
			catch(Exception e){
				try {
					this.setData(1, this.getMes()+1, this.getAno());
				}
				catch(Exception ex){
					this.setData(1,1,this.getAno()+1);
				}
			}
		}
		/**
		 * Metodo sobrecarregado
		 * Esse metodo acrescenta um determinado numero de dias a data
		 * @param dias
		 * @throws Exception
		 */
			public void incrementa(int dias) throws Exception {
				int i=0;

				while(i!=dias) {
					try {
						this.setData(this.getDia()+1, this.getMes(), this.getAno());
					}
					catch(Exception e){
						try {
						this.setData(1, this.getMes()+1, this.getAno());
						}
						catch(Exception ex){
						this.setData(1,1,this.getAno()+1);
						}
					}
					i++;
				}
			}
		
}
		