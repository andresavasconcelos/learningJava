import java.util.*;
class EP2_1 {

	public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, delta;
    
          a = entrada.nextInt();     
          b = entrada.nextInt();  
          c = entrada.nextInt(); 
          delta = (b*b) - (4*a*c);
        
        System.out.println("O delta de ax*x + bx + c e " + delta);
          
     }
}