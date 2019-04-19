/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15listamodulo;

/**
 *
 * @author francisco.fraga
 */
public class Ex15ListaModulo {

    static void imprimirMedias(String [] alunos,double [][] notas) {
        
        int nAlunos = alunos.length;
        int nCol = notas[0].length;
        int nLin = notas.length;
        
        if (nAlunos != nLin) {
            System.out.println("Numero de alunos deve ser igual ao numero de notas!");
        } else {
            if (nCol != 2) {
                System.out.println("Matriz de notas deve ter 2 colunas!");
            } else {
                System.out.printf("Aluno\tMedia\n");
                for (int i = 0; i < nAlunos; i++) {
                    double media = (notas[i][0] + notas[i][0]) / 2.0;
                    System.out.printf("%s\t%.2f\n", alunos[i], media);
                }
            }
        }
        
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
