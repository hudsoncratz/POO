package aplicacao;
import codigos.*;
import java.io.*;
import java.util.*;

public class Uso {
  	public static void main(String[] args) throws Exception {
  		Scanner input = new Scanner(System.in);
		
  		Agenda itensAgenda = new Agenda();
  		
  		int menu = 8;
  		String titulo, descricao;
  		int prioridade;
  		String local;
  		int aviso;
  		int diaInicio, mesInicio, anoInicio;
  		int diaFim, mesFim, anoFim;
  		int hInicio, minInicio;
  		int hFim, minFim;
  		

  		while(true) {
  			
  			System.out.println("Insira elementos na lista\n\n");
  			System.out.println("(1) Meta");
  			System.out.println("(2) Lembrete");
  			System.out.println("(3) Evento");
  			System.out.println("(0) Sair");
  			menu = input.nextInt();
  			if(menu ==0) break;
  			//Dados genericos do ItemAgenda
  			
  			System.out.println("Titulo: ");
  			titulo = new Scanner(System.in).nextLine();
  			System.out.println("Descrição: ");
  			descricao = new Scanner(System.in).nextLine();
  			
  			//Incio do ItemAgenda
        
  			System.out.println("Digite o dia de inicio: ");
  			diaInicio = input.nextInt();
  			System.out.println("Digite o mes de inicio: ");
  			mesInicio = input.nextInt();
  			System.out.println("Digite o ano de inicio: ");
  			anoInicio = input.nextInt();
  			Data dInicio = new Data(diaInicio, mesInicio, anoInicio);
  			System.out.println("Digite a hora de inicio: ");
  			hInicio = input.nextInt();
  			System.out.println("Digite os minutos de inicio: ");
  			minInicio = input.nextInt();
  			Horario horaInicio = new Horario(hInicio, minInicio);
        
  			//Fim do evento ItemAgenda
        
  			System.out.println("Digite o dia de fim: ");
  			diaFim = input.nextInt();
  			System.out.println("Digite o mes de fim: ");
  			mesFim = input.nextInt();
  			System.out.println("Digite o ano de fim: ");
  			anoFim = input.nextInt();
  			Data dFim = new Data(diaFim, mesFim, anoFim);
  			System.out.println("Digite a hora de fim: ");
  			hFim = input.nextInt();
  			System.out.println("Digite os minutos de fim: ");
  			minFim = input.nextInt();
  			Horario horaFim = new Horario(hFim, minFim);
  			Periodo duracao = new Periodo(dInicio, dFim, horaInicio, horaFim);
  	  		
  			if(menu == 1) {
  	  			System.out.println("Digite o grau de prioridade: \n");
  	  			prioridade = input.nextInt();
  	  			Meta m = new Meta(titulo, descricao, prioridade, duracao);
  	  			itensAgenda.insereItem(m);
  	  			System.out.println("\n\nMeta adicionada!!! \n");
  	  		}
  	  		if(menu == 2){
  	  			System.out.println("Digite o tempo em quatos minutos vai começar a a tarefa: \n");
  	  			aviso = input.nextInt();
  	  			Lembrete l = new Lembrete(titulo, descricao, duracao, aviso);
  	  			itensAgenda.insereItem(l);
  	  			System.out.println("\n\nLembrete Adicionado!!! \n");
  	  		}
  	  		if(menu == 3) {
  	  			System.out.println("Digite o local do evento: \n");
  	  			local = new Scanner(System.in).nextLine();
  	  			Evento e = new Evento(titulo, descricao, duracao, local);
  	  			itensAgenda.insereItem(e);
  	  			System.out.println("\n\nEvento adicionado!!! \n");
  	  		}
  		}
  		menu = 8;
  		while(true) {
  	  		System.out.println("\n\nO que deseja fazer com a agenda?\n\n");
  			System.out.println("(1) Exibir todos os itens\n");
  			System.out.println("(2) Exibir todos os itens em um intervalo de datas\n");
  			System.out.println("(3) Exibir somente as metas\n");
  			System.out.println("(4) Exibir somente os lembretes (ordenacao: minutos de antecedencai)\n");
  			System.out.println("(5) Exibir eventos\n");
  			System.out.println("(6) Salvar a agenda em um disco\n");
  			System.out.println("(7) recuperar a agenda do disco\n");
  			System.out.println("(0) sair\n\n");
  			menu = input.nextInt();
  			if(menu == 0) break;
  			if(menu == 1) {
  				System.out.println(itensAgenda.TodosOsItens());
  			}
  			if(menu == 2) {
  	  			System.out.println("Digite o dia de inicio do intervalo: ");
  	  			diaInicio = input.nextInt();
  	  			System.out.println("Digite o mes de inicio do intervalo: ");
  	  			mesInicio = input.nextInt();
  	  			System.out.println("Digite o ano de inicio do intervalo: ");
  	  			anoInicio = input.nextInt();
  	  			Data dInicio = new Data(diaInicio, mesInicio, anoInicio);
  	  			System.out.println("Digite o dia de fim do intervalo: ");
  	  			diaFim = input.nextInt();
  	  			System.out.println("Digite o mes de fim do intervalo: ");
  	  			mesFim = input.nextInt();
  	  			System.out.println("Digite o ano de fim do intervalo: ");
  	  			anoFim = input.nextInt();
  	  			Data dFim = new Data(diaFim, mesFim, anoFim);
  				System.out.println(itensAgenda.IntervaloDeData(dInicio, dFim));
  			}
  			if(menu == 3) {
  				System.out.println(itensAgenda.informaMetas());
  			}
  			if(menu == 4) {
  				System.out.println(itensAgenda.informaLembretes());
  			}
  			if(menu == 5) {
  				List<Evento> teste = new LinkedList<Evento>();
				teste = itensAgenda.informaEventos();
				System.out.println(teste);
  			}
  			if(menu == 6) {
  				try {
					BufferedWriter arqSaida;
					arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));  
					arqSaida.write(itensAgenda.toString()+"\r\n");
					arqSaida.close();
					
				} 
  				catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
  			}
  			if(menu == 7) {
  				try {
					BufferedReader arqEnt; 
					arqEnt = new BufferedReader(new FileReader("C:\\Users\\Cratz\\Documents\\2019-1\\Prog III\\P2\\arquivo_de_saida.txt"));
					int i;    
			          while((i=arqEnt.read())!=-1)    
			          System.out.print((char)i);    
			          arqEnt.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();	
  			}
  		}
  	}
  } 	
}
