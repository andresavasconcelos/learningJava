import java.util.Scanner;                           					
 
 public class Main
 
 {
    public static void main (String args[])          			
    {
        Scanner entrada = new Scanner (System.in) ;  				
       float idade_aluno, peso_aluno, ci = 0, cj = 0, cj2 = 0, cp = 0;
       String nome_aluno;
       
       do{                                                            
        System.out.println("Qual sua idade? ");
        idade_aluno = entrada.nextFloat();
        if ((idade_aluno == 0) && (idade_aluno <5)) {
        } 
        else {
            System.out.println("Insira o nome: ");
            nome_aluno = entrada.next();
            System.out.println("Insira o peso: ");
            peso_aluno = entrada.nextFloat();
            
            if (idade_aluno >=21)							
            {  	cp = cp + 1; 	
            }
            else if (( idade_aluno < 21) && ( idade_aluno >= 16))
              { cj2 = cj2 + 1;
              }
            else if ((idade_aluno < 16) && (idade_aluno >= 11))			 // SE	
              {  cj = cj + 1;
              } 
            else if ((idade_aluno < 10) && (idade_aluno >= 5))	
              {	ci = ci + 1;
              }								 
          }
          } while ((idade_aluno !=0) && (idade_aluno > 5));
          System.out.println("A quantidade de atletas na categoria infantil: " + ci);
          System.out.println("A quantidade de atletas na categoria juvenil: " + cj);
          System.out.println("A quantidade de atletas na categoria junior: " + cj2);
          System.out.println("A quantidade de atletas na categoria profissional: " + cp) ;
      }
  }