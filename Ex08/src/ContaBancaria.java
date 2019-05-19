public class ContaBancaria implements TaxaDeJuros {
	private String nome;
	private double saldo, txJuros;
	
	//Costrutores
	
	public ContaBancaria(String nome, double saldo, double txJuros) throws Exception {
		this.setContaBancaria(nome, saldo, txJuros);
	}
	public ContaBancaria(String nome, double saldo) throws Exception {
		this(nome, saldo, 0.0);
	}
	
	
	//Gets
	
	public String getNome() {
		return this.nome;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getTxJuros() {
		return this.txJuros;
	}
	
	//Sets
	
	public void setContaBancaria(String nome, double saldo, double txJuros) throws Exception {
		try {
			if(isSaldoValido(saldo) == true) {
				this.nome = nome;
				this.saldo = saldo;
				this.txJuros = txJuros;
			}
		}
		catch(Exception e) {
			throw new Exception ("Saldo invalido");
		}
	}
	
	public static boolean isSaldoValido(double saldo) {
		if(saldo>=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(Object objeto) {
		ContaBancaria aux = (ContaBancaria) objeto;
		if(aux.getNome().equals(this.getNome()) && aux.getSaldo() == this.getSaldo()) {
			return true;
		}
		else return false;
	}
	
	public int compareTo(Object objeto) {
		ContaBancaria aux = (ContaBancaria) objeto;
		if(aux.getSaldo() > this.getSaldo() ) {
			return 1;
		}
		
		if(aux.getSaldo() < this.getSaldo()) {
			return -1;
		}
		else return 0;		
	}
	public void CorrigeSaldo() throws Exception {
		this.setContaBancaria(this.getNome(), this.getSaldo()+this.getTxJuros(),this.getTxJuros());
	}
	
	public String toString() {
		
		StringBuilder conta = new StringBuilder();
		
		conta.append(this.getNome());
		conta.append("\n");
		conta.append(this.getSaldo());
		
		return conta.toString();
	}
}
