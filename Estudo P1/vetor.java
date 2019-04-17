import java.util.*;

class vetor {
	public static void  main (String[] args){
		Scanner entrada = new Scanner(System.in);

		// int n[] = new int[4];
		// n[0] = 3; // essas linhas de declaração faz exatamente os quadrados de uma tabela 
		// n[1] = 5;
		// n[2] = 8;
		// n[3] = 2;

		int n[] = {3, 2, 8, 7, 5, 4}; //outra maneira de fazer #COMEÇA NA POSIÇÃO 0 E VAI ATÉ A 5

		//System.out.println("total de casas de N: " + n.length); //length é o comprimento e fala o total de casas de n

		//for(int c = 0; c<=5; c++ ){ // o primeiro elemento é o zero e o ultimo é o 5
		for(int c = 0; c<=n.length-1; c++ ){ // o primeiro elemento é o zero e o ultimo é o 5
				System.out.println("na posicao" + c + "temos o valor: " + n[c] + " ");


		}

	}
}