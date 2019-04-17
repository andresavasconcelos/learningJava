import java.util.*;
//Entrar comum número e informarse ele é divisívelpor 10, por 5, por2 ouse não é
//divisível por nenhum destes. 
class teste4 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");
		num = entrada.nextInt();

		if(num % 10 == 0){
			System.out.println(num + " E divisivel por 10");
		}
			else if(num % 5 == 0) {
				System.out.println(num + " E divisivel por 5");
			}
			else if (num % 2 == 0){
				System.out.println(num + " E divisivel por 2");
			}
			else{
				System.out.println(num + " nao e divisivel por nada");
			}
		
	}
}