import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("n sayısını giriniz:");
        int n=input.nextInt();

        //üst
        for(int i=1; i <=n ; i++){

            for(int j=1; j <= (n-i) ; j++){
                System.out.print(" ");
            }

            for(int k=1; k <=(2*i) -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //alt
        for(int a=1 ; a <=n ; a++){

            for(int b=0 ; b<= (a-1) ; b++){
            System.out.print(" ");

           }

           for(int c=1; c <= (2*n - (2*a + 1)) ; c++){
            System.out.print("*");

           }

           System.out.println();
        }
    }

}