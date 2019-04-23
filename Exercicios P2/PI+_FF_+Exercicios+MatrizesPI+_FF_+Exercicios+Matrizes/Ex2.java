import java.util.*;
//Ler duas matrizes A e B 5x3. Construir uma matriz C de mesma dimensão, sendo que C é formada pela soma dos elementos da matriz A com os elementos da matriz B. Apresentar os elementos da matriz C.
public class  Ex2 {
    public static void main(String[] args){
    		Scanner entrada = new Scanner(System.in);
         
    		int[][] a = new int[5][3]; // linha * coluna
        int[][] b = new int[5][3];
        int[][] c = new int[5][3];
        
        for(int i=0; i < a.length; i++){ // linha
          for(int j=0; j < a[i].length; j++){ // coluna
              System.out.println(" linhaA: " + i + " colunaA " + j );
              a[i][j] = entrada.nextInt();
          }
        }

        for(int i=0; i < b.length; i++){ // linha
          for(int j=0; j < b[i].length; j++){ // coluna
              System.out.println(" linhaB: " + i + " colunaB " + j );
              b[i][j] = entrada.nextInt();
          }
        }

        System.out.println("a matriz de C é: ");
        for(int i=0; i < 5; i++){ // linha
          for(int j=0; j < 3; j++){ // coluna
              c[i][j] = a[i][j] + b[i][j];
              System.out.print(" " + c[i][j] + " ");
          }         
          System.out.println();
        }        
    }
}