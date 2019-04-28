// Aula: 11.03 - EP3 - seleção com módulo


// Uma empresa decide dar um aumento aos seus funcionários de acordo com uma tabela que considera o salário atual e o tempo de serviço de cada funcionário. Os funcionários com menor salário terão um aumento proporcionalmente maior do que os funcionários com um salário maior, e conforme o tempo de serviço na empresa, cada funcionário irá receber um bônus adicional de salário. Faça um programa que leia:
// • o valor do salário atual do funcionário;
// • o tempo de serviço desse funcionário na empresa (número de anos de trabalho na empresa). 
// Use as tabelas em 11.03 - EP3 para calcular o salário reajustado deste funcionário e imprima
// escreva ("valor do salario final =" , salarioFinal) ou
// escreva ("bonus =").

import java.util.Scanner;
class EP3_3
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            float  salario_final, tempo_trabalho; 

          System.out.println("");
               salario_final = teclado.nextFloat();
            System.out.println("");
                tempo_trabalho = teclado.nextFloat();

          
          if (salario_final < 500) // salario - reajuste
          {
              System.out.println("valor do salario final = " + salario_final * 1.25);
              //System.out.println(salario_final * 1.25); //100% do salario + 25% do reajuste
          } else if(salario_final < 1000)
          {
              System.out.println("valor do salario final = " + salario_final * 1.20);
              //System.out.println(salario_final * 1.20);
          } else if(salario_final < 1500)
          {
            System.out.println("valor do salario final = " + salario_final * 1.15);
           // System.out.println(salario_final * 1.15);
          } else if(salario_final < 2000)
          {
              System.out.println("valor do salario final = " + salario_final * 1.10);
              //System.out.println(salario_final * 1.10);
          } else if(salario_final >= 2000)
          {
              System.out.println("valor do salario final = 2000.0 ");
              //System.out.println(salario_final * 1);
          }

          if (tempo_trabalho < 1) // bonus e tempo de trabalho
          {
             System.out.println("bonus = 0.0");   
          } else if ((tempo_trabalho >=1) && (tempo_trabalho <=3))
          {
            System.out.println("bonus = 100.0.0");
          }else if ((tempo_trabalho >=4) && (tempo_trabalho <=6))
          {
            System.out.println("bonus= 200.0");
          }else if ((tempo_trabalho >=7) && (tempo_trabalho <=10))
          {
            System.out.println("bonus= 300.0");
          }else if (tempo_trabalho >10)
          {
            System.out.println("bonus= 500.o");
          }
     }
}