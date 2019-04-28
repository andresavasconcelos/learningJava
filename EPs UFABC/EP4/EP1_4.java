//  repetição com módulo


// Faça um programa para ler um número inteiro positivo n e escrever os n>0 primeiros múltiplos de 3.

import java.util.*;
class EP4_1 {
 public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira um nuemro inteiro: ");
    int num = entrada.nextInt(), i;
    for(i=1; i<=num;i++){
          System.out.println(i*3);
      }
   }  
}

