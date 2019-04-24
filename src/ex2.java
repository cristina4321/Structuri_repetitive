import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti nr:");
        int  nr_natural = sc.nextInt();
        // se da un numar natural n, (alegeti un int la intamplare).
        //sa se determine numarul de termeni din sirul de transformari dupa regula data.
        //pentru n = 6, se trece prin pasii n = 6, n = 3, n = 10, n = 5, n = 16, n = 8, n = 4, n = 2, n = 1

        int[] vectorNrNaturale = new int [] {6,3,10,5,16,8,4,2,1};

      //  for (int i=0;i<vectorNrNaturale.length;i++) {

            if (nr_natural % 2 == 0) {
                System.out.println(nr_natural + " Este par");
                nr_natural = nr_natural / 2;
                System.out.println(" Noul nr este " + nr_natural);
            } else {
                System.out.println(nr_natural + " Este impar");
                nr_natural = (3 * nr_natural) + 1;
                System.out.println(" Noul nr este " + nr_natural);
            }






    }
}
