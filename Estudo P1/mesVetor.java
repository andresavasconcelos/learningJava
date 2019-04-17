import java.util.*;

class mesVetor {
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);

		 String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dec", }; 
		 int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  

		 for(int c = 0; c<mes.length; c++){
		 	System.out.println("O mes e " + mes[c] + " que tem " + totalDias[c] + " dias ao todo");
		 }
	}
}