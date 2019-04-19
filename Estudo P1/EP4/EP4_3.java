import java.util.*;
import static java.lang.Math.*;

class Main {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		double valor_parcela, taxa_juros, valor_final;
		int mes; 

		System.out.println("Digite o valor do investimento");
			valor_parcela = entrada.nextDouble();

		System.out.println("Digiteo tempo em meses");
			mes = entrada.nextInt();

		System.out.println("Digite a taxa de juros");
			taxa_juros = entrada.nextDouble();

		valor_parcela = valor_parcela *	Math.pow((1 + taxa_juros/100), mes);

		valor_final = valor_parcela;
		
		for(int i = 0; (i <= mes); i++){
			System.out.println(i*valor_parcela);
		}
		
	}
}