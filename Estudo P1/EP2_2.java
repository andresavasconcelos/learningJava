package aulasPi;
import java.util.Scanner;
import static java.lang.Math.*;
public class EP2_2
{
  public static void main(String arg[])
  {
    double x1, y1, x2, y2;
    double valorA, valorB;
    double distancia;
    //java.util.Scanner scanner = new java.util.Scanner()System.in);
    Scanner processador = new Scanner(System.in);
    System.out.println("Digite o valor de X1 : ");
    x1 = processador.nextDouble();
    System.out.println("Digite o valor de y1: ");
    y1 = processador.nextDouble();
    System.out.println("Digite o valor de x2: ");
    x2 = processador.nextDouble();
    System.out.println("Digite o valor de y2: ");
    y2 = processador.nextDouble();

    valorA = Math.pow(x2 - x1, 2);
    valorB = Math.pow(y2 - y1, 2);
    distancia = Math.sqrt(valorA + valorB);
    System.out.println("distancia entre dois pontos==  " + distancia);
   
  }
}