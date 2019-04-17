import java.util.Scanner;
class EP5_2
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, e, media;
		System.out.println("Digite o valor de a: ");
		a = teclado.nextInt();

		System.out.println("Digite o valor de b: ");
		b = teclado.nextInt();

		System.out.println("Digite o valor de c: ");
		c = teclado.nextInt();

		System.out.println("Digite o valor de d: ");
		d = teclado.nextInt();

		System.out.println("Digite o valor de e: ");
		e = teclado.nextInt();

		media = (a + b + c + d + e) / 5 ;

	    if ((media < a) && (a % 2 == 0))
	    {
	      System.out.println(a);
	    }

	     if ((media < b) && (b % 2 == 0))
	    {
	      System.out.println(b);
	    }

	     if ((media < c) && (c % 2 == 0))
	    {
	      System.out.println(c);
	    }

	    if ((media < d) && (d % 2 == 0))
	    {
	      System.out.println(d);
	    }

	     if ((media < e) && (e % 2 == 0))
	    {
	      System.out.println(e);
	    }
	    
	}
}








	
	}
}