// - algumas questões de provas teórica/prática


// Um determinado clube de futebol pretende classificar seus atletas em categorias que são definidas dependendo da sua faixa etária, conforme a tabela do slide. Elabore um algoritmo que solicite a Idade, o Nome e o Peso (em kg) de cada atleta. O programa deve parar de solicitar os dados dos atletas quando o usuário digitar 0 (zero) para a Idade do atleta. Após finalizar a leitura dos dados de todos os atletas, o programa deve calcular e imprimir: (1) QUANTIDADE de atletas que estão em CADA categoria; (2) PORCENTAGEM de todos os atletas (INDEPENDENTE da categoria) com peso entre 10,0 e 25,5 kg. Veja um exemplo:


// input=5
// ana
// 25
// 0
// output=
// A quantidade de atletas na categoria infantil: 1
// A quantidade de atletas na categoria juvenil: 0
// A quantidade de atletas na categoria junior: 0
// A quantidade de atletas na categoria profissional: 0
// A porcentagem de atletas com peso entre 10,0 e 25,5 kg: 100.0



// --- Trecho de código

//         . . .  

//         Scanner teclado = new Scanner(System.in);

//         //System.out.print("Digite a idade do atleta: ");

//         idade = teclado.nextInt();

//         while (idade != 0) {

//             //System.out.print("Digite o nome do atleta: ");

//             nome = teclado.next();

//             //System.out.print("Digite o peso do atleta: ");


//             peso = teclado.nextDouble();

//             . . . 

// ---

import java.util.Scanner;                                     
 
 public class EP5_3
 
 {
    public static void main (String args[])               
    {
       Scanner entrada = new Scanner (System.in) ;          
       int idade_final = 22, idade_aluno,  ci = 0, cj = 0, cj2 = 0, cp = 0, i;
       String nome_aluno;

       double peso_aluno, porcentagem , jj = 0 , ii = 0;    

       for(i = 0; i < idade_final; i++){
        
        //System.out.println("Qual sua idade? ");
        idade_aluno = entrada.nextInt();
        if(idade_aluno == 0){break;}
        else if ((idade_aluno >= 5) && (idade_aluno <=10)) {
          ci++;
        }
        else if((idade_aluno >= 11) && (idade_aluno <=15)) {
          cj++;
        }
        else if((idade_aluno >= 16) && (idade_aluno <=20)) {
          cj2++;
        }
        else if(idade_aluno >= 21) {
          cp++;
        }
        
       //System.out.println("Qual seu nome? ");
       nome_aluno = entrada.next();

       //System.out.println("Qual seu peso? ");
       peso_aluno = entrada.nextDouble();

      if(peso_aluno >= 10.0 && peso_aluno <= 25.5){
          jj++;
          ii++;
        }
          else {ii++;}
        }

      porcentagem  = (jj/ii)*100;
      System.out.println("A quantidade de atletas na categoria infantil: " + ci);
      System.out.println("A quantidade de atletas na categoria juvenil: " + cj);
      System.out.println("A quantidade de atletas na categoria junior: " + cj2);
      System.out.println("A quantidade de atletas na categoria profissional: " + cp) ;
      System.out.println("A porcentagem de atletas com peso entre 10,0 e 25,5 Kg: " + porcentagem) ;
      
  }
 }