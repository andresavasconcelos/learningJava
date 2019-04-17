import java.util.*;

// Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o resultado seja maior que 10, apresentá-lo. 

class teste2 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int num1, num2, soma;

		System.out.println("Digite o primeiro numero:");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo numero:");
		num2 = entrada.nextInt();

		soma = num1 + num2;

		if(soma > 10){

			System.out.println("o valor e maior que 10, logo e:" + soma);

		}else {
			System.out.println("a media nao e maior que 10");
		}


	}
}