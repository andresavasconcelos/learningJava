import java.util.*;

class vetorMedia {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		//inserir o tamanho do vetor e contados e o contador para verificar a maior media
		int c = 0, TAMANHO = 10;

		double soma = 0, media;

		//inserir o valor do vetor
		double notas[] = new double[TAMANHO];

		for(int i = 0; i < TAMANHO; i++){
			System.out.println("digite o valor da nota: ");
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i];
		}

		media = soma/TAMANHO;

		//System.out.print("o valor final da media: " + media);


		//verificar quantos estão acima da media
		for(int i = 0; i < TAMANHO; i++) {
			if(notas[i] > media){
				c++;
			}			
		}

		System.out.print("o valor final da media: " + media + " quantos estão acima da media: " + c);

	}
}