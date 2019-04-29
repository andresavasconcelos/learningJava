import java.util.*;
public class Alg348Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[5];
		Double[] notas1 = new Double[5];
		Double[] notas2 = new Double[5];
		Double[] media = new Double[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do aluno da posição " + (i+1));
			nomes[i] = entrada.next();	
			
			System.out.println("Digite a primeira nota do aluno " + nomes[i] + ":");
			notas1[i] = entrada.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno " + nomes[i]  + ":");
			notas2[i] = entrada.nextDouble();
			
			media[i] = (notas1[i] + notas2[i])/2;
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println(" aluno: " + nomes[j] + " " + "primeira nota" + notas1[j] + " " +  "segunda nota" + " " + notas2[j] + " media " +" " + media[j]);
		}
 	}

}
