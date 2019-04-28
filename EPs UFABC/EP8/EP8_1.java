
package ep8_1;

import java.util.Scanner;
public class EP8_1 {

static Scanner entrada = new Scanner (System.in);    
    public static void main(String[] args) {
    int l, c;
    System.out.println("Alunos");
    l=entrada.nextInt();
    System.out.println("Notas");
    c=entrada.nextInt();
    int m [][];
    m=lmatriz(l,c);
    imprimim(m);
    
      
    }
public static int [][] lmatriz(int l, int c){
    int m[][]=new int [l][c+1];
    int i, soma=0, z=0;
    for(i=0;i<m.length;i++){
        soma=0;
        z=0;
        int j;
        for(j=0;j<m[0].length-1;j++){
            System.out.print(i+j);
            m[i][j]=entrada.nextInt();
        soma = soma + m[i][j];
        z++;
        m[i][j+1]=soma/z;
        }
    }
    return m;
}

/*public static int media(int m[][]){
    int i,z=0,media=0;
    for(i=0;i<m.length;i++){
        int j;
        for(j=0;j<=m[0].length;j++){
            
        }
    }
    
}*/
public static void imprimim(int m [][]){
    for (int i = 0; i < m.length; i++) { // linhas i
for (int j = 0; j < m[0].length; j++) { // colunas j
System.out.print(m[i][j] + " ");
}
System.out.println();
}
}
}



    

