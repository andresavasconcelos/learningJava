import java.util.*;
public class Alg350Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nomes[] = new String[5];
		String aux = " " ;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome: " + (i+1));
			nomes[i] = entrada.nextLine();
		}
		
		for(int l = 0; l <= 5; l++) {
			for(int c = l+1; c < 5; c++) { 
				if (nomes[l] > nomes[c] ) {
					aux      = nomes[l];
					nomes[l] = nomes[c];
					nomes[c] = aux;
				}
			}
		}
			
		for(int l = 0; l < 5; l++) {
			System.out.println(l+1 + " " + nomes[l]);
		}	
		
	
	}

}
