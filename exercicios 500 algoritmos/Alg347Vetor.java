import java.util.*;

public class Alg347Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String[] nomes = new String  [10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o primeiro nome da posi��o " + (i+1) + " : ");
			nomes[i] = entrada.next();
		}
		
		for(int j = 0; j < nomes.length; j++) {
			System.out.println("Os nome da posi��o" + " " + (j+1) + "" + nomes[j]);
		}
	}

}
