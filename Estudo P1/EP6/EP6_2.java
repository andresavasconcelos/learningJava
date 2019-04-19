import java.util.*;
class EP6_2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
     int  num, somaAluno = 0 ;
     double media, soma = 0 ;
     //System.out.println("digite a quantidade de componentes: ");
     num = entrada.nextInt();
     int[] nota = new int[num];
     String[] nome = new String[num];

     for(int i = 0; i < nota.length; i++){
       //System.out.println("Digite o nota da posição: " + i+1);
        nota[i] = entrada.nextInt();
         soma = soma + nota[i];
     }
     
      for(int k = 0; k < nome.length; k++){
            //System.out.println("Digite o nome da posição: " + j+1);
        nome[k] = entrada.next();
        }
      media = soma / num;
     System.out.println(media);
     
     for(int i = 0; i < nota.length; i++){
       if( nota[i] > media){
            somaAluno =  i;
            System.out.println("As notas mais altas correspondem: " + nome[somaAluno]);
       }
     }
      
    }
}