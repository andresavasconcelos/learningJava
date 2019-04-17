import java.util.*;
class EP1_3
{
	public static void main(String args[])
  {
    Scanner teclado= new Scanner(System.in);
        int a, b; //double é quando são numero reais e int é para numeros inteiros

    //System.out.println("Digite o valor de A:");
    a = teclado.nextInt(); //caso fosse um numero inteiro seria nextInt, sempre começando com a letra maiuscula

    //System.out.println("Digite o valor B:");
    b = teclado.nextInt();

    System.out.println("A =" + b + " e B =" + a);
  }
}

import java.util.Scanner;
import static java.lang.Math.*;
public class EP2_2
{
  public static void main(String arg[])
  {
    float x1, y1, x2, y2;
    float valorA, valorB;
    float distancia;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    //Scanner processador = new Scanner(System.in);
    System.out.println("Digite o valor de X1 : ");
    x1 = scanner.nextFloat();
    System.out.println("Digite o valor de y1: ");
    y1 = scanner.nextFloat();
    System.out.println("Digite o valor de x2: ");
    x2 = scanner.nextFloat();
    System.out.println("Digite o valor de y2: ");
    y2 = scanner.nextFloat();

    valorA = Math.pow(x2 - x1, 2);
    valorB = Math.pow(y2 - y1, 2);
    distancia = Math.sqrt(valorA + valorB);
    System.out.println("distancia entre dois pontos=  " + distancia);

  }
}


