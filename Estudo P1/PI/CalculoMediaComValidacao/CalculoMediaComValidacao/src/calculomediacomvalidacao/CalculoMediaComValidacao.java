/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculomediacomvalidacao;

/**
 *
 * @author Projeto BCI
 */
public class CalculoMediaComValidacao {

    public static void main(String[] args) {

        float nota = 0, media = 0, soma = 0; int i = 0; char deseja = 's';

        while (deseja == 's') {
            i++;
            do {
                nota = leiaFloat("Entre com a " + i + ".a nota : ");
            } while (nota < 0 || nota > 10);
            soma += nota; // soma ao acumulador
            do {
                deseja = leiaChar("Deseja continuar? (s/n): ");
                // escreva("deseja = " + deseja);
            } while (deseja != 's' && deseja != 'n');
        }
        media = soma / i;
        escreva("Media das " + i + " notas = " + media);
    }

    public static float leiaFloat(String texto) { System.out.print(texto);
        return new java.util.Scanner(System.in).nextFloat();  }

    public static char leiaChar(String texto) { System.out.print(texto);
        return new java.util.Scanner(System.in).next().charAt(0);  }

    static void escreva(String saida) { System.out.println(saida); }

}
