import java.util.*;
//ler um vetor com 5 posição e o valor de A tem que ser o valor de B
class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
    int[] vetorA = new int[5]; // primeir posição começa com o
    int[] vetorB = new int[5];

    for(int i = 0; i < vetorA.length; i++){
        System.out.println("Insira entre com o valor da posição: " + i);
        vetorA[i] = entrada.nextInt();

      vetorB = vetorA; 
    }
    System.out.println("valor do vetor A: ");
    for(int i = 0; i < vetorA.length; i++){
      System.out.println(vetorA[i] + " ");
    }

    System.out.println("valor do vetor B: ");
    for(int i = 0; i< vetorB.length; i++){
      System.out.println(vetorB[i] + " ");
    }
    }
}