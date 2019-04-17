import java.util.Scanner;
class EPTESTE

{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    int c, t =0;
    System.out.println("digite o valor de c");
    c = entrada.nextInt();
    if(c=='A')
    {
          System.out.println("valor de t" + t);
          t = t+4;
    }

    if(c=='B')
    {
          t = t+3;
    }

    if(c=='C')
    {
          t = t+2;
    }
    else t = 0;
     System.out.println(t);
  }
}
