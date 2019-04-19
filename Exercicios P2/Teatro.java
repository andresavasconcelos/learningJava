/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

/**
 *
 * @author francisco.fraga
 */
public class Teatro 
{

    static String teatro [][];
    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    static String[][] inicio(int nfilas, int ncadeiras) 
    {
        String m[][] = new String[nfilas][ncadeiras];
        for (int i = 0; i < m.length; i++) 
        { // linhas i
          for (int j = 0; j < m[0].length; j++) 
          { // coluna j
            //System.out.print("Digite o elemento real "+i+","+j+": ");    
            m[i][j] = "LIVRE"; //  elemento i,j
          }
        }
        return m;
    }

    static boolean vender(int fila, int cadeira) 
    {
        if(teatro[fila][cadeira].equalsIgnoreCase("LIVRE"))
        {
            System.out.print("Digite o nome do cliente: ");
            String cliente = scanner.next();
            teatro[fila][cadeira] = cliente;
            System.out.println("Cadeira vendida para "+cliente);
            return true;
        }    
        else
        {
            System.out.println("Cadeira já vendida, escolha outra!");
            return false;
        }    
            
    }

    static boolean livre(int fila, int cadeira) 
    {
        if(teatro[fila][cadeira].equalsIgnoreCase("LIVRE"))
           return true;
        else
           return false;
    }
    
    static int[] consecutivas(int fila) 
    {
        int numLivres = 0, j = 0;
        int iniMax=0, iniLivre = 0, maxLivres = 0; 
        while(j < teatro[0].length) 
        { 
            if(livre(fila,j))
            {   
                iniLivre = j;
                while(livre(fila,j))
                {
                    j++; numLivres++; 
                    if(j == teatro[0].length)
                        break;
                }    
            }  
            else
                j++;
            // System.out.println("j = "+j);
            if(numLivres > maxLivres)
            {
               maxLivres =  numLivres;
               iniMax = iniLivre;
            }    
                
        }
        int [] vetLivres = new int[maxLivres];
        for (int i = 0; i < vetLivres.length; i++)
            vetLivres[i] = iniMax + i;
        return vetLivres;
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.print("Digite o numero de filas do teatro: ");
        int F = scanner.nextInt();
        System.out.print("Digite o numero de cadeiras de cada fila: ");
        int C = scanner.nextInt();        
        teatro = inicio(F,C);

        int mais = 0;
        do
        {
            System.out.print("Escolha o numero da fila: ");
            int fila = scanner.nextInt();
            System.out.print("Escolha o numero da cadeira: ");
            int cadeira = scanner.nextInt();
            vender(fila,cadeira);
            System.out.println("Deseja comprar mais ingressos? (1=sim, 0=nao): ");
            mais = scanner.nextInt();
            
        } while (mais == 1); 
        
        for (int i = 0; i < teatro.length; i++)
        {
           int [] livres = consecutivas(i);
           System.out.println("A fila "+i+" tem as seguintes cadeiras livres consecutivas:");
           for (int j = 0; j < livres.length; j++)
             System.out.print(livres[j]+" "); 
           System.out.println();
        }
   

    }
    
}
