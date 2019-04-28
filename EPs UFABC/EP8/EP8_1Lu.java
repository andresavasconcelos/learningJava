EP8_3Lupublic class Main
    static java.util.Scanner scan = new java.util.Scanner(System .in);
    public static void main (String [] args)
    {
        int l , c ;
    //	 System.out.print("digite a quantidade de linhas ");
        l=scan.nextInt();
    //	 System.out.print("digite a quantidade de colunas ");
        c=scan.nextInt();
        int matriz[][]=LerMatriz(l,c);
        int saidas[][]=ordem(matriz);
        imprimirMatriz(matriz);
    }
      public static void   imprimirMatriz(int saidas [][])
  {
        for (int i = 0; i < saidas.length; i++) 
        { 
        for (int j = 0; j < saidas[i].length; j++) 
        {
            System.out.print(saidas[i][j] + " ");
        }
          System.out.println();
      }
  }
    public static int [][] ordem (int [][] matriz )
    { 
          for (int i=0; i < matriz.length;i++)								//linha
          {int aux =0 ;
          for(int j=0 ; j < (matriz[i].length);j++)//coluna
          {			
            for(int l=0 ; l < matriz.length;l++)							
            {						
              for (int k=l+1;(k<matriz.length+1);k++){
                if (matriz[i][l]>matriz [i][k])
                  {	
                            aux = matriz[i][l];
                      matriz[i][l] = matriz[i][k];
                    matriz[i][k] = aux;

                  }
        
              }
            }
          }
      
          }
            return matriz;
    }
    public static int [][] LerMatriz (int l , int c)
    {
        int matriz[][] = new int [l][c];
        for (int i=0; i < matriz.length;i++)				// linha
        {
            for(int j=0 ; j < matriz[0].length;j++)			//coluna
            {
                //		System.out.print("Digite o elemento real "+i+","+j+": ");    
          matriz[i][j] = scan.nextInt();
            }
        }
          
        return matriz;
    }
    
}