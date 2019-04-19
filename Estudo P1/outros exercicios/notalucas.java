import java.util.Scanner;
public class EP6_2
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner (System.in);
		int n , b=0 ,acima=0, media ,  soma =0;
		String m;
	//	double soma =0  ;
		System.out.println("digite o tamanho do vertor");
		n = scan.nextInt();
		
		int[] nota= new int [n];
	String [] nome   = new String [n];
		for(int i=0;i<n;++i)
       {	System.out.println("insira " + (i+1)+ " nota ");
        	nota [i]=scan.nextInt();
        	System.out.println("insira " + (i+1)+ " nome ");
        	nome [i]=scan.next();
        	soma= soma + nota[i];
       }
       
       media= soma/n;
		for(int i=0;i<(nota.length-1);++i)
       {	 
        	 if (nota [i]> media)
        	 {  
        	   b = b + i;
        	 }
        		System.out.print("  " + nome[b]  + "   " )	;
       } 	
       
	}   
		
	
}