import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import java.util.Random;
public class UsoD {
  	public static void main(String[] args) {
  			
  			int i;
  			int []vet = new int[20];
  			Random gerador = new Random();
  			Map<Integer,Integer> m = new HashMap<Integer,Integer>();
  			Set<Integer> n = new TreeSet<Integer>();
  			
  			for(i=0;i<(vet.length);i++){
  				vet[i] = gerador.nextInt(51);
  				if(m.containsKey(vet[i])) {
  					i--;
  				}
  				m.put(vet[i], 1);
  				n.add(new Integer(vet[i]));
        	}
  		
  			 
 
 			System.out.println("Conjunto: " +n);
  			
  	}
}
