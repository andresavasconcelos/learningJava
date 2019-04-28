// algumas questões de provas teórica/prática


// Escreva um programa para ler 5 valores inteiros positivos. Imprimir apenas os valores pares maiores que a média dos valores lidos. Veja exemplo


// input=1
// 2
// 3
// 4
// 5
// output=par maior que a media: 4

import java.util.Scanner;
import java.util.Scanner;
class EP5_2
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, e, media;
		//System.out.println("Digite o valor de a: ");
		a = teclado.nextInt();

		//System.out.println("Digite o valor de b: ");
		b = teclado.nextInt();

		//System.out.println("Digite o valor de c: ");
		c = teclado.nextInt();

		//System.out.println("Digite o valor de d: ");
		d = teclado.nextInt();

		//System.out.println("Digite o valor de e: ");
		e = teclado.nextInt();

		media = (a + b + c + d + e) / 5 ;

	    if ((media < a) && (a % 2 == 0))
	    {
	      System.out.println("par maior que a media: " + a);
	    }

	     if ((media < b) && (b % 2 == 0))
	    {
	      System.out.println("par maior que a media: " + b);
	    }

	     if ((media < c) && (c % 2 == 0))
	    {
	      System.out.println("par maior que a media: " + c);
	    }

	    if ((media < d) && (d % 2 == 0))
	    {
	      System.out.println("par maior que a media: " + d);
	    }

	     if ((media < e) && (e % 2 == 0))
	    {
	      System.out.println("par maior que a media: " + e);
	    }
	}
}
