class EP4_1 {
  public static void main(String[] args) {
    int i = 1;
    while(i < 4 && i % 3 == 0)
    {
      System.out.println(i);
      ++i;
    }
  }
}



************** TESTE NET************
class Main {
  public static void main(String[] args) {
		for(int i=0;i<=100;i++){//todos os n�meros inteiros de 0 a 100
			if(i % 3 == 0)//o simbolo % tem como resultado o resto da divis�o entre 2 n�meros, neste caso i/3
				System.out.println(i);			
		}
	}
}
