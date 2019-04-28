
// matriz com módulo


// codeEx6.1 - livro texto


// Criar uma matriz para armazenar as C notas de uma turma e calcular a média de cada aluno, considerando uma turma com L alunos. LxC também dever ser fornecidas em tempo de execução. A média deve ser armazenada na coluna C+1 da matriz. Veja exemplo:

// Entradas: 2 3

// 6 9 6

// 7 8 9

// Saída:

// 6 9 6 7

// 7 8 9 8
import java.util.*;

public class EP8_1My {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int linha, coluna;

      System.out.println("Digite a quantidade de alunos:");
      linha = entrada.nextInt();

      System.out.println("Digite a quantidade de notas por aluno:");
      coluna = entrada.nextInt();
    
      int[][] matriz = new int[linha][coluna];
     

      // int soma = 0, media = 0, cont = 0;
      for(int i = 0; i < matriz.length; i++){
      	for(int j = 0; j < matriz[i].length; j++){
      		System.out.println("digite o aluno " + (i+1) + " " + "digite a nota " + (j+1));
      		matriz[i][j] = entrada.nextInt();      		   	
      	}
      }

      // int soma = 0, media = 0, cont = 0;
      // for(int i = 0; i < matriz.length; i++){
      // 	for(int j = 0; j < matriz[i].length; j++){
      // 		System.out.print(matriz[i][j] + " ");   		   	
      // 	}
      // 	System.out.println();   		   	
      // }

      	
      	int[][] media = new int[linha][coluna+1]; 
      	int soma1, contador;     	
	  	for (int i=0 ; i < media.length ; i++){  
	  		 soma1 =0 ; contador =0;	  
			for (int j=0 ;j< media[i].length-1 ; j++)
			{
				  media[i][j] = matriz[i][j];
				  soma1 += media[i][j];
				  contador += 1;
				  media[i][j+1]=( soma1 /contador);
			}
		}


      for(int i = 0; i < media.length; i++){
      	for(int j = 0; j < media[i].length; j++){
      		System.out.print(media[i][j] + ".0" +);   		   	
      	}
      	System.out.println();   		   	
      }

    }   

}
 