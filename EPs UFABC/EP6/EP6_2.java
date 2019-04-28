// Aula: 01.04 - EP6 - vetor com módulo - parte 1


// codeEx5.18 - adaptado - livro texto

// Faça um programa para ler a nota e o nome da classe, considerando N alunos. 

// Calcular a média da classe a partir da nota de seus N alunos. 

// Finalmente, escrever quais alunos conseguiram nota acima da média da classe.


// Exemplo:

// Entradas: 5

// 6 1 8 2 3

// Ana Maria Paula Raul Vitor

// Saídas: Ana Paula



import java.util.*;
class EP6_2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
     int  num, somaAluno = 0 ;
     double media, soma = 0 ;
     //System.out.println("digite a quantidade de componentes: ");
     num = entrada.nextInt();
     int[] nota = new int[num];
     String[] nome = new String[num];

     for(int i = 0; i < nota.length; i++){
       //System.out.println("Digite o nota da posição: " + i+1);
        nota[i] = entrada.nextInt();
         soma = soma + nota[i];
     }
     
      for(int k = 0; k < nome.length; k++){
            //System.out.println("Digite o nome da posição: " + j+1);
        nome[k] = entrada.next();
        }
      media = soma / num;
     System.out.println(media);
     
     for(int i = 0; i < nota.length; i++){
       if( nota[i] > media){
            somaAluno =  i;
           // System.out.println("As notas mais altas correspondem: " + nome[somaAluno]);
           System.out.println(nome[somaAluno]);
       }
     }
      
    }
}