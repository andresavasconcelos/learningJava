// 1
// Tipo de trabalho: Trabalho individual
// Aula: 22.04 - EP8 - matriz com módulo


// Criar uma matriz de inteiros para armazenar L linhas e C colunas. 

// Criar um método para ordenada cada linha em ordem crescente, veja exemplo:



// Entradas: 2 3

// 6 7 6

// 7 9 8

// Saída: 

// 6 6 7

// 7 8 9

import java.util.*;

public class EP8_3 {

    public static int[][] Ordenar(int[][] matriz)
    {
                  
        for (int i=0; i < matriz.length;i++)
        {
              int aux =0 ;
              for(int j=0 ; j < (matriz[i].length);j++){        
               for(int l=0 ; l < matriz.length;l++){            
                for (int k=l+1;(k<matriz.length+1);k++){
                    if (matriz[i][l]>matriz [i][k]){      
                      aux = matriz[i][l];
                      matriz[i][l] = matriz[i][k];
                      matriz[i][k] = aux;
                    }        
            }
          }
        }
      } 
        return matriz; 
    }

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int linha, coluna;

      System.out.println("Digite a quantidade de linha:");
      linha = entrada.nextInt();

      System.out.println("Digite a quantidade de notas por coluna:");
      coluna = entrada.nextInt();
    
      int[][] matriz = new int[linha][coluna];
     
      for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                  System.out.println("digite o linha " + (i+1) + " " + "digite a coluna " + (j+1));
                  matriz[i][j] = entrada.nextInt();                     
            }
      }

    matriz = EP8_3.Ordenar(matriz);

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j] + " ");                
      }
      System.out.println();                     
    }

  }
}
 