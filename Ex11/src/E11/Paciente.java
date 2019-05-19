package E11;

public class Paciente extends Pessoa {
	String saude;

	public Paciente(String nome, int identidade, Data dtNasc, String saude ) throws Exception {
		super(nome, identidade, dtNasc);
		this.setPaciente(saude);
	}

	public String getSaude() {
		return this.saude;
	}
	
	public void setPaciente(String saude) {
		this.saude = saude;	
	}
	
	public String toString() {
		
		StringBuilder paciente = new StringBuilder();
		paciente.append(super.toString());
		paciente.append("\n");
		paciente.append(this.getSaude());
		
		return paciente.toString();
		
	}
}
