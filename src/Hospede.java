	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	public class Hospede{
		
		private int cod;
		private String nome;
		private String cpf;
		private int idade;
		
		public Hospede() {
			
		}
		
		public Hospede(int cod, String nome, String cpf, int idade) {
			super();
			this.cod = cod;
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;
		}





		public int getIdade() {
			return idade;
		}





		public void setIdade(int idade) {
			this.idade = idade;
		}





		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		
		public String toString() {
			return "Codígo do Hospede: " + this.getCod() + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Idade: " + this.getIdade();
		}
		
	}