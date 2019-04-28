// livro texto

// Criar uma matriz de inteiros para armazenar L linhas e C colunas. Calcular a soma dos 

// elementos acima da diagonal da matriz.

// Entradas: 2 3 

// 6 9 6

// 7 8 9

// Saída: 

// 24

import java.util.*;

public class EP8_2 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int linha, coluna;

      //System.out.println("Digite a quantidade de linha:");
      linha = entrada.nextInt();

      //System.out.println("Digite a quantidade de notas por coluna:");
      coluna = entrada.nextInt();
    
      int[][] matriz = new int[linha][coluna];
     
      for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
         // System.out.println("digite o linha " +(i+1) + " " + "digite a coluna " + (j+1));
          matriz[i][j] = entrada.nextInt();                  
        }
      }

    int soma=0;      
      for (int i=0; i < matriz.length;i++){
        for(int j=0; j < matriz[i].length;j++){
          if(i<j){
            soma += matriz[i][j];
          }
        }
      } 
     System.out.print(soma);
    //  return soma;

    // for(int i = 0; i < matriz.length; i++){
    //   for(int j = 0; j < matriz[i].length; j++){
    //     System.out.print(matriz[i][j] + " ");                
    //   }
    //   System.out.println();                     
    // }

  }
}

import java.util.*;

public class Main {

    public static int[][] Ordenar(int[][] matriz){
      int soma=0;      
      for (int i=0; i < matriz.length;i++){
        for(int j=0; j < matriz.length;j++){
          if(i>j){
            soma += matriz[i][j];
          }
        }
        System.out.print(soma);
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

    matriz = Main.Ordenar(matriz);

    // for(int i = 0; i < matriz.length; i++){
    //   for(int j = 0; j < matriz[i].length; j++){
    //     System.out.print(matriz[i][j] + " ");                
    //   }
    //   System.out.println();                     
    // }

  }
}
 
