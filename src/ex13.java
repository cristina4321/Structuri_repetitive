import java.util.Scanner;

public class ex13 {

    //13. se da un numar n. scrieti un program care va afisa de n ori mesajul "go", urmat de gata.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int i=0;

        if(n==0)
        {
            System.out.print("nimic");
        }
        else
        {
            do {
                System.out.println("go");
                i++;
            }while(i<n);

            System.out.println("gata");
        }


    }
}
