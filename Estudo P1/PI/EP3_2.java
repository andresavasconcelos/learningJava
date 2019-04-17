import java.util.Scanner;
public class EP3_2       
{
      public static void main (String[]args)         
	{
        Scanner scan = new Scanner(System.in);       
	 double m , h , imc , a;							 
    	
    	
    		a=scan.nextDouble();					 
    		m=scan.nextDouble();					 
    		h= (a/100);								 
    		imc= m/(Math.pow(h,2));				     
    		if (imc<=18.5)							 
			{  System.out.println("Magro");			 
			}
			else								     
			if ((imc > 18.5) && (25 >= imc))	     
    		 { System.out.println("SAUDAVEL");		 
    		 }
    		 	else								 
			if ((imc > 25) && (30 >= imc))			 
    		 { System.out.println("Acima do peso");	 
    		 }
    		 
    		 	else								 
			if ((imc > 30) && (35 >= imc))			 
    		 { System.out.println("Obeso");			 
    		 }
    		 	else								 
			if (imc > 35)						 	 
    		 { System.out.println("Morbidez");		 
    		 }
	}
}