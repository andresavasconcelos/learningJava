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

