import java.util.Scanner;

public class Uso {
	public static void main(String[] args) {
		int menu, QTDE =100, i;
		double c1,c2, comprimento, espessura, largura, raio;
		boolean solido;
		Scanner input = new Scanner(System.in);
		
		while(QTDE>50) {
			System.out.println("Digite a quantidade de figuras geometricas qur deseja inserir");
			QTDE = input.nextInt();
		}
		Circulo vet1[] = new Circulo[QTDE];
		Quadrado vet2[] = new Quadrado[QTDE];
		
		for(i=0; i< QTDE; i++) {
			System.out.println("(1)Quadrado, (2)Retangulo, (Obrigatrio)Circulo: ");
			menu = input.nextInt();
			try {
				if(menu == 1) {
					System.out.println("Digite a coodenada x:");
					c1 = input.nextDouble();
					Coordenada x = new Coordenada(c1);
					System.out.println("Digite a coodenada y:");
					c2 = input.nextDouble();
					Coordenada y = new Coordenada(c2);
					Ponto p = new Ponto(x,y);
					System.out.println("Digite o comprimento:");
					comprimento = input.nextDouble();
					System.out.println("Digite a espessura:");
					espessura = input.nextDouble();
					System.out.println("Digite se é solido (true/false):");
					solido = input.nextBoolean();
					vet2[i] = new Quadrado(p, comprimento, espessura, solido);
				}
				if(menu == 2) {
					System.out.println("Digite a coodenada x:");
					c1 = input.nextDouble();
					Coordenada x = new Coordenada(c1);
					System.out.println("Digite a coodenada y:");
					c2 = input.nextDouble();
					Coordenada y = new Coordenada(c2);
					Ponto p = new Ponto(x,y);
					System.out.println("Digite o comprimento:");
					comprimento = input.nextDouble();
					System.out.println("Digite o largura:");
					largura = input.nextDouble();
					System.out.println("Digite a espessura:");
					espessura = input.nextDouble();
					System.out.println("Digite se é solido (true/false):");
					solido = input.nextBoolean();
					vet2[i] = new Retangulo(p, comprimento, largura, espessura, solido);
				}
				
					System.out.println("Digite a coodenada x:");
					c1 = input.nextDouble();
					Coordenada x = new Coordenada(c1);
					System.out.println("Digite a coodenada y:");
					c2 = input.nextDouble();
					Coordenada y = new Coordenada(c2);
					Ponto p = new Ponto(x,y);
					System.out.println("Digite o raio:");
					raio = input.nextDouble();
					System.out.println("Digite a espessura:");
					espessura = input.nextDouble();
					System.out.println("Digite se é solido (true/false):");
					solido = input.nextBoolean();
					vet1[i] = new Circulo(p, raio, espessura, solido);
				
			}
			catch(Exception e){
				System.out.println(e);
				i--;
				continue;
			}
		}
		for(i=0;i<QTDE;i++) {
			System.out.println("\n" + vet2[i]);
			System.out.println("\nArea:" + vet2[i].calculaArea());
			System.out.println("\nPerimetro" + vet2[i].calculaPerimetro());
			
		}
		for(i=0;i<QTDE;i++) {
			System.out.println("\n" + vet1[i]);
			System.out.println("\nArea:" + vet1[i].calculaArea());
			System.out.println("\nPerimetro:" + vet1[i].calculaPerimetro());
			
			
		}
		
	}
}
