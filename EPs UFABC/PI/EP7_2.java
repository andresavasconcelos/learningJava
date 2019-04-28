import java.util.*;

class EP7_2 {
    public static int[] inverterValores(int[] vetor){
            int posInicio = 0;
            int posFim = vetor.length - 1;
            
            vetor[posInicio] += vetor[posFim];
            vetor[posFim] = vetor[posInicio] - vetor[posFim];
            vetor[posInicio] -= vetor[posFim];  
            return vetor;   
            
        }
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int  f, vetor; 


		System.out.println("Digite a quantidade de posicoes do vetor: ");
		vetor = entrada.nextInt();
		int[] v = new int[vetor];

		for(int i = 0; i < v.length; i++){
			System.out.println("digite o valor da posicao: " + i);
			v[i] = entrada.nextInt();
		}
                
                v = EP7_2.inverterValores(v);
                
		for(int j = 0; j < v.length; j++){
                    System.out.print(v[j] + " ");
        }
	}
}