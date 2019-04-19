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

