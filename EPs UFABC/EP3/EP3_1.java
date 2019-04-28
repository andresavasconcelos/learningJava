// seleção com módulo


// codeEx3.2  - livro texto


// Faça um programa que leia (peça para o usuário digitar) três números inteiros quaisquer, armazenando nas variáveis A, B e C e imprima os números em ordem do menor para o maior.

import java.util.Scanner;
class EP3_1
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            double a, b, c; 
         
            System.out.println("insira valor de A");
                a = teclado.nextDouble();
            System.out.println("insira o valor de B");
                b = teclado.nextDouble();
            System.out.println("insira o valor de C");
              c = teclado.nextDouble();
                        
            System.out.println(c + b + a );
     }
}

