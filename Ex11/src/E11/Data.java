package E11;

public class Data {
	int dia, mes, ano;

	public Data(int dia, int mes, int ano) throws Exception {
		this.setData(dia, mes, ano);
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setData(int dia, int mes, int ano) throws Exception {

		if (Data.isDataValida(dia, mes, ano) == true) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;

		} else {
			throw new Exception("Data invalida");
		}
	}

	public static boolean isDataValida(int dia, int mes, int ano) {
		if (dia < 1 || dia > 31 || mes < 0 || mes > 12 || ano < 1582) {
			return false;
		}
		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
			return true;
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <= 31)) {
			return true;
		}
		if (mes == 2) {
			if (Data.isBissexto(ano) == true) {
				if (dia <= 29) {
					return true;
				} else {
					return false;
				}
			} else {
				if (dia <= 28) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public static boolean isBissexto(int ano) {
		if ((ano % 4 == 0) && (ano % 100 == 0 || ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}
	
	public String toString() {
		
		StringBuilder dados = new StringBuilder();
		
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		
		return dados.toString();
	}
	

}
