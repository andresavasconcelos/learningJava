import java.util.*;
public class EP7_2Metodo
{
		 public static int[] inverterValores(int[] vetor, int i, int j){
            int aux;
            aux = vetor[j];
			      vetor[j] = vetor[i];
			      vetor[i] = aux;  
            return vetor;   
       }
        
		public static void main (String[] args)
		{
			Scanner scan = new Scanner(System .in);
			int j , i, aux= 0, n;
			System.out.println("digite o tamanho do vetor ");
			n = scan.nextInt();
			int[] vetor = new int[n];
			
			System.out.println("digite o valor de i: ");
			i = scan.nextInt();
			if(i < 0){
				System.out.println("Error! digite o valor de i novamente: ");
				i = scan.nextInt();
			} // declarando i
			
			System.out.println("digite o valor de j: ");
			j = scan.nextInt();
			
			if(j > n){
				System.out.println("Error! digite o valor de j novamente: ");
				j = scan.nextInt();
			} // declarando j
		
			for(int k = 0; k < vetor.length; k++ ){
				System.out.println("digite o valor da posição: " + k);
				vetor[k] = scan.nextInt();
			}
			
			vetor = Main.inverterValores(vetor, i , j);
			
			// aux = vetor[i];
			// vetor[i] = vetor[j];
			// vetor[j] = aux; 
			
			for(int m = 0; m < vetor.length; m++){
				System.out.print(vetor[m] + " ");
			 }
		}
				
												
												
									
													
													
								  
            
            
}
							
