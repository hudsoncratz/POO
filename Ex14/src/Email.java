
public class Email {
	private String email ="";
	
	//Construtores
	
	public Email(String email) throws Exception {
		this.setEmail(email);
	}
	public Email() throws Exception {
		this("Sem email @");
	}
	
	//Gets
	
	public String getEmail() {
		return this.email;
	}
	
	//Sets
	
	public void setEmail(String email) throws Exception{
		try {
			if(temArroba(email)==true) {
				this.email = email; 
			}
		}
		catch(Exception e) {
			throw new Exception("ERROR");
		}
	}
	
	public boolean temArroba(String email) {
		if(email.contains("@")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(Object objeto) {
		Email aux = (Email)objeto;
		if( this.getEmail() == aux.getEmail()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		
		dados.append(this.getEmail());
		
		return dados.toString();
		}
	
}
