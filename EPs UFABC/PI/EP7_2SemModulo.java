import java.util.*;

class EP7_2SemModulo {
    
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int  f, vetor, i, j, aux = 0; 

		
		//System.out.println("Digite a quantidade de posicoes do vetor: ");
		vetor = entrada.nextInt();
		int[] v = new int[vetor];

		//System.out.println("Digite o valor de j: ");
		j = entrada.nextInt();

		if((j < 0)){
			//System.out.println(" valor inválido, digite o valor de i: ");
			j = entrada.nextInt();
		} 

	//	System.out.println("Digite o valor de i: ");
		i = entrada.nextInt();

		if(i > vetor){
			//System.out.println(" valor inválido, digite o valor de i: ");
			i = entrada.nextInt();
		}

		for(int k = 0; k < v.length; k++){
		//	System.out.println("digite o valor da posicao: " + k);
			v[k] = entrada.nextInt();
		}

		aux = v[j];
		v[j] = v[i];
		v[i] = aux;
                
		for(int l = 0; l < v.length; l++){
                    System.out.print(v[l] + " ");
        }
	}
}