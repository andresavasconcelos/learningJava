// Problema: Escreva um programa para ler duas variáveis inteiras A e B. O programa deve trocar os valores lidos. No final da execução, A deverá ter o valor de B, e B o de A. A saída do programa deve escrever ("A="+A+" e B="+B).
// Entrada/Dados: Ler 2 inteiros A e B
// Processamento: Lógica para inverter
// Saída/Informação: escrever ("A="+A+" e B="+B)

import java.util.*;
class EP1_3
{
	public static void main(String args[])
  {
    Scanner teclado= new Scanner(System.in);
        int a, b; //double é quando são numero reais e int é para numeros inteiros

    //System.out.println("Digite o valor de A:");
    a = teclado.nextInt(); //caso fosse um numero inteiro seria nextInt, sempre começando com a letra maiuscula

    //System.out.println("Digite o valor B:");
    b = teclado.nextInt();
        
    System.out.println("A =" + b + " e B =" + a);
  }
}
