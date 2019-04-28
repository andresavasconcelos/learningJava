import java.util.*;

//aqui devemos entrar com um numero e verificar se ele é maior que 20

class teste1 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Entre com um numero");
		num = entrada.nextInt();

		if(num > 20){
			System.out.println("o numero e: " + num);
		}else{
			System.out.println("Ele nao e maior que 20 :(");
		}
	}
}