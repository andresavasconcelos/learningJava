import java.util.Scanner;
class EP5_3

{
  public static void main(String[] args)
  {
    Scanner teclado = new Scanner (System.in);

    double idade, peso, i, j, m, k;
    String nome;
    
    System.out.println("Digiete a idade");
    idade = teclado.nextDouble();

    while(idade > 0)
    {
      System.out.println("Digite o nome");
      nome = teclado.next();

      System.out.println("Digite o peso");
      peso = teclado.nextInt();

      if(idade == 0 )
      {
        break;
      }
    }
  }
}
