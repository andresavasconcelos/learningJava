import java.util.*;
public class Alg355Vetor {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 int[] num = new int[8];
		 int cont =0;
		 
		 for(int i = 0; i < 8; i++) {
			 System.out.println("Digite o " + (i+1) + " numero");
			 num[i]= entrada.nextInt();
			 
			 if(num[i] % 6 == 0) {
				 cont++; // contando a quantida de de numeros divis�veis por 6
			 }
			 //System.out.println("rela��o dos numeros " + (i+1));
		 }
		 
		 for(int j = 0; j < num.length; j++) {
			 System.out.println("rela��o de numeros: " + num[j]);
		 }
		 
		 System.out.println("quantidade de multiplos " + cont);
	}

}
