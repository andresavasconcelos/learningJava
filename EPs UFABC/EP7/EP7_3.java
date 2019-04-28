// vetor com módulo - parte 2

// codeEx5.6  - livro texto


// Criar um vetor de inteiros com n elementos e ordenar os seus valores em ordem crescente.


// Exemplo:

// Entradas: 5

// 1 2 3 4 5

// Saídas:

// 0 3 4 5 0

import java.util.*;

class EP7_3Novo {
    public static int[] ordenarValores(int[] vetor){

            int aux = 0; 

            for (int i = 0; i < vetor.length; i++){
            	for (int j= i+1; j < vetor.length; j++){
					if (vetor[i] > vetor[j])
						{	
							aux = vetor[i];
							vetor[i] = vetor[j];
							vetor[j] = aux;
																
						}
																
				}
            }
          
            return vetor;             
            
        }
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int   vetor; 

		//System.out.println("Digite a quantidade de posicoes do vetor: ");
		vetor = entrada.nextInt();
		int[] v = new int[vetor];

		for(int k = 0; k < v.length; k++){
			//System.out.println("digite o valor da posicao: " + k);
			v[k] = entrada.nextInt();
		}
                
                v = EP7_3Novo.ordenarValores(v);
                
		for(int l = 0; l < v.length; l++){
                    System.out.print(v[l] + " ");
        }
	}
}