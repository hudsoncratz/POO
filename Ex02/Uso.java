package Ex02;

import java.util.Scanner;

public class Uso {
	public static void main(String[] args) throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		int i=0, dia, mes, ano, menu, k;
		String x;
		
		
		System.out.println("Digite 1 para verificar a data (dd/mm/aa)  ");
		System.out.println("Digite 2 para comparar datas (dd/mm/aa) ");
		System.out.println("Digite 3 para verificar a data (dd/String/aa) ");
		System.out.println("Digite 4 para somar um dia a data (dd/mm/aa) ");
		System.out.println("Digite 5 para um numero pra somar x dia(s) a data (dd/mm/aa) ");
		
		
		System.out.println("\n");
		menu = input.nextInt();
		
		
		
		
		while(i < 3) {
				try {
					if(i != 0) System.out.println("Digite novamente");
					if(menu == 1) {
					
						System.out.println("Digite o dia: ");
						dia = input.nextInt();
						System.out.println("Digite o mes: ");
						mes = input.nextInt();
						System.out.println("Digite o ano: ");
						ano = input.nextInt();
					
						Data d1 = new Data(dia,mes,ano);
							
						System.out.println(d1);
						System.out.println("A data é valida? " +Data.isDataValida(d1.dia, d1.mes, d1.ano));
					}
					if(menu == 2) {
						
						System.out.println("Digite o dia (1): ");
						dia = input.nextInt();
						System.out.println("Digite o mes (1): ");
						mes = input.nextInt();
						System.out.println("Digite o ano (1): ");
						ano = input.nextInt();
						
						Data d1 = new Data(dia,mes,ano);
						
						System.out.println("Digite o dia (2): ");
						dia = input.nextInt();
						System.out.println("Digite o mes (2): ");
						mes = input.nextInt();
						System.out.println("Digite o ano (2): ");
						ano = input.nextInt();
						
						Data d2 = new Data(dia,mes,ano);
						
						System.out.println("Data 1:" +d1);
						System.out.println("Data 2:" +d2);
						System.out.println("As datas são iiguais? " +d1.equals(d2) );
					}
					if(menu == 3) {
						System.out.println("Digite o dia: ");
						dia = input.nextInt();
						System.out.println("Digite o mes (extenso): ");
						x = input.next();
						System.out.println("Digite o ano: ");
						ano = input.nextInt();
						Data d1 = new Data(dia, x, ano);
						System.out.println("\n" +x);
						System.out.println(d1);
						
					}
					if(menu == 4) {
						
						System.out.println("Digite o dia: ");
						dia = input.nextInt();
						System.out.println("Digite o mes: ");
						mes = input.nextInt();
						System.out.println("Digite o ano: ");
						ano = input.nextInt();
						
						Data d1 = new Data(dia,mes,ano);
						
						System.out.println(d1);
						d1.incrementa();
						System.out.println(d1);	
						
					}
					if(menu == 5) {
						System.out.println("Digite o dia: ");
						dia = input.nextInt();
						System.out.println("Digite o mes: ");
						mes = input.nextInt();
						System.out.println("Digite o ano: ");
						ano = input.nextInt();
						
						System.out.println("Digite a quantidade de dias que quer add: ");
						k = input.nextInt();
						
						Data d1 = new Data(dia,mes,ano);
						
						System.out.println(d1);
						d1.incrementa(k);
						System.out.println(d1);	
					}
				break;
				}
				catch(Exception e) {
					System.out.println(e);
					System.out.println("Data invalida");
					Data d1 = new Data();
					System.out.println(d1);
					i = i +1;
					
				}	
			}
	
	}
}
