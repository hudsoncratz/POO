import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class UsoC {
  	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Insira uma frase:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
  			
  			List<String> s = new ArrayList<String>();
  			
  			for(i=0;i<(vet.length);i++){
        		s.add(new String(vet[i]));
        	}
  			
  			 Collections.shuffle(s);
 
        	// exibe o conteúdo de cada coleção com o toString nativo:
  			 
  			 System.out.println("Conjunto: " + s);
        	
  	}
}
