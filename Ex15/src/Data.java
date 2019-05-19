import java.util.Date;

@SuppressWarnings("serial")
public class Data extends Date {	
	
	public static int stringMonth(String mes) {
		if (mes.equals("janeiro"))return 1;
		if (mes.equals("fevereiro")) return 2;
		if (mes.equals("marco")) return 3;
		if (mes.equals("abril")) return 4;
		if (mes.equals("maio")) return 5;
		if (mes.equals("junho")) return 6;
		if (mes.equals("julho")) return 7;
		if (mes.equals("agosto")) return 8;
		if (mes.equals("setembro")) return 9;
		if (mes.equals("outubro")) return 10;
		if (mes.equals("novembro")) return 11;
		if (mes.equals("dezembro")) return 12;
		return 0;
	}
	
	@SuppressWarnings("deprecation")
	public void setMonth(String mes){
		super.setMonth(Data.stringMonth(mes) - 1);
	}
	
	@SuppressWarnings("deprecation")
	public int getMonth(){
		return super.getMonth() + 1;
	}
	
	public int quantidadeDias(Object objeto) {
		Data aux = (Data) objeto;
		long quantidade = 0;
		quantidade = (long)((this.getTime() - aux.getTime()) / (1000 * 60 * 24));
		if (quantidade < 0) {
			quantidade = -quantidade;
		}
		return (int)quantidade;

	}

	public void incrementa(long millisegundos) {
		long quantidade;
		quantidade = this.getTime() + millisegundos;
		this.setTime(quantidade);
	}
	
}