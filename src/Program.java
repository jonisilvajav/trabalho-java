import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
//SECUNDARIO
public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String menu = "=======HOSTEL======\n"
	            + "1 - Cadastrar Informações \n"
	            + "2 - Editar Informações \n"
	            + "3 - Excluir Informações \n"
	            + "4 - Listar Informações\n"
	            + "5 - Relatórios\n"
	            + "0 - Sair";
		int op = 0;
		ArrayList<Reserva> reserva = new ArrayList<>();
		do {
			System.out.println(menu);
			op = sc.nextInt();
			sc.reset();
			switch(op) {
			case 1: 
				
					ArrayList<Cama> camas = new ArrayList<>();
					ArrayList<Hospede> hospedes = new ArrayList<>();
					System.out.println("Digite a quantidade de camas que deseja cadastrar");
					int qtdCamas = sc.nextInt();
					for(int i = 1; i<=qtdCamas; i++) {
						System.out.println("Digite o codigo da cama " + i +":");
						int cod = sc.nextInt();
						sc.nextLine();
						Cama cama = new Cama(cod);
						camas.add(cama);
					}
					
					
						
					
					System.out.println("Hospede Adulto ou crianca (a/c)");
					char tipo1 = sc.next().toLowerCase().charAt(0);
					System.out.println("Digite o codigo do hospede: ");
					int cod = sc.nextInt();
					System.out.println("Digite o nome do hospede: ");
					String nome = sc.next();
					System.out.println("Digite o CPF do hospede: ");
					String cpf = sc.next();
					System.out.println("Digite a idade do hospede: ");
					int idade = sc.nextInt();
					if(tipo1 == 'a') {
						System.out.println("Digite o telefone do hospede: ");
						String telefone = sc.next();
						System.out.println("Digite o email do hospede: ");
						String email = sc.next();
						
						Hospede hospedeAdulto = new Adulto(cod,nome,cpf,idade,telefone,email);
						hospedes.add(hospedeAdulto);
					}else {
						System.out.println("Digite o nome do responsável: ");
						String nomeResponsavel = sc.next();
						Hospede hospedeCrianca = new Crianca(cod,nome,cpf,idade,nomeResponsavel);
						hospedes.add(hospedeCrianca);
					}
					System.out.println("Reserva de Adulto ou Crianca (A/C)");
					char tipo2 = sc.next().toUpperCase().charAt(0) ;
					System.out.println("Digite o codigo da reserva: ");
					int codReserva = sc.nextInt();
					
					try {
                        System.out.println("Digite a data de entrada Exemplo: 2023-06-01");
                        String dataEntradaStr = sc.next();
                        sc.nextLine();
                        LocalDate dataEntrada = LocalDate.parse(dataEntradaStr);

                        System.out.println("Digite a data de saida Exemplo: 2023-06-10");
                        String dataSaidaStr = sc.next();
                        sc.nextLine();
                        LocalDate dataSaida = LocalDate.parse(dataSaidaStr);
                        
                        if(tipo2 == 'A') {
    						System.out.println("Digite sua profissao");
    						String profissao = sc.next();
    						//Depois analisar se todos os parametros estao passando na ordem corretamente
    						Reserva reservaAdulto = new ReservaAdulto(codReserva,hospedes,camas,dataEntrada,dataSaida,profissao);
    						reserva.add(reservaAdulto);
    						System.out.println("Sua reserva de adulto foi feita com sucesso!");
    					}else {
    						System.out.println("Confirme o nome do Responsavel: ");
    						String responsavel = sc.next();
    						//Depois analisar se todos os parametros estao passando na ordem corretamente
    						Reserva reservaCrianca = new ReservaCrianca(codReserva,hospedes,camas,dataEntrada,dataSaida,responsavel);
    						reserva.add(reservaCrianca);
    						System.out.println("Sua reserva de crianca foi feita com sucesso!");
    					}
    					
    					

                        // Crie o objeto Reserva e adicione-o à lista de reservas aqui
                        // ...

                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro ao processar as datas da reserva: " + e.getMessage());
                    }
					/*for(Reserva reservado: reserva) {
						  
					}*/
				
					
				break;
			case 2:
				System.out.println("==EDITAR INFORMACOES==");
				System.out.println("Digite o codigo da reserva: ");
				int alteracao= sc.nextInt();
				for(Reserva editarInfo : reserva) {
					if(alteracao == editarInfo.getCod()) {
						System.out.println("Digite a nova data de entrada de alteracao Exemplo: 2023-06-01 ");
						String novaDataEntradaStr = sc.next();
						sc.nextLine();
						LocalDate attDataEntrada = LocalDate.parse(novaDataEntradaStr);
						editarInfo.setDataEntrada(attDataEntrada);
						
						System.out.println("Digite a nova data de saida de alteracao Exemplo: 2023-06-10 ");
						String novaDataSaidaStr = sc.next();
						sc.nextLine();
						LocalDate attDataSaida = LocalDate.parse(novaDataSaidaStr);
						editarInfo.setDataSaida(attDataSaida);
						System.out.println("Alteracoes Salvas com sucesso!");
					}
				}
					
				// passar um foreache pegando um id editando o dia de entrada e o dia de saida
				
				break;
			case 3:
				System.out.println("Digite o codigo da reserva para excluir uma reserva: ");
				int excluir = sc.nextInt();
				boolean reservaEncontrada = false;

				for (Reserva deletaReserva : reserva) {
				    if (excluir == deletaReserva.getCod()) {
				        reserva.remove(deletaReserva);
				        reservaEncontrada = true;
				        System.out.println("Reserva apagada com sucesso!");
				        break; // Saia do loop após encontrar e remover a reserva
				    }
				}

				if (!reservaEncontrada) {
				    System.out.println("Erro ao deletar reserva. Reserva não encontrada.");
				}
				break;
			case 4: 
				 System.out.println("Digite o código da reserva que deseja visualizar: ");
				    int codDesejado = sc.nextInt();
				    
				  

				    for (Reserva listagem : reserva) {
				    	
				    	
				    	
				        if (codDesejado == listagem.getCod()) {
				            System.out.println("Código da Reserva: " + listagem.getCod());

				            // Listar os hóspedes
				            System.out.println("Hóspedes:");
				            for (Hospede hospede : listagem.getHospede()) {
				                System.out.println("  - Nome: " + hospede.getNome());
				                System.out.println("    CPF: " + hospede.getCpf());
				                // ...
				            }

				            // Listar as camas
				            System.out.println("Camas:");
				            for (Cama cama : listagem.getCama()) {
				                System.out.println("  - Código da Cama: " + cama.getCod());
				                // ...
				            }

				            System.out.println("Data de entrada: " + listagem.getDataEntrada());
				            System.out.println("Data de saída: " + listagem.getDataSaida());

				            long diferencaDias = ChronoUnit.DAYS.between(listagem.getDataEntrada(), listagem.getDataSaida());
				            System.out.println("A quantidade de dias que você reservou foi de: " + diferencaDias);
				            System.out.println("Sua reserva ficou no valor de: " + listagem.valorAserPago(listagem.getDataEntrada(), listagem.getDataSaida()));

				            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

				          break;
				          
				        } else {
				        	System.out.println("Reserva não encontrada");
				        }
				    }
				    break;
				    
			case 5: 
				System.out.println("Relatório de rendimentos :");
				
				for(Reserva valores : reserva) {
					
					System.out.println(valores.valorAserPago(valores.getDataEntrada(), valores.getDataSaida()));					
				}
			

				
				break;
			default:
				System.out.println("Finalizado com sucesso");
			}
		}while(op != 0);
		
	}
}