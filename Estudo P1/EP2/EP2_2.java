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