import java.util.*;

class EP7_2.2_22 {
    public static int[] inverterValores(int[] vetor){

            int tamanho = 0; 
           
            tamanho = vetor[i];
            vetor[j] = tamanho;
            return vetor;             
            
        }
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int  f, vetor, i, j; 

		if((j >= 0) && (i > v)){
			System.out.println("Digite o valor de j: ");
			j = entrada.nextInt();

		} else {

			System.out.println(" valor inválido, digite o valor de i: ");
			i = entrada.nextInt();

			System.out.println("Digite o valor de j: ");
			j = entrada.nextInt();
		}

		if(i <= v){
			System.out.println("Digite o valor de i: ");
			i = entrada.nextInt();
		}else {

			System.out.println(" valor inválido, digite o valor de i: ");
			i = entrada.nextInt();
		}

		System.out.println("Digite a quantidade de posicoes do vetor: ");
		vetor = entrada.nextInt();
		int[] v = new int[vetor];

		for(int k = 0; k < v.length; k++){
			System.out.println("digite o valor da posicao: " + k);
			v[k] = entrada.nextInt();
		}
                
                v = EP7_2.inverterValores(v);
                
		for(int l = 0; l < v.length; l++){
                    System.out.print(v[l] + " ");
        }
	}
}