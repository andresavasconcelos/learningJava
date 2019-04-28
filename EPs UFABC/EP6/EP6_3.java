// vetor com módulo - parte 1


// codeEx5.8  - livro texto

// Criar um vetor de entrada v1 com n posições com valores inteiros positivos e como saída criar um outro vetor também com n posições, onde a cada posição i (entre 1 e n-2) seja atribuído o cálculo do MÁXIMO do seu vizinho de v1 à esquerda i-1, do próprio elemento i e do seu vizinho à direita i+1.

// Exemplo:

// Entradas: 5

// 1 2 3 4 5

// Saídas:

// 0 3 4 5 0

import java.util.*;
class EP6_3 {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     int  vetor, somaAluno = 0 ;
     double media, soma = 0 ;
     System.out.println("digite a quantidade de componentes: ");
     vetor = entrada.nextInt();
     int[] numeros = new int[vetor];
     String[] saida = new String[vetor];

     for(int i = 0; i < vetor; i++){
        System.out.println("Digite o nome do numero inteiro " + i+1);
        numeros[i] = entrada.next();
     }

     for(int j = 0; j < vetor; j++)
        if(j==0 || j==(n-1)){
            saida[j]=0;
            System.out,println(saida[j]);
        }
        else
            if((j==1 || j==2) || ( i == 3))
                saida[j]= j + 2
            System.out,println(saida[j]);
     }
    
    }
}