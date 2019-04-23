
package ep8_2;

import java.util.Scanner;
public class EP8_2 {

static Scanner entrada = new Scanner (System.in);   
    public static void main(String[] args) {
    int n, n1;
    //System.out.print("Para uma matriz ter digonais ela precisa ser guadratica");
    System.out.print("Digite o valor de linhas = colunas");
    n=entrada.nextInt();
    n1=n;
    int m[][];
    m =lerMatriz(n,n1);
    maiorqdiagonal(m);
    
    }
public static int [][] lerMatriz(int n, int n1){
    int m[][]=new int [n][n];
    int i;
    for(i=0;i<m.length;i++){       
        int j;
        for(j=0;j<m[0].length;j++){
            System.out.print("linha: "+ i + " coluna: "+ j);
            m[i][j]=entrada.nextInt();    
        }
    }
    return m;
} 
public static void maiorqdiagonal(int m [][]){
    
        int i, soma=0;
        for(i=0;i<m.length;i++){       
        int j;
        for(j=0;j<m[0].length;j++){
        if(j>i){
            soma=soma+m[i][j];
        }     
        }
    }
        System.out.print(soma);
}

}
