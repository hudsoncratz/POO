
public class Cliente extends Contato {
	private int celular;
	private String endereco;
	private double renda;
	private static final double RENDAFIXA = 2000;
	private static double rendaFixa = RENDAFIXA;
	
	//Construtores
	
	public Cliente(String nome, String email, int celular, String endereco, double renda) throws Exception {
		super(nome, email);
		this.setCliente(celular, endereco, renda);
	}
	public Cliente(String nome, String email) throws Exception {
		super(nome, email);
		this.setCliente(99999999, "Vazio", 0.0);
	}
	
	//Gets
	
	public int getCelular() {
		return this.celular;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public double getRenda() {
		return this.renda;
	}
	public static double getLimInferior() {
		return Cliente.rendaFixa;
	}
	
	//Sets
	
	public void setCliente(int celular, String endereco, double renda) {
		this.celular = celular;
		this.endereco = endereco;
		this.renda = renda;
	}
	public static void setRendaFixa(double limite) {
		Cliente.rendaFixa = limite;
	}
	
	public boolean equals(Object objeto) {
		Cliente aux = (Cliente) objeto;
		if( super.equals(aux)==true && (aux.getCelular() == this.getCelular())
				&& (aux.getEndereco() == this.getEndereco()) && (aux.getRenda() == this.getRenda())) {
			return true;
		}
		else return false;
	}
	public static String categoriaCliente(double renda) {
		if(renda>rendaFixa) {
			return "top";
		}
		else return "usual";
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n");
		dados.append(this.getCelular());
		dados.append("\n");
		dados.append(this.getEndereco());
		dados.append("\n");
		dados.append(this.getRenda());
		
		
		
		return dados.toString();
		}
}
