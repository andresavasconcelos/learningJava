// Problema: m�dia do aluno, ler 3 notas e retornar m�dia
// Entrada/Dados: Ler 3 notas
// Processamento: L�gica para calcular a m�dia
// Sa�da/Informa��o: mostrar a m�dia
// Exemplo:
// input=3
// 4
// 5
// output=media=4.0

import java.util.*;
class EP1_2
{
	public static void main(String args[])
  {
    Scanner teclado = new Scanner(System.in);
    double nota1, nota2, nota3, media; //double � quando s�o numero reais e int � para numeros inteiros

    //System.out.println("Digite a nota 1:");
    nota1 = teclado.nextDouble(); //caso fosse um numero inteiro seria nextInt, sempre come�ando com a letra maiuscula

    //System.out.println("Digite a nota 2:");
    nota2 = teclado.nextDouble();

    //System.out.println("Digite a sia nota 3:");
    nota3 = teclado.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;
    System.out.println("media=" + media);
  }
}