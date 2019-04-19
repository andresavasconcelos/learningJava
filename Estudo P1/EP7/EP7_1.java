import java.util.*;
class EP7_1 {
	public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         int  vetor; // vetor que receberá a quantidade de repetição
         int[] contador = new int[10]; //contador que tem a quantidade maxima de posição
        
         System.out.println("digite a quantidade de componentes que seja entre 0 e 9: ");
         vetor = entrada.nextInt();
         int[] v = new int[vetor]; // v recebe a quantidade de vetor que será usado no for

         if((vetor < 0) || ( vetor > 10)){
           System.out.println("Ops! digite a quantidade de componentes que seja entre 0 e 9: ");
         vetor = entrada.nextInt();
         }

         for(int j = 0; j < v.length; j++){
           System.out.println("digite o valor da posicao: " + j); // posição de numero 0, posição de numero 1
           v[j] = entrada.nextInt(); // o v pegará aquela posição e armazenará 
         }

         for(int k = 0; k < v.length; k++){ // o k inicia-se em 0. EX: entrada 2[0] 2[1] 3[2] 3[3] = 4 numeros
              contador[v[k]] += 1; // como o numero dois está com o valor v = 2 por 2 vezes, logo o contador recebe o valor de 2
              // v[0] = 2 e o contador[2] = 1 (uma vez que passou o 2). quando o contador é 1 então o k é 1
            System.out.print(contador[v[k]] + " ");
         }

         for(int l = 0; l < contador.length; l++){
              if(l != l){ // quando os numeros não forem iguais ele atribui l como 0 e isso ocorrerá 11 vezes pq o contador tem 11 posições
                l = 0;
              }
          System.out.print(contador[l] +  " ");
         }
	}
}