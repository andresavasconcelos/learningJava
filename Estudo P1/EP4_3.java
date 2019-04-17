import java.util.*;
import static java.lang.Math.*;

//Escreva um programa que leia três dados: investimento inicial (I), Taxa de juros (J) e número de meses (N); em seguida calcule e exiba uma tabela de juros compostos, com o valor total do investimento corrigido do mês zero até o mês selecionado. Dica: procure saber mais sobre “saída formatada”. Veja Exemplo no Slide

class EP4_3 {
  public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);

    double valor_parcela, taxa_juros, valor_final, p;
    int mes; 

    System.out.println("Digite o valor do investimento");
      valor_parcela = entrada.nextDouble();

    System.out.println("Digite a taxa de juros");
      taxa_juros = entrada.nextDouble();

    System.out.println("Digiteo tempo em meses");
      mes = entrada.nextInt();  
    
    System.out.printf("%s%20s%20s%20s\n", "Mes", "Juros no Mes (%)", "Juros Total (%)", "Investimento");

    p = taxa_juros/100;
    
    for(int i = 0; (i < mes); i++){
      //calcula o valor final ajustado no mes
      valor_final = valor_parcela * Math.pow((1 + taxa_juros/100), i);

      //imprime o mes atual
      System.out.print(i+" ");

      //imprime a taxa de juros de entrada
      System.out.printf("%11.2f", taxa_juros);

      //aqui foi calculado a taxa de juros do mês com relação ao valor inicial.
      //o primeiro int que está na frente da equação força o resultado a ser convertido para inteiro, assim perdendo as casas decimais
      //o float do lado de fora força ele a voltar a ser float

      //System.out.printf("%20.2f", (float)((int)((valor_final - valor_parcela)/valor_parcela*100)));

      p = taxa_juros*i;

      System.out.printf("%22.2f", p);
      
      //imprime o valor corrigido
      System.out.printf("%24.2f\n",valor_final);
    }
  }
}
