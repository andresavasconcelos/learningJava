import java.util.Scanner;
class EP3_1
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            int a, b, c;

            System.out.println("");
                a = teclado.nextInt();
            System.out.println("");
                b = teclado.nextInt();
            System.out.println("");
              c = teclado.nextInt();

            if(a < b){
                    if(b < c){
                            System.out.println( "" + a + "," + b + "," + c);
                        }
                        else if (a < c){
                            System.out.println("" + a + "," + c + "," + b);
                        } else {
                            System.out.println( "" + c + "," + a + "," + b);
                        }
                    }
                    else if(b < c){
                        if (a < b) {
                            System.out.println( "" + b + "," + a + "," + c);
                        } else {
                            System.out.println( "" + b + ", " + c + ", " + a);
                        }
                    } else{
                        System.out.println( "" + c + ", " + b + ", " + a);
                        }
    }

}

import java.util.Scanner;
class EP3_1
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            int a, b, c;

            System.out.println("");
                a = teclado.nextInt();
            System.out.println("");
                b = teclado.nextInt();
            System.out.println("");
              c = teclado.nextInt();

            if(a < b && b < c){
                    System.out.println( "" + a + "," + b + "," + c);
                }else if (b < a && a < c){
                    System.out.println("" + b + "," + a + "," + c);
                } else if (c < a && a < b) {
                    System.out.println( "" + c + "," + a + "," + b);
                } else if (c < b && b < a) {
                    System.out.println( "" + c + "," + b + "," + a);
                } else if (b < c && c < a) {
                    System.out.println( "" + b + "," + c + "," + a);
                }



    }

}

#################################

import java.util.Scanner;
class EP3_1
{
     public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
            int a, b, c;

            System.out.println("");
                a = teclado.nextInt();
            System.out.println("");
                b = teclado.nextInt();
            System.out.println("");
              c = teclado.nextInt();

           if(a < b) {
                if(b < c){
                    System.out.println("" + a + "," + b + "," + c);
                }
                else if(a < c) {
                    System.out.print("" + b + "," + c + "," + b)
                } else{
                    System.out.print("" + c + "," + a + "," + b)
                }
           }
           else if(b < c){
                if(a < c){
                    System.out.print("" + b + "," + a + "," + c)
                } else{
                       System.out.print("" + b + "," + c + "," + a)
                }
           } else {
                  System.out.print("" + c + "," + b + "," + a)
            }

    }

}
































