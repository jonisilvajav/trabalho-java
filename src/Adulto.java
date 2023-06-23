public class Adulto extends Hospede {

	private String telefone;
	private String email;
	
	
	
	

	public Adulto(int cod, String nome, String cpf, int idade, String telefone, String email) {
		super(cod, nome, cpf, idade);
		this.telefone = telefone;
		this.email = email;
	}




	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String toString() {
		return "ID: " + this.getCod() + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Idade: " + this.getIdade() + "\n Telefone: " + this.getTelefone() + "\n Email: " + this.getEmail();
	}
	
	
		
}