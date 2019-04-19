
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
