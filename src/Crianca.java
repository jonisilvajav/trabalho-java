public class Crianca extends Hospede{
	
	private String nomeResponsavel;

	public Crianca() {
		
	}
	
	
	

	public Crianca(int cod, String nome, String cpf, int idade, String nomeResponsavel) {
		super(cod, nome, cpf, idade);
		this.nomeResponsavel = nomeResponsavel;
	}




	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	
	public String toString() {
		return "ID: " + this.getCod() + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Idade: " + this.getIdade() + "\n Nome do responsavel :" + this.getNomeResponsavel();
	}
	
	
}