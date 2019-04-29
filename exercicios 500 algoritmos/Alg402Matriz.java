import java.util.*;
public class Alg402Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] num = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j =0; j < 3; j++) {
			System.out.println("Digite o numero da linha: " + (i+1) + " coluna " + (j+1));	
			num[i][j]= entrada.nextInt();
			}
		}		
		
//		for(int i = 0; i < 3; i++){
//			System.out.print( num[i][i] + " ");	
//			for(int j =0; j < i; j++) {
//				System.out.print(" ");	
//			}
//			System.out.println();
//		}
		int soma =0;
		for(int i = 0; i < 3; i++){	
			for(int j = i+1; j < 3; j++) {
				soma+= num[i][j];
			}
			System.out.println(soma);
		}
	}

}
