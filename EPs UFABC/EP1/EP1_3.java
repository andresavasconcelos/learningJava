// Problema: Escreva um programa para ler duas vari�veis inteiras A e B. O programa deve trocar os valores lidos. No final da execu��o, A dever� ter o valor de B, e B o de A. A sa�da do programa deve escrever ("A="+A+" e B="+B).
// Entrada/Dados: Ler 2 inteiros A e B
// Processamento: L�gica para inverter
// Sa�da/Informa��o: escrever ("A="+A+" e B="+B)

import java.util.*;
class EP1_3
{
	public static void main(String args[])
  {
    Scanner teclado= new Scanner(System.in);
        int a, b; //double � quando s�o numero reais e int � para numeros inteiros

    //System.out.println("Digite o valor de A:");
    a = teclado.nextInt(); //caso fosse um numero inteiro seria nextInt, sempre come�ando com a letra maiuscula

    //System.out.println("Digite o valor B:");
    b = teclado.nextInt();
        
    System.out.println("A =" + b + " e B =" + a);
  }
}
