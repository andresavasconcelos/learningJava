// Problema: 


// Escreva um programa para ler 4 variáveis inteiras X1, Y1, X2, e Y2. O programa deve calcular a distância entre os pontos (X1,Y1) e (X2,Y2) do plano cartesiano. No final da execução o programa deve escrever ("distancia entre os pontos="+distancia). 
// Nota: utilizar 3 casas decimais, veja exemplo:

// Entradas:1 2 3 4                                                       
// Saída: distancia entre os pontos=2.828

// Sugestão: pode-se criar uma função (módulo) para calcular a distância entre dois pontos. A função deve receber como entrada as coordenadas dos dois pontos e retornar o valor da distância calculada.

// Entrada/Dados: Ler 4 valores reais X1,Y1,X2,Y2
// Processamento: Lógica para calcular a distância
// Saída/Informação: escrever ("distancia entre os pontos="+d)

import java.util.Scanner;
import static java.lang.Math.*;
public class EP2_2
{
  public static void main(String arg[])
  {
    double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
    double valorA, valorB;
    double distancia = 0;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    //Scanner processador = new Scanner(System.in);
    System.out.println("Digite o valor de X1 : ");
    x1 = scanner.nextDouble();
    System.out.println("Digite o valor de y1: ");
    y1 = scanner.nextDouble();
    System.out.println("Digite o valor de x2: ");
    x2 = scanner.nextDouble();
    System.out.println("Digite o valor de y2: ");
    y2 = scanner.nextDouble();

    valorA = Math.pow(x2 - x1, 2);
    valorB = Math.pow(y2 - y1, 2);
    distancia = Math.sqrt(valorA + valorB);
    System.out.printf("distancia entre os pontos= %.3f", distancia);
   
  }
}