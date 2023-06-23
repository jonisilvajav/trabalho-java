import java.time.LocalDate;

public class Cama{
		private int cod;

		public Cama() {
			
		}
		
		public Cama(int cod) {
			super();
			this.cod = cod;
		}

		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		public String toString() {
			return "Codígo da Cama: " + this.getCod();
		}
		
		public String haCamaDisponivel(LocalDate dataEntrada, LocalDate dataSaida, int qtdHospede) {
			//data de entrada && data de saida for eqquals reserva.getdataEntrada && reserva.getdataSaida nao e possivel
		
			return "";
		}
		
}