import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class ReservaAdulto extends Reserva{
	
	private String profissao;
	
	
	
	public ReservaAdulto(int cod, ArrayList<Hospede> hospede, ArrayList<Cama> cama, LocalDate dataEntrada,
			LocalDate dataSaida, String profissao) {
		super(cod, hospede, cama, dataEntrada, dataSaida);
		this.profissao = profissao;
	}


	@Override
	public double valorAserPago(LocalDate dataEntrada, LocalDate dataSaida) {	// fiz um metodo que pego como parametro a data de entrada e data de saida
		double valorDiaria =100;
		long diferencaDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida); //usei ChronoUnit.DAYS.between para verificar a diferenca de dias
		valorDiaria = valorDiaria * diferencaDias;  // aqui eu faco a logica do pagamento
		return  valorDiaria;
	}






}