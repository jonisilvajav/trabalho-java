import java.util.ArrayList;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public abstract class Reserva {
		
		private int cod;
		private ArrayList<Hospede>hospede = new ArrayList<>();
		private ArrayList<Cama> cama = new ArrayList<>();
		private LocalDate dataEntrada;
		private LocalDate dataSaida;
		
		public Reserva() {
			
		}

		public Reserva(int cod, ArrayList<Hospede> hospede, ArrayList<Cama> cama, LocalDate dataEntrada,
				LocalDate dataSaida) {
			super();
			this.cod = cod;
			this.hospede = hospede;
			this.cama = cama;
			this.dataEntrada = dataEntrada;
			this.dataSaida = dataSaida;
			
		}



		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		public ArrayList<Hospede> getHospede() {
			return hospede;
		}

		public void setHospede(ArrayList<Hospede> hospede) {
			this.hospede = hospede;
		}

		public ArrayList<Cama> getCama() {
			return cama;
		}

		public void setCama(ArrayList<Cama> cama) {
			this.cama = cama;
		}

		public LocalDate getDataEntrada() {
			return dataEntrada;
		}

		public void setDataEntrada(LocalDate dataEntrada) {
			this.dataEntrada = dataEntrada;
		}

		public LocalDate getDataSaida() {
			return dataSaida;
		}

		public void setDataSaida(LocalDate dataSaida) {
			this.dataSaida = dataSaida;
		}

		public String toString() {
			return "Codígo da Reserva: " + this.getCod() + "\n Hospede: " + this.getHospede() + "\n Cama: " + this.getCama() + "\n Data de Entrada: " + this.getDataEntrada() + "\n Data de Saída: " + this.getDataSaida();
		}

		public abstract double  valorAserPago(LocalDate dataEntrada, LocalDate dataSaida);
		
		
	}

		
		
		
		

		
		
