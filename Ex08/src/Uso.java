import java.util.Scanner;

public class Uso {
	public static void main(String[] args) throws Exception {
		String nome;
		double saldo, txJuros;
		int menu;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 1 para aplicar a a taxa de juros na primeira pessoa ");
		System.out.println("Digite 2 para aplicar a a taxa de juros na segunda pessoa ");
		menu = input.nextInt();
		System.out.println("Digite a taxa de juros:  ");
		txJuros = input.nextDouble();
		
		if(menu==1) {
		
			System.out.println("Digite o seu nome[1]:  ");
			nome = input.next();
			System.out.println("Digite o seu saldo [1]:  ");
			saldo = input.nextDouble();
			ContaBancaria c1 = new ContaBancaria(nome,saldo,txJuros);
			
			System.out.println("Digite o seu nome [2]:  ");
			nome = input.next();
			System.out.println("Digite o seu saldo [2]:  ");
			saldo = input.nextDouble();
			ContaBancaria c2 = new ContaBancaria(nome,saldo);
			c1.CorrigeSaldo();
			System.out.println(c1);
			System.out.println(c2);
		}
		if(menu==2) {
			
			System.out.println("Digite o seu nome[1]:  ");
			nome = input.next();
			System.out.println("Digite o seu saldo [1]:  ");
			saldo = input.nextDouble();
			ContaBancaria c1 = new ContaBancaria(nome,saldo);
			
			System.out.println("Digite o seu nome [2]:  ");
			nome = input.next();
			System.out.println("Digite o seu saldo [2]:  ");
			saldo = input.nextDouble();
			ContaBancaria c2 = new ContaBancaria(nome,saldo,txJuros);
			c2.CorrigeSaldo();
			System.out.println(c1);
			System.out.println(c2);
		}
				
		
	}
}
