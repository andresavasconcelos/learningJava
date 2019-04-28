import java.util.*;

//**somente imprimir uma matriz

public class  SomaMatriz {
    public static void main(String[] args){
    		//Scanner entrada = new Scanner(System.in);
    		double[][] notasAlunos = new double[3][3]; // declara as variaveis da matriz aluno x nota
                // linha ** coluna  
    		notasAlunos[0][0] = 8; // primeiro zero é a linha e o segundo é a coluna
    		notasAlunos[0][1] = 8; 
    		notasAlunos[0][2] = 10;  

    		notasAlunos[1][0] = 8;
    		notasAlunos[1][1] = 7;
    		notasAlunos[1][2] = 5;

    		notasAlunos[2][0] = 8;
    		notasAlunos[2][1] = 4;
    		notasAlunos[2][2] = 7;

            int soma; // atribuir o identidade fora do for

            for(int i = 0; i < notasAlunos.length; i++){ // linha
                soma = 0; // atribuir valor dentro da sua linha
                for(int j = 0; j < notasAlunos[i].length; j++){ // coluna
                    soma += notasAlunos[i][j]; // fazer o calculo na coluna
                }
                System.out.println("soma do aluno: " + i +  " a soma e: " + (soma)); // imprimir o calculo dentro da linha
            }


    }
}