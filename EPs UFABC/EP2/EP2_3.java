
// Problema: 
// Crie um programa com 3 variáveis de um retângulo para base, altura e área. Como entrada, o programa deve ler dois valores inteiros: base e altura. No final da execução o programa deve:

// escrever ("area="+area)
// escrever ("base="+base)
// escrever ("altura="+altura)


// Sugestão: Crie no mesmo programa métodos para calcular cada um dos 3 valores a partir dos outros 2: calcula_base(), calcula_altura() e calcula_area(). Considere neste caso 3 variáveis globais para base, altura e área.


// Entrada/Dados: Ler dois valores inteiros: base e altura
// Processamento: Lógica para os cálculos
// Saída/Informação: 

import java.util.Scanner;
class EP2_3
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            double base, altura, area; 
         
            System.out.println("Insira o valor da base");
                base = teclado.nextDouble();
            System.out.println("insira o valor da altura");
                altura = teclado.nextDouble();
            area = base * altura;
            
            System.out.println("area= " + area );
            System.out.println("base= " + base);
             System.out.println("altura= " + altura);    
     }
}

