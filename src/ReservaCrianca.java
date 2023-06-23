import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ReservaCrianca extends Reserva {

	private String responsavel;

	public ReservaCrianca() {
		
	}
	

	public ReservaCrianca(int cod, ArrayList<Hospede> hospede, ArrayList<Cama> cama, LocalDate dataEntrada,
			LocalDate dataSaida, String responsavel) {
		super(cod, hospede, cama, dataEntrada, dataSaida);
		this.responsavel = responsavel;
	}
	
	@Override
	public double valorAserPago(LocalDate dataEntrada, LocalDate dataSaida) {	// fiz um metodo que pego como parametro a data de entrada e data de saida
		double valorDiaria =50;
		long diferencaDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida); //usei ChronoUnit.DAYS.between para verificar a diferenca de dias
		valorDiaria = valorDiaria * diferencaDias;  // aqui eu faco a logica do pagamento
		return valorDiaria;
	}
	
	
	
}