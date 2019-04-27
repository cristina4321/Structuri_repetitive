import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // 7. se da un numar natural n. afisati suma cifrelor numarului 2 * 3 ^ n (2 inmultit cu 3 la puterea n).

        int putere=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar natural (n):");
        int n = sc.nextInt();
        System.out.println(" ");

        for(int i=0;i<n;i++)
        {
            putere = putere * 3;
        }

        int rezultat = 2*putere;

        System.out.print("Suma cifrelor " + rezultat );

        int suma = 0;
        while (rezultat > 0) {
            suma = suma + rezultat % 10;
            rezultat = rezultat / 10;
        }
        System.out.println(" este " + suma);

    }
}
