import java.util.*;
//Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8;
//caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5. 
class teste3 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int num1, num2, soma;

		System.out.println("insira valor 1: ");
		num1 = entrada.nextInt();

		System.out.println("insira valor 2: ");
		num2 = entrada.nextInt();

		soma = num1 + num2;

		if(soma > 20){
			System.out.println( soma + 8);
			//System.out.println("Ele nao e maior que 10, logo somou-se 8", soma + 8);
		}else {
			System.out.println(soma - 5);
			//System.out.println("Ele nao e maior que 10, logo subtraiu 5", soma - 5);
		}

	}
}
