import java.util.*;

//**somente imprimir uma matriz

public class  MediaAlunos {
    public static void main(String[] args){
    		//Scanner entrada = new Scanner(System.in);
    		double[][] notasAlunos = new double[3][3]; // declara as variaveis da matriz aluno x nota

    		notasAlunos[0][0] = 8;
    		notasAlunos[0][1] = 8;
    		notasAlunos[0][2] = 10;

    		notasAlunos[1][0] = 8;
    		notasAlunos[1][1] = 7;
    		notasAlunos[1][2] = 5;

    		notasAlunos[2][0] = 8;
    		notasAlunos[2][1] = 4;
    		notasAlunos[2][2] = 7;


            double soma;

    		for(int i = 0; i < notasAlunos.length; i++){ // linha
                soma = 0;
    			for(int j = 0; j < notasAlunos[i].length; j++){ // coluna
                    soma += notasAlunos[i][j];
    			}
    			System.out.println("a media do aluno da posicao: " + i + " e " + (soma/3));
    		}


    }
}