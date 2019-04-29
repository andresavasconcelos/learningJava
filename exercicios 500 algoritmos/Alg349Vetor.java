import java.util.Scanner;
public class Alg349Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] soma = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("digite o valor do vetor 1");
			vetor1[i] = entrada.nextInt();	
			
			System.out.println("digite o valor do vetor 2");
			vetor2[i] = entrada.nextInt();	
			
			soma[i] = vetor1[i] + vetor2[i];
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println("valor vetor1: " + vetor1[j] + " | " + "valor vetor2:" + " " + vetor2[j] + " | " +  "soma:" + " " + soma[j] );
		}
 	}

}
