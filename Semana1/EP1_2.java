import java.util.*;
class EP1_2
{
	public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, nota3, media; //double é quando são numero reais e int é para numeros inteiros

    System.out.println("Digite a nota 1:");
    nota1 = entrada.nextDouble(); //caso fosse um numero inteiro seria nextInt, sempre começando com a letra maiuscula

    System.out.println("Digite a nota 2:");
    nota2 = entrada.nextDouble();

    System.out.println("Digite a sia nota 3:");
    nota3 = entrada.nextDouble();

    media = (nota1 + nota2 + nota3)/ 3 ;
    System.out.println("a nota final é: " + media);
  }
}

