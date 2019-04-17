import java.util.*;

class vetorMaior {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int tamanho[] = new int[5];
		int maior = 0;
		

		for(int i = 0; i < tamanho.length; i++){
			//System.out.println("digite valor do vetor: ");
			tamanho[i] = entrada.nextInt();
		}

		for(int cont = 0; cont < tamanho.length; cont++){
			if(tamanho[cont] > maior){
				maior = tamanho[cont];
			}
		}		

		System.out.println("o valor maior e: " + maior);
	}
}