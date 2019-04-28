import java.util.*;

public class EP8_2My {

    public static int[][] Ordenar(int[][]){
       int[][] ordem = new int[linha][coluna];            
        for (int i=0; i < ordem.length;i++){
      int aux =0 ;
      for(int j=0 ; j < (ordem[i].length);j++){             
        for(int l=0 ; l < ordem.length;l++){                                  
          for (int k=l+1;(k<ordem.length+1);k++){
            if (ordem[i][l]>ordem [i][k]){      
              aux = ordem[i][l];
              ordem[i][l] = ordem[i][k];
              ordem[i][k] = aux;
            }        
          }
        }
      }
    }  
    }

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int linha, coluna;

      System.out.println("Digite a quantidade de linha:");
      linha = entrada.nextInt();

      System.out.println("Digite a quantidade de notas por coluna:");
      coluna = entrada.nextInt();
    
      int[][] matriz = new int[linha][coluna];
     

      // int soma = 0, media = 0, cont = 0;
      for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                  System.out.println("digite o linha " + (i+1) + " " + "digite a coluna " + (j+1));
                  matriz[i][j] = entrada.nextInt();                     
            }
      }

      ordenar = Main.Ordenar(matriz, i, j);
            
     

    
    for(int i = 0; i < ordem.length; i++){
      for(int j = 0; j < ordem[i].length; j++){
        System.out.print(ordem[i][j] + " ");                
      }
      System.out.println();                     
    }

  }
}
 