import java.util.*;
//Ler uma matriz de 3x3 e apresentar todos os e elementos da linha 2
public class  Ex1 {
    public static void main(String[] args){
    		Scanner entrada = new Scanner(System.in);
        
    		int[][] numeros = new int[3][3];
        
        for(int i=0; i < numeros.length; i++){ // linha
          for(int j=0; j < numeros[i].length; j++){ // coluna
              System.out.println(" linha: " + i + " coluna " + j );
              numeros[i][j] = entrada.nextInt();
          }
        }

        for(int j = 0; j < numeros[2].length; j++){
          System.out.print(" " + numeros[2][j] + " ");
        }

        
    }
}