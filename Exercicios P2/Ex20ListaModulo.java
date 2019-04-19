/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex20listamodulo;

/**
 *
 * @author francisco.fraga
 */
public class Ex20ListaModulo {

    public static int numEmpates(int [][] A) {
        
        int nEmp = 0;
        int nLin = A.length;
        int nCol = A[0].length;
        
        if(nCol != 2) {
            System.out.println("Matriz deve ter 2 colunas!");
        }
        else {
            for(int i = 0; i < nLin; i++) {
                if(A[i][0] == A[i][1]) nEmp++;
            }
        }
        return nEmp;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
