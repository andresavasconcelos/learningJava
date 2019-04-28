
//  livro texto
// Criar um vetor v1 de inteiros com n elementos com valores de 0 até 9. Criar uma função para retornar um outro vetor v2, onde os elementos recebam a quantidade de ocorrências dos valores de 0 a 9, armazenando nas posições 0 a 9 de v2.



// Exemplo:

// Entradas: 6

// 3 1 9 9 3 9

// Saída:

// 0 1 0 2 0 0 0 0 0 3
import java.util.*;
class EP7_1 {
  public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         int  vetor, cont=1, num=0, repetidos ;
         int[] contador = new int[10];
        
         //System.out.println("digite a quantidade de componentes que seja entre 0 e 9: ");
         vetor = entrada.nextInt();
         int[] v = new int[vetor];

         if((vetor < 0) || ( vetor > 10)){
           //System.out.println("Ops! digite a quantidade de componentes que seja entre 0 e 9: ");
         vetor = entrada.nextInt();
         }

         for(int j = 0; j < v.length; j++){
           //System.out.println("digite o valor da posicao: " + j);
           v[j] = entrada.nextInt();
         }

         for(int k = 0; k < v.length; k++){
              contador[v[k]] += 1;
         }

         for(int l = 0; l < contador.length; l++){
              if(l != l){
                l = 0;
              }
          System.out.print(contador[l] +  " ");
         }
  }
}