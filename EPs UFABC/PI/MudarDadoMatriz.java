import java.util.*;

//**somente imprimir uma matriz

public class  MudarDadoMatriz {
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


    		// for(int i = 0; i < notasAlunos.length; i++){
    		// 	for(int j = 0; j < notasAlunos[i].length; j++){
    		// 		System.out.println(notasAlunos[i][j] + " ");
    		// 	}
    		// 	System.out.println(); // para ter uma linha para cada looping do for
    		// }

            notasAlunos[1][3] = 8;

            for(int i = 0; i < notasAlunos.length; i++){ // linha
                for(int j = 0; j < notasAlunos[i].length; j++){ // coluna
                    System.out.println(notasAlunos[i][j] + " ");
                }
                System.out.println(); // para ter uma linha para cada looping do for
            }


    }
}