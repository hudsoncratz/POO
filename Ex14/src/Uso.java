import java.util.Scanner;

public class Uso {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int QTDE=100, i, menu, celular;
		String nome, email, endereco;
		double renda;
		
		while(QTDE>50) {
			System.out.println("Digite a quantidade de pessoas que deseja inserir");
			QTDE = input.nextInt();
		}
			Contato vetor[] = new Contato[QTDE];
		for(i=0;i<QTDE;i++) {
			System.out.println("(1) Contato (2) Cliente  ");
			menu = input.nextInt();
			try {
				if(menu ==1) {
					System.out.println("Digite o seu nome:  ");
					nome = input.next();
					System.out.println("Digite o seu email:  ");
					email = input.next();
					vetor[i] = new Contato(nome, email);
				}
				if(menu ==2) {
					System.out.println("Digite o seu nome:  ");
					nome = input.next();
					System.out.println("Digite o seu email:  ");
					email = input.next();
					System.out.println("Digite o seu celular:  ");
					celular = input.nextInt();
					System.out.println("Digite o seu endereço:  ");
					endereco = input.next();
					System.out.println("Digite a sua renda:  ");
					renda = input.nextDouble();
					
					vetor[i] = new Cliente(nome, email, celular, endereco, renda);
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		
		for(i=0; i < QTDE; i++) {
			System.out.println("\n" + vetor[i].toString());
			
		}
	}
	
	
}
