import java.util.*;

class Ex3 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		int vetor;
		System.out.println("digite a quantidade do vetor: ");
		vetor = entrada.nextInt();

		int[] num = new int[vetor];

		for(int i =0; i < num.length; i++){
			System.out.println("digite o valor da posicao: " + i);
			num[i] = entrada.nextInt();
		}

		for(int j = 0; j < num.length; j++){
			if(num[j] % 2 == 0){
				System.out.println("numero e par" + " " + num[j]);
			} else {
				System.out.println("numero e impar" + " " + num[j]);
			}
		}

		// for(int k = 0; k < num.length; k++){
		// 	if(num[k] % 2 != 0){
		// 		System.out.println("numeros impar" + " " + num[k]);
		// 	}
		// }

	}
}