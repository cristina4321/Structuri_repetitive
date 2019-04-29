import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        // 15. se dau doua numere n si m, scrieti un program care afiseaza "true" sau "false" (daca n este inversul lui m).
        //exemplu: n = 12, m = 21 => true; n = 10, m = 1 => false

        int invers=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("m = ");

        int m = sc.nextInt();
        boolean rez = true;

        while(n > 0) {
            invers = invers * 10 + n%10;
            n = n/10;
        }
       // System.out.println( n + " " + m + " " +invers);
        if(invers==m)
        {
            System.out.println( rez);
        }
        else
        {
            rez = false;
            System.out.println( rez);
        }

    }
}
