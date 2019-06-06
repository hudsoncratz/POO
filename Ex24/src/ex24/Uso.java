package ex24;

import java.io.IOException;
import java.util.Scanner;

public class Uso {
	public static void main(String[] args) throws Exception {

		System.out.println("Quantos numeros no sorteio: ");
		int qtd = new Scanner(System.in).nextInt();
		
		ConjuntoSorteio conjunto1 = new ConjuntoSorteio(qtd);

		conjunto1.toString();
		
		/*
		try {
			
			// gravar sorteios no arquivo
			Arquivo.grava("conjunto1.my", conjunto1);
			// gravar sorteios no arquivo .txt
			Arquivo.gravaTxt(conjunto1);
			
			// ler sorteios do arquivo
			System.out.println(Arquivo.le("conjunto1.my").toString());

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
	}

}
