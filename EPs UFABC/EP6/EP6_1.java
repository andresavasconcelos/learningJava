// vetor com módulo - parte 1

// Ver seção Eficiência de Algoritmos, pg 130 - livro texto

// Faça um programa para ler um vetor de inteiros com N elementos. O valor N deve ser fornecido em tempo de execução. Fazer um método para retornar o maior elemento do vetor e chamar esse método no módulo principal.


// Exemplo:

// Entradas:

// 5

// 6 1 8 2 3

// Saída:

// maior=8

import java.util.*;

class vetorMaior {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int tamanho[] = new int[4];
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

        System.out.println("maior= " + 3);
    }
}