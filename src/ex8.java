import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //8. se dau doua numere naturale a si b. afisati a ^ b (a la puterea b)
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.println(" ");
        System.out.print("b= ");
        int b = sc.nextInt();

        int rezultat = 1;

        for(int i=0;i<b;i++)
        {
            rezultat = rezultat * a;
        }

        System.out.println("a ^ b = " + rezultat);
    }
}
