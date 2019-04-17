import java.util.*;

class Ex2 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int maior = 0, vetor;

		System.out.println("digite o tamanho do vetor: ");
		vetor = entrada.nextInt();

		int[] num = new int[vetor];

		for(int i = 0; i < num.length; i++){
			System.out.println("Digite a posição do vetor: " + i);
			num[i] = entrada.nextInt();
		}

		for(int j = 1; j < num.length; j++){ // quando for verificar numero maiores o contador tem que começar com 1 e não com zero
			if(num[j] > maior){
				maior = num[j];
			}
			System.out.println("o maior valor e: " + maior);
		}

	}
}