import java.util.Scanner;                     
public class EP3_1                            
{                   
      public static void main (String[]args)  
    {
        Scanner scan = new Scanner(System.in);
        int a ,b , c;                                 
       a = scan.nextInt();                          
       b = scan.nextInt();                           
       c = scan.nextInt();                           
     
      if  ((a > b) && (b > c))                       // fun��o SE 
        {  System.out.println(c + ","+ b + "," +a ); 
        }
     
       else                                          // SENAO
       if ((a > c) && (c > b))
        {  System.out.println(b + ","+ c + "," +a ); 
        }
        
     
         else                                        // SENAO
       if ((b > a) && (a > c))
        {  System.out.println(c + ","+ a + "," +b );  
        }
     
        else
        if  ((b > c) && (c > a))                     // fun��o SE 
        {  System.out.println(a + ","+ c + "," +b ); 
        }
     
       else                                          // SENAO
       if ((c > a) && (a> b))
        {  System.out.println(b + ","+ a + "," +c );  
        }
     
         else                                        // SENAO
       if ((c > b) && (b > a))
        {  System.out.println(a + ","+ b + "," +c ); 
        }
        
        
    }  
}