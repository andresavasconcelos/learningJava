import java.util.*;
//Imprimir todos os números de 1 até 100. 

class desafioFor1ate100 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		//System.out.println("comecei");
		
		/*for(int a = 1; a < 101; a++){ // incremento comeca o menor pare o maior
			System.out.println(a);		
		}*/

		for(int a = 100; a > 0; a--){ // decremento comeca o maior pare o maior
			System.out.println(a);			
		}
	}
}