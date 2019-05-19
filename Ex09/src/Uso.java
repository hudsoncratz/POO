import java.util.Scanner;
import java.util.Random;

public class Uso {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		
		int i=0, QTDE=200;
		double x, y;
		
		Ponto vet[] = new Ponto[QTDE];
		Ponto p;
		
		Random gerador = new Random();
		
		while(QTDE>100) {
			System.out.println("Digite a quantidade de pontos qur deseja inserir");
			QTDE = input.nextInt();
		}
		 
		System.out.println("Digite a coordenada x: ");
		x = input.nextDouble();
		System.out.println("Digite a coordenada y: ");
		y = input.nextDouble();
		p = new Ponto(x,y);
		for(i=0; i<QTDE; i++) {
			vet[i] = new Ponto(gerador.nextInt(500), gerador.nextInt(500));
		}

		for(i=0; i<QTDE; i++) {
			System.out.println("\n" + vet[i]);
			System.out.println(p.distancia(vet[i]));
			
		}
	}
}
