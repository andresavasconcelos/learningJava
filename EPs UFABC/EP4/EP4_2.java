//  - repetição com módulo



// codeEx4.3  - livro texto


// Faça um programa para verificar se um número n entrado pelo teclado é primo. Isto pode ser feito dividindo sucessivamente o número entrado por valores i, onde i varia de 2 até n-1, e verificando o resto da divisão. Se n%i (resto da divisão de n por i) for zero para qualquer i, exiba a mensagem "nao e primo!". Caso a condição anterior não ocorra, exiba a mensagem "numero primo!".
import java.util.Scanner;

public class EP4_2 {
	public static void main(String[] args)
	{
		Scanner entrada =  new Scanner (System.in);  	
		int num;
		boolean n = true;
						
		//System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
		for(int i=2; i < num; i++) {
			if(num%i == 0)
			{
				n = false;
				break;
			}}
			
			if(n)
			{
				System.out.println(" numero primo");
			}else {
				System.out.println( " nao e primo");
			}
						
		
	}

}