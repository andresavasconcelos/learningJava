// Escreva um programa para calcular o valor de delta (ou discriminante) de uma equação do 2o grau (ax2 + bx + c). Para isso, faça a leitura de a, b e c, ou seja, 3 inteiros, calcule o delta e mostre a mensagem: 


// "O delta de ax*x + bx + c e " + delta 


// Lembre-se que delta = b*b – 4ac.

// Sugestão: pode-se criar uma função (módulo) para calcular o valor de delta. A função deve receber como entrada os valores de a, b e c (três inteiros) e retornar o valor do delta calculado (um inteiro).

// Entrada/Dados: Ler 3 inteiros a, b e c
// Processamento: Lógica para calcular o delta
// Saída/Informação: escrever ("O delta de ax*x + bx + c é " + delta)

import java.util.*;
class EP2_1 {

	public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, delta;
    
          a = entrada.nextInt();     
          b = entrada.nextInt();  
          c = entrada.nextInt(); 
          delta = (b*b) - (4*a*c);
        
        System.out.println("O delta de ax*x + bx + c e " + delta);
          
     }
}