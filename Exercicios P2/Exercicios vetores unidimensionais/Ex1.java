import java.util.*;

class Ex1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("digite o valor da posicao " +  i);
			vetorA[i] = entrada.nextInt();
		}

		for(int j = 0; j < vetorA.length; j++){
			vetorB[j] = vetorA[j] * 3;
			System.out.print(vetorB[j] + " ");
		}
	}
}