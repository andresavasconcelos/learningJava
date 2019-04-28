// Problema: média do aluno, ler 3 notas e retornar média
// Entrada/Dados: Ler 3 notas
// Processamento: Lógica para calcular a média
// Saída/Informação: mostrar a média
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
    double nota1, nota2, nota3, media; //double é quando são numero reais e int é para numeros inteiros

    //System.out.println("Digite a nota 1:");
    nota1 = teclado.nextDouble(); //caso fosse um numero inteiro seria nextInt, sempre começando com a letra maiuscula

    //System.out.println("Digite a nota 2:");
    nota2 = teclado.nextDouble();

    //System.out.println("Digite a sia nota 3:");
    nota3 = teclado.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;
    System.out.println("media=" + media);
  }
}